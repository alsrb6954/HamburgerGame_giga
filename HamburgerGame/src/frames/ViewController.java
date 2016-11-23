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
		stopSound();
		this.currentPanel = currentPanel;
		contentPane.remove(currentPanel); 
		gamePanel = new Game_Panel(this);
		contentPane.add(gamePanel); 
		gamePanel.initialize();
		show();
	}
	// ����ȭ������ �Ѿ�� �޼ҵ�
	public void endGamePanel(int score){
		stopSound();
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
	// ����� �޼ҵ�
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
	// ��ư Ŭ���� ���� �߻� �޼ҵ�
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
	// ����� ���� �޼ҵ�
	public static void stopSound(){
		cliped.stop();
	}
}
