package game_page;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import constants.Constants_GamePanel;
import constants.Constants_GamePanel.*;
import data_managements.MaterialQueue;
import frames.ViewController;
import thread.*;

public class Game_Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Game_Panel_Piece current_Panel[];
	private Game_LevelTest levelLable;
	private Game_Check_Hamburger checkHamburger = new Game_Check_Hamburger();
	private MaterialQueue queue = new MaterialQueue();
	private Arrow_Panel arrowPanel;
	private Arrow_Thread arrowThread;
	private ButtonActionListner actionHandler = new ButtonActionListner();
	private ViewController viewController;
	private int score;
	
	// ���� ���� �г��� ��� �̹����� ���� �κ��� �׷��ִ� �޼ҵ�
	public void paintComponent(Graphics g) {
		// ��� �κ�
		ImageIcon icon = new ImageIcon(Constants_GamePanel.BACKGROUND_GAMEPANEL);
		Dimension d = getSize();
		g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
		setOpaque(false);// �׸��� ǥ���ϰ� ����,�����ϰ� ����
		super.paintComponent(g);
		// ���� �κ�
		g.setFont(new Font("Defualt", Font.BOLD, 25));
		g.setColor(Color.green);
		g.drawString("SCORE : " + score, 550, 65);
	}
	
	// ������ �޼ҵ�� ViewController�� �޾Ƽ� ������ ȭ���̳� ����� ȭ���� ���� ��Ʋ�η��� �޴´�.
	public Game_Panel(ViewController viewController) {
		this.viewController = viewController;
		this.setLayout(null); // ���̾ƿ��� null�� ���� �ϸ鼭 �����ο� ��ġ�� ����������� �Ѵ�.	
		for(int i=1; i<=5; i++){ queue.enqueue(i); } // ����ť�� ��Ḧ ���������� �ѱ�� ���� ���
		// ���� �κ�
		levelLable = new Game_LevelTest();
		levelLable.initialize();
		this.add(levelLable.getLevel());
		// ��ư �߰��ϴ� ��
		for(EGamePanelButton eGamePanelButton: EGamePanelButton.values()){
			ImageIcon img = new ImageIcon(eGamePanelButton.getButtonImg());
			JButton button = new JButton();
			button.setIcon(img);
			//button.setPressedIcon(img);
			button.addActionListener(actionHandler);
			button.setActionCommand(eGamePanelButton.toString());
			button.setBounds(eGamePanelButton.getX(), eGamePanelButton.getY(), eGamePanelButton.getW(),
					eGamePanelButton.getH());
			this.add(button);
		}
		
		// ȭ��ǥ ����� �κ�
		arrowPanel = new Arrow_Panel();
		arrowThread = new Arrow_Thread(arrowPanel);
		arrowPanel.setBounds(45, 590, 600, 50);
		add(arrowPanel);
		arrowThread.start();
		
		// �����ܹ��� �г�, �����ܹ��� �г�, ��� ���� �г�
		int i = 0;
		current_Panel = new Game_Panel_Piece[3];
		for (EGamePanelPiece eGamePanelPiece : EGamePanelPiece.values()) {
			current_Panel[i] = eGamePanelPiece.getGamePiece();
			current_Panel[i].setBounds(eGamePanelPiece.getX(), eGamePanelPiece.getY(), eGamePanelPiece.getW(),
					eGamePanelPiece.getH());
			this.add(current_Panel[i]);
			i++;
		}
	}

	// ������ �ʱ� ���� ���ִ� �޼ҵ�
	public void initialize() {	
		for (int i = 0; i < 3; i++) {
			current_Panel[i].initialize();
		}
	}
	// ���� ���� �ѱ�� �޼ҵ�
	@SuppressWarnings("deprecation")
	public void nextMaterial(int i){
		arrowThread.resume();
		current_Panel[2].selectBurger(i, 0);
		if(i == 5){
			int a = checkHamburger.check();
			// ���� ����� ���� ��� ������ �ø���, ���Ӱ� �ܹ��� ����
			if(a == 0){ 
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
			// ���� ����� �ٸ����
			else if(a == 1){ 
//				ImageIcon icon = new ImageIcon("rsc/panelImg/SelectPanel1.gif");
//				JLabel la1 = new JLabel(icon);
//				la1.setBounds(0, 10, icon.getIconWidth(), icon.getIconHeight());
//				add(la1);
				viewController.endGamePanel();
			}
		}
	}
	// ���õ� ��ᰡ �������� �Ǵ��ϴ� �޼ҵ�
	@SuppressWarnings("deprecation")
	public void toSelecedMaterial(int i){
		arrowThread.suspend();
		int num = arrowPanel.getAX();
		if(num<110){ current_Panel[1].selectBurger(i, 0); }
		else if(num<310){ current_Panel[1].selectBurger(i, 1); }
		else if(num<440){ current_Panel[1].selectBurger(i, 2); } 
		else{ current_Panel[1].selectBurger(i, 3); }
	}
	
	private class ButtonActionListner implements ActionListener{
		int i;
		@Override
		public void actionPerformed(ActionEvent e) {
			// next ��������
			if(e.getActionCommand().equals("next")){
				i = queue.dequeue();
				toSelecedMaterial(i);
				try { Thread.sleep(200); } 
				catch (InterruptedException e1) { e1.printStackTrace(); }
				nextMaterial(i);
				queue.enqueue(i);
			} else if (e.getActionCommand().equals("stop")){
					
			}
			repaint();
		}
		
	}
}
