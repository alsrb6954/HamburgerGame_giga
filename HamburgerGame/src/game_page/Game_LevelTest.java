package game_page;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

// ������ ���� Ŭ����
public class Game_LevelTest {
	private JLabel levelLabel;
	private int accumulate;// �ܹ��Ű� ���� ����� ��� ���� ������ �����ϴ� ����
	
	public Game_LevelTest(){
		levelLabel = new JLabel("Level : 1");
		Font font = new Font("myFont", Font.BOLD, 50);
		levelLabel.setFont(font);
		levelLabel.setForeground(Color.GREEN);
		levelLabel.setBounds(500, 0, 300, 50);
	}
	// ���� ���� �ʱ�ȭ �����ִ� �޼ҵ�
	public void initialize(){
		accumulate = 0;
	}
	// ������ ���� �ø��� ���� �÷��ִ� �޼ҵ�
	public void levelTest() {
		accumulate++;
		if (accumulate == 5) { levelLabel.setText("Level : 2"); } 
		else if (accumulate == 15) { levelLabel.setText("Level : 3"); } 
		else if (accumulate == 25) { levelLabel.setText("Level : 4"); } 
		else if (accumulate == 40) { levelLabel.setText("Level : 5"); }
	}
	// ���� ���� ���� ������
	public int getAccumulate(){
		return accumulate;
	}
	// ������ �����ִ� ������ �޼ҵ�
	public JLabel getLevel(){
		return levelLabel;
	}
}
