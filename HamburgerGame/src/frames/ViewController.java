package frames;

import java.awt.Container;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import assistance_page.Assistance_Panel;
import assistance_page.End_Panel;
import assistance_page.Start_Panel;
import game_page.Game_Panel;

public class ViewController {
	private Main_Frame mainFrame;
	private Container contentPane;
	private Game_Panel gamePanel;
	private Assistance_Panel currentPanel;
	private static Clip cliped;
	public ViewController(Main_Frame mainFrame) {
		this.mainFrame = mainFrame;
		cliped = null;
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
	// 넘어오는 변수가 엔트페이지와 스타트페이지 두개이다
	public void showGamePanel(Assistance_Panel currentPanel){
		stopSound();
		this.currentPanel = currentPanel;
		contentPane.remove(currentPanel); 
		gamePanel = new Game_Panel(this);
		contentPane.add(gamePanel); 
		gamePanel.initialize();
		show();
	}
	// 엔드화면으로 넘어가는 메소드
	public void endGamePanel(int score){
		stopSound();
		currentPanel = new End_Panel(this);
		currentPanel.gameMaxScore(score);
		contentPane.remove(gamePanel); 
		contentPane.add(currentPanel); 
		show();
	}
	// 이어하기 누를때 화면을 이어가기 위한 메소드
	public void keepGamePanel(){
		contentPane.remove(gamePanel); 
		contentPane.add(gamePanel); 
		gamePanel.keep();
		show();
	}
	// 새로하기 누를 때 화면을 새로하기 위한 메소드
	public void replayGamePanel(){
		gamePanel.replay();
		contentPane.remove(gamePanel); 
		gamePanel = new Game_Panel(this);
		contentPane.add(gamePanel); 
		gamePanel.initialize();
		show();
	}
	// 화면을 껏다가 다시 켜서 보이게 하는 메소드
	public void show(){
		mainFrame.setVisible(false); //메인프레임을 보이지 않게한 후 
		mainFrame.setVisible(true); //다시 보이게 한다.
	}
	// 배경음 메소드
	public static void startSound(String pathname) {
		try {
			File file = new File(pathname);
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			cliped = AudioSystem.getClip();
			cliped.open(stream);
			cliped.start();
			stream.close();
			if (true)
				cliped.loop(-1);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	// 버튼 클릭시 사운드 발생 메소드
	public static void clickSound() {
		try {
			File file = new File("rsc/sound/click.wav");
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(stream);
			clip.start();
			stream.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	// 배경음 종료 메소드
	public static void stopSound(){
		cliped.stop();
	}
}
