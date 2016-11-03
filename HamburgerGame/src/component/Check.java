package component;

import game_page.Game_Panel;

public class Check {
	ConfirmStack confirm;
	LevelTest level;
	Game_Panel gamePanel;
	public void bugerCheck(){
		confirm = new ConfirmStack();
		int i = confirm.checkHamburger();
		if(i==0){
			// 같을경우
			level.levelTest();
			gamePanel.initGame();
		}else if(i==1){
			// 틀릴경우
			System.exit(0);
		}
	}
}
