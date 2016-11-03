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
		contentPane.remove(startPanel); //startPanel을 제거한다
		contentPane.add(new Game_Panel()); //새로운 Panel을 추가한다.
		mainFrame.setVisible(false); //메인프레임을 보이지 않게한 후 
		mainFrame.setVisible(true); //다시 보이게 한다.
	}
}
