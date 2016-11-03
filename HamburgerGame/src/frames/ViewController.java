package frames;

import java.awt.Container;

import assistance_page.Assistance_Panel;
import assistance_page.End_Panel;
import assistance_page.Start_Panel;
import game_page.Game_Panel;

public class ViewController {
	private Main_Frame mainFrame;
	private Container contentPane;
	private Game_Panel gamePanel;
	private Assistance_Panel currentPanel;
	public ViewController(Main_Frame mainFrame) {
		this.mainFrame = mainFrame;
		init();
	}
	// ����ȭ���� �ʱ�ȭ �����ش�.
	private void init(){
		currentPanel = new Start_Panel(this);
		contentPane = mainFrame.getContentPane(); 
		contentPane.add(currentPanel); 
		currentPanel.requestFocus(); 
	}
	
	// ����ȭ������ �Ѿ�� ���� �ʱ�ȭ�����ش�.
	public void showGamePanel(Assistance_Panel currentPanel){
		this.currentPanel = currentPanel;
		contentPane.remove(currentPanel); //startPanel�� �����Ѵ�
		gamePanel = new Game_Panel(this);
		contentPane.add(gamePanel); //���ο� gamePanel�� �߰��Ѵ�.
		gamePanel.initialize(); // �����г��� �ʱ�ȭ �����ش�.
		mainFrame.setVisible(false); //������������ ������ �ʰ��� �� 
		mainFrame.setVisible(true); //�ٽ� ���̰� �Ѵ�.
	}
	// ����ȭ������ �Ѿ�� �޼ҵ�
	public void endGamePanel(){
		currentPanel = new End_Panel(this);
		contentPane.remove(gamePanel); //gamePanel�� �����Ѵ�
		contentPane.add(currentPanel); //���ο� gameEndPanel�� �߰��Ѵ�.
		mainFrame.setVisible(false); //������������ ������ �ʰ��� �� 
		mainFrame.setVisible(true); //�ٽ� ���̰� �Ѵ�.
	}
}
