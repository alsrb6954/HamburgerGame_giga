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
	// �Ѿ���� ������ ��Ʈ�������� ��ŸƮ������ �ΰ��̴�
	public void showGamePanel(Assistance_Panel currentPanel){
		this.currentPanel = currentPanel;
		contentPane.remove(currentPanel); 
		gamePanel = new Game_Panel(this);
		contentPane.add(gamePanel); 
		gamePanel.initialize(); 
		show();
	}
	// ����ȭ������ �Ѿ�� �޼ҵ�
	public void endGamePanel(int score){
		currentPanel = new End_Panel(this);
		currentPanel.gameMaxScore(score);
		contentPane.remove(gamePanel); 
		contentPane.add(currentPanel); 
		show();
	}
	// �̾��ϱ� ������ ȭ���� �̾�� ���� �޼ҵ�
	public void keepGamePanel(){
		contentPane.remove(gamePanel); 
		contentPane.add(gamePanel); 
		gamePanel.keep();
		show();
	}
	// �����ϱ� ���� �� ȭ���� �����ϱ� ���� �޼ҵ�
	public void replayGamePanel(){
		gamePanel.replay();
		contentPane.remove(gamePanel); 
		gamePanel = new Game_Panel(this);
		contentPane.add(gamePanel); 
		gamePanel.initialize();
		show();
	}
	// ȭ���� ���ٰ� �ٽ� �Ѽ� ���̰� �ϴ� �޼ҵ�
	public void show(){
		mainFrame.setVisible(false); //������������ ������ �ʰ��� �� 
		mainFrame.setVisible(true); //�ٽ� ���̰� �Ѵ�.
	}
}
