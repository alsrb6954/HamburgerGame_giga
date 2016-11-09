package game_page;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

// 레벨을 위한 클래스
public class Game_LevelTest {
	private JLabel levelLabel;
	private int accumulate;// 햄버거가 같은 모양일 경우 맞춘 개수를 누적하는 변수
	
	public Game_LevelTest(){
		levelLabel = new JLabel("Level : 1");
		Font font = new Font("myFont", Font.BOLD, 50);
		levelLabel.setFont(font);
		levelLabel.setForeground(Color.GREEN);
		levelLabel.setBounds(500, 0, 300, 50);
	}
	// 맞춘 갯수 초기화 시켜주는 메소드
	public void initialize(){
		accumulate = 0;
	}
	// 맞으면 갯수 올리고 레벨 올려주는 메소드
	public void levelTest() {
		accumulate++;
		if (accumulate == 5) { levelLabel.setText("Level : 2"); } 
		else if (accumulate == 15) { levelLabel.setText("Level : 3"); } 
		else if (accumulate == 25) { levelLabel.setText("Level : 4"); } 
		else if (accumulate == 40) { levelLabel.setText("Level : 5"); }
	}
	// 맞은 갯수 변수 접근자
	public int getAccumulate(){
		return accumulate;
	}
	// 레벨을 보여주는 접근자 메소드
	public JLabel getLevel(){
		return levelLabel;
	}
}
