package game_page;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import constants.Constants_GamePanel;
import constants.Constants_GamePanel.*;
import data_managements.ConfirmStack;
import data_managements.Database;
import data_managements.MaterialQueue;
import frames.ViewController;
import thread.*;
// 메인 게임 패널로 게임을 하는 클래스
public class Game_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private int score;
	private JButton button;
	private MaterialQueue queue = new MaterialQueue();
	private ButtonActionListner actionHandler;
	private Game_Panel_Piece current_Panel[];
	private Game_Pause_Panel pause;
	private Game_LevelTest levelLable;
	private Arrow_Panel arrowPanel;
	private Arrow_Thread arrowThread;
	private ViewController viewController;
	private ConfirmStack stack;
	// 배경을 이미지로 입히고 일시정지했으면 바꾸기 위한 변수등
	private ImageIcon icon; 
	private Image normalImage;
	private Image grayImage;
	private ImageIcon icon2;
	private ImageIcon icon1;
	
	Database da = new Database();
	
	// 게임 메인 패널의 배경 이미지와 점수 부분을 그려주는 메소드
	public void paintComponent(Graphics g) {
		// 배경 부분
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);// 그림을 표시하게 설정,투명하게 조절
		super.paintComponent(g);
		// 점수 부분
		g.setFont(new Font("Defualt", Font.BOLD, 25));
		g.setColor(Color.green);
		g.drawString("SCORE : " + score, 550, 65);
		g.setFont(new Font("Defualt", Font.BOLD, 50));
		g.setColor(Color.black);
		if(da.getMax()>score){
			g.drawString("MAX : " + da.getMax(), 10, 680);
		} else{
			g.drawString("MAX : " + score, 10, 680);
		}
	}
	// 생성자 메소드로 ViewController를 받아서 끝내는 화면이나 재시작 화면을 위한 컨틀로러를 받는다.
	public Game_Panel(ViewController viewController) {
		this.setLayout(null); // 레이아웃을 null로 선언 하면서 자유로운 위치에 만들어지도록 한다.	
		
		this.viewController = viewController;
		stack = new ConfirmStack();
		actionHandler = new ButtonActionListner();
		for(int i=1; i<=5; i++){ queue.enqueue(i); } // 원형큐로 재료를 순차적으로 넘기기 위해 사용
		// 배경화면에 사용할 변수들 초기화하는 부분
		icon = new ImageIcon(Constants_GamePanel.BACKGROUND_GAMEPANEL); 
		normalImage = icon.getImage();
		grayImage = GrayFilter.createDisabledImage(normalImage);
		icon2 = new ImageIcon(grayImage);
		icon1 = icon;
		// 레벨 부분
		levelLable = new Game_LevelTest();
		levelLable.initialize();
		this.add(levelLable.getLevel());
		// 버튼 추가하는 곳
		for(EGamePanelButton eGamePanelButton: EGamePanelButton.values()){
			ImageIcon img = new ImageIcon(eGamePanelButton.getButtonImg());
			ImageIcon img2 = new ImageIcon(eGamePanelButton.getButtonImg2());
			button = new JButton();
			button.setIcon(img);
			button.setRolloverIcon(img2);
			button.setPressedIcon(img2);
			button.addActionListener(actionHandler);
			button.setActionCommand(eGamePanelButton.toString());
			button.setBounds(eGamePanelButton.getX(), eGamePanelButton.getY(), eGamePanelButton.getW(),
					eGamePanelButton.getH());
			this.add(button);
		}	
		// 화살표 만드는 부분
		arrowPanel = new Arrow_Panel();
		arrowThread = new Arrow_Thread(arrowPanel);
		arrowPanel.setBounds(45, 560, 600, 60);
		add(arrowPanel);
		arrowThread.start();	
		// 랜덤햄버거 패널, 선택햄버거 패널, 재료 선택 패널
		int i = 0;
		pause = new Game_Pause_Panel(viewController);
		current_Panel = new Game_Panel_Piece[3];
		for (EGamePanelPiece eGamePanelPiece : EGamePanelPiece.values()) {
			current_Panel[i] = eGamePanelPiece.getGamePiece();
			current_Panel[i].setBounds(eGamePanelPiece.getX(), eGamePanelPiece.getY(), eGamePanelPiece.getW(),
					eGamePanelPiece.getH());
			this.add(current_Panel[i]);
			i++;
		}
	}
	// 게임을 초기 설정 해주는 메소드
	public void initialize() {	
		for (int i = 0; i < 3; i++) {current_Panel[i].initialize();}
	}
	// 이어가기 버튼 눌렀을 때 호출되는 메소드
	@SuppressWarnings("deprecation")
	public void keep() {
		arrowThread.resume();
		remove(pause);
		button.setEnabled(true);
		icon = icon1;
	}
	// 새로하기 버튼 눌렀을 때 호출되는 메소드
	@SuppressWarnings("deprecation")
	public void replay() {
		arrowThread.resume();
		stack.initialize();
		button.setEnabled(true);
	}

	// 다음 재료로 넘기는 메소드
	@SuppressWarnings("deprecation")
	public void nextMaterial(int i){
		arrowThread.resume();
		current_Panel[2].selectBurger(i, 0);
		if(i == 5){
			initialize(); 
			levelLable.levelTest();
			if(levelLable.getAccumulate() < 6){ score += 1; }
			else if(levelLable.getAccumulate() < 16){ score += 3; } 
			else if(levelLable.getAccumulate() < 26){ score += 6; } 
			else if(levelLable.getAccumulate() < 41){ score += 10; } 
			else if(levelLable.getAccumulate() > 40){ score += 15; }
			
			if (levelLable.getAccumulate() == 5 || levelLable.getAccumulate() == 15
					|| levelLable.getAccumulate() == 25 || levelLable.getAccumulate() == 40) {
				arrowThread.setSpeed();
			}
		}
	}
	// 선택된 재료가 무엇인지 판단하는 메소드
	@SuppressWarnings("deprecation")
	public void toSelecedMaterial(int i){
		arrowThread.suspend();
		int selectNum;
		int num = arrowPanel.getAX();
		if(num<110){ selectNum = 0; }
		else if(num<310){ selectNum = 1; }
		else if(num<440){ selectNum = 2; } 
		else{ selectNum = 3; }
		if(stack.pop() != selectNum){
			try { Thread.sleep(200); } 
			catch (InterruptedException e1) { e1.printStackTrace(); }
			stack.initialize();
			viewController.endGamePanel(da.scoreSave(score));
			da.endDatabase();
		}
		current_Panel[1].selectBurger(i, selectNum);
	}
	// 일시정지 버튼을 눌렀을 때 사용되는 메소드
	@SuppressWarnings("deprecation")
	public void stopGame(){
		icon = icon2;
		arrowThread.suspend();
		button.setEnabled(false);
		add(pause);
		add(arrowPanel);
		add(current_Panel[0]);
		add(current_Panel[1]);
		add(current_Panel[2]);
	}
	private class ButtonActionListner implements ActionListener{
		int i;
		public void actionPerformed(ActionEvent e) {
			// next 눌렀을떄
			if(e.getActionCommand().equals(EGamePanelButton.values()[1].toString())){
				i = queue.dequeue();
				toSelecedMaterial(i);
				try { Thread.sleep(200); } 
				catch (InterruptedException e1) { e1.printStackTrace(); }
				nextMaterial(i);
				queue.enqueue(i);
			} 
			// stop 눌렀을때
			else if (e.getActionCommand().equals(EGamePanelButton.values()[0].toString())){
				stopGame();
			}
			repaint();
		}
		
	}
}
