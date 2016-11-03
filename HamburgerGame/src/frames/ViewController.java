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
	// 시작화면을 초기화 시켜준다.
	private void init(){
		currentPanel = new Start_Panel(this);
		contentPane = mainFrame.getContentPane(); 
		contentPane.add(currentPanel); 
		currentPanel.requestFocus(); 
	}
	
	// 게임화면으로 넘어가기 위해 초기화시켜준다.
	public void showGamePanel(Assistance_Panel currentPanel){
		this.currentPanel = currentPanel;
		contentPane.remove(currentPanel); //startPanel을 제거한다
		gamePanel = new Game_Panel(this);
		contentPane.add(gamePanel); //새로운 gamePanel을 추가한다.
		gamePanel.initialize(); // 게임패널을 초기화 시켜준다.
		mainFrame.setVisible(false); //메인프레임을 보이지 않게한 후 
		mainFrame.setVisible(true); //다시 보이게 한다.
	}
	// 엔드화면으로 넘어가는 메소드
	public void endGamePanel(){
		currentPanel = new End_Panel(this);
		contentPane.remove(gamePanel); //gamePanel을 제거한다
		contentPane.add(currentPanel); //새로운 gameEndPanel을 추가한다.
		mainFrame.setVisible(false); //메인프레임을 보이지 않게한 후 
		mainFrame.setVisible(true); //다시 보이게 한다.
	}
}
