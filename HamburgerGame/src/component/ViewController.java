package component;

import java.awt.Container;

import game_page.Game_Panel;
import start_page.Start_Panel;

public class ViewController {
	Main_Frame mainFrame;
	Container contentPane;
	Start_Panel startPanel;
	public ViewController(Main_Frame mainFrame) {
		this.mainFrame = mainFrame;
		init();
	}
	private void init(){
		startPanel = new Start_Panel(this);
		contentPane = mainFrame.getContentPane(); 
		contentPane.add(startPanel); 
		startPanel.requestFocus(); 
	}
	
	public void showGamePanel(){
		contentPane.remove(startPanel); //startPanel�� �����Ѵ�
		contentPane.add(new Game_Panel()); //���ο� Panel�� �߰��Ѵ�.
		mainFrame.setVisible(false); //������������ ������ �ʰ��� �� 
		mainFrame.setVisible(true); //�ٽ� ���̰� �Ѵ�.
	}
}
