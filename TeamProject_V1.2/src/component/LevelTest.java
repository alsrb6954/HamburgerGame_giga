package component;

import javax.swing.JLabel;

public class LevelTest {
	JLabel levelLabel;
	private int score = 0;// �ܹ��Ű� ���� ����� ��� ���� ������ �����ϴ� ����

	public LevelTest(){
		levelLabel = new JLabel("Level : 1");
	}
	public void levelTest() {
		score++;
		if (score == 2) {
			levelLabel = new JLabel("Level : 2");
		} else if (score == 5) {
			levelLabel = new JLabel("Level : 3");
		} else if (score == 8) {
			levelLabel = new JLabel("Level : 4");
		} else if (score == 13) {
			levelLabel = new JLabel("Level : 5");
		} else if (score == 20) {
			System.out.println("Mission clear!!");
		}
	}
	public JLabel getLevel(){
		return levelLabel;
	}
}
