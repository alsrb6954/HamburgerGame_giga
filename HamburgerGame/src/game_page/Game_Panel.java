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
// ���� ���� �гη� ������ �ϴ� Ŭ����
public class Game_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private static int score;
	private JButton button;
	private MaterialQueue queueFive,queueSix,queueSeven;
	private ButtonActionListner actionHandler;
	private Game_Panel_Piece current_Panel[];
	private Game_Pause_Panel pause;
	private Game_LevelTest levelLable;
	private Game_Timer timerLabel;
	private Arrow_Panel arrowPanel;
	private Arrow_Thread arrowThread;
	private static ViewController viewController;
	private ConfirmStack stack;
	private int num;
	// ����� �̹����� ������ �Ͻ����������� �ٲٱ� ���� ������
	private ImageIcon icon; 
	private Image normalImage;
	private Image grayImage;
	private ImageIcon icon2;
	private ImageIcon icon1;
	
	static Database da = new Database();
	
	// ���� ���� �г��� ��� �̹����� ���� �κ��� �׷��ִ� �޼ҵ�
	public void paintComponent(Graphics g) {
		// ��� �κ�
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);// �׸��� ǥ���ϰ� ����,�����ϰ� ����
		super.paintComponent(g);
		// ���� �κ�
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
	// ������ �޼ҵ�� ViewController�� �޾Ƽ� ������ ȭ���̳� ����� ȭ���� ���� ��Ʋ�η��� �޴´�.
	public Game_Panel(ViewController viewController) {
		this.setLayout(null); // ���̾ƿ��� null�� ���� �ϸ鼭 �����ο� ��ġ�� ����������� �Ѵ�.	

		score = 0;
		actionHandler = new ButtonActionListner();
		Game_Panel.viewController = viewController;
		ViewController.startSound("rsc/sound/game.wav");
		queueFive = new MaterialQueue(6);
		queueSix = new MaterialQueue(7);
		queueSeven = new MaterialQueue(8);
		for(int i=1; i<=5; i++){ queueFive.enqueue(i); } // ����ť�� ��Ḧ ���������� �ѱ�� ���� ���
		for(int i=1; i<=6; i++){ queueSix.enqueue(i); } // ����ť�� ��Ḧ ���������� �ѱ�� ���� ���
		for(int i=1; i<=7; i++){ queueSeven.enqueue(i); } // ����ť�� ��Ḧ ���������� �ѱ�� ���� ���
		stack = new ConfirmStack();
		stack.initialize();
		// ���ȭ�鿡 ����� ������ �ʱ�ȭ�ϴ� �κ�
		icon = new ImageIcon(Constants_GamePanel.BACKGROUND_GAMEPANEL); 
		normalImage = icon.getImage();
		grayImage = GrayFilter.createDisabledImage(normalImage);
		icon2 = new ImageIcon(grayImage);
		icon1 = icon;
		// ���� �κ�
		levelLable = new Game_LevelTest();
		levelLable.initialize();
		this.add(levelLable.getLevel());
		// ��ư �߰��ϴ� ��
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
		// ȭ��ǥ ����� �κ�
		arrowPanel = new Arrow_Panel();
		arrowThread = new Arrow_Thread(arrowPanel);
		arrowPanel.setBounds(45, 560, 600, 60);
		add(arrowPanel);
		arrowThread.start();	
		// �����ܹ��� �г�, �����ܹ��� �г�, ��� ���� �г�
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
		this.num = current_Panel[0].getNum();
		timerLabel = new Game_Timer();
		this.add(timerLabel.getTimer());
		timerLabel.start();
	}
	// ������ �ʱ� ���� ���ִ� �޼ҵ�
	public void initialize() {	
		for (int i = 0; i < 3; i++) {current_Panel[i].initialize();}
		this.num = current_Panel[0].getNum();
		timerLabel.initialize();
	}
	// �̾�� ��ư ������ �� ȣ��Ǵ� �޼ҵ�
	@SuppressWarnings("deprecation")
	public void keep() {
		ViewController.startSound("rsc/sound/game.wav");
		arrowThread.resume();
		timerLabel.resume();
		remove(pause);
		button.setEnabled(true);
		icon = icon1;
	}
	// �����ϱ� ��ư ������ �� ȣ��Ǵ� �޼ҵ�
	public void replay() {
		button.setEnabled(true);
	}

	// ���� ���� �ѱ�� �޼ҵ�
	@SuppressWarnings("deprecation")
	public void nextMaterial(int q){
		arrowThread.resume();
		current_Panel[2].selectBurger(q, 0, this.num);
		if(q == 5 && this.num == 0){
			scoreUP();
		} else if(q == 6 && this.num == 1){
			scoreUP();
		} else if(q == 7 && this.num == 2){
			scoreUP();
		}
	}
	public void scoreUP(){
		levelLable.levelTest();
		if(levelLable.getAccumulate() < 6){ score += (1 + this.num); }
		else if(levelLable.getAccumulate() < 16){ score += (3 + this.num); } 
		else if(levelLable.getAccumulate() < 26){ score += (6 + this.num); } 
		else if(levelLable.getAccumulate() < 41){ score += (10 + this.num); } 
		else if(levelLable.getAccumulate() > 40){ score += (15 + this.num); }
		
		if (levelLable.getAccumulate() == 5 || levelLable.getAccumulate() == 15
				|| levelLable.getAccumulate() == 25 || levelLable.getAccumulate() == 40) {
			arrowThread.setSpeed();
		}
		initialize(); 
	}
	// ���õ� ��ᰡ �������� �Ǵ��ϴ� �޼ҵ�
	@SuppressWarnings("deprecation")
	public void toSelecedMaterial(int q){
		arrowThread.suspend();
		int selectNum;
		int num = arrowPanel.getAX();
		if(num<110){ selectNum = 0; }
		else if(num<310){ selectNum = 1; }
		else if(num<440){ selectNum = 2; } 
		else{ selectNum = 3; }
		//  ��ᰡ �ϳ��� Ʋ���� ���� �����ϰ� �ϴ� ��
		if(stack.pop() != selectNum){
			try { Thread.sleep(200); } 
			catch (InterruptedException e1) { e1.printStackTrace(); }
			viewController.endGamePanel(da.scoreSave(score));
			da.endDatabase();
		}
		current_Panel[1].selectBurger(q, selectNum, this.num);
	}
	public static void gameOver(){
		try { Thread.sleep(200); } 
		catch (InterruptedException e1) { e1.printStackTrace(); }
		viewController.endGamePanel(da.scoreSave(score));
		da.endDatabase();
	}
	// �Ͻ����� ��ư�� ������ �� ���Ǵ� �޼ҵ�
	@SuppressWarnings("deprecation")
	public void stopGame(){
		ViewController.stopSound();
		icon = icon2;
		arrowThread.suspend();
		timerLabel.suspend();
		button.setEnabled(false);
		add(pause);
		add(arrowPanel);
		add(current_Panel[0]);
		add(current_Panel[1]);
		add(current_Panel[2]);
	}
	// ���� �������� ����ť�� �ٸ��� ������.
	public int dequeue(){
		switch (this.num) {
		case 0: return queueFive.dequeue();
		case 1: return queueSix.dequeue();	
		case 2: return queueSeven.dequeue();
		default: break;
		}
		return num;
	}
	// ���� �������� ����ť�� �ٸ��� ����־��ش�.
	public void enqueue(int i){
		switch (this.num) {
		case 0: queueFive.enqueue(i);
		break;
		case 1: queueSix.enqueue(i);	
		break;
		case 2: queueSeven.enqueue(i);
		break;
		default: break;
		}
	}
	private class ButtonActionListner implements ActionListener{
		int q;
		public void actionPerformed(ActionEvent e) {
			// next ��������
			if(e.getActionCommand().equals(EGamePanelButton.values()[1].toString())){
				ViewController.clickSound();
				q = dequeue();
				toSelecedMaterial(q);
				try { Thread.sleep(200); } 
				catch (InterruptedException e1) { e1.printStackTrace(); }
				enqueue(q);
				nextMaterial(q);
			} 
			// stop ��������
			else if (e.getActionCommand().equals(EGamePanelButton.values()[0].toString())){
				ViewController.clickSound();
				stopGame();
			}
			repaint();
		}
		
	}
}
