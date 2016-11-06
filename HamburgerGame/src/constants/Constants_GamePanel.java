package constants;

import javax.swing.ImageIcon;

import game_page.Game_Panel_Piece;
import game_page.Game_RandomHamburger_Panel;
import game_page.Game_SelectHamburger_Panel;
import game_page.Game_Select_Panel;

public class Constants_GamePanel {
	public final static String BACKGROUND_GAMEPANEL = "rsc/panelImg/¹ö°ÅÄî¹è°æ-1.gif";
	public static enum EGamePanelPiece {
		randomHamburger(new Game_RandomHamburger_Panel(new ImageIcon("rsc/panelImg/¹ö°ÅÄî¹è°æ-3.gif")), 10, 155, 340, 300),
		selectHamburger(new Game_SelectHamburger_Panel(new ImageIcon("rsc/panelImg/¹ö°ÅÄî¹è°æ-3.gif")), 355, 155, 340, 300),
		select(new Game_Select_Panel(new ImageIcon("rsc/panelImg/SelectPanel3.gif")), 10, 460, 685, 130);
		private Game_Panel_Piece gamePiece;
		private int x;
		private int y;
		private int w;
		private int h;
		private EGamePanelPiece(Game_Panel_Piece gamePiece,int x, int y, int w, int h){
			this.gamePiece = gamePiece;
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
		}
		public Game_Panel_Piece getGamePiece() { return this.gamePiece; }
		public int getX() { return this.x; }
		public int getY() { return this.y; }
		public int getW() { return this.w; }
		public int getH() { return this.h; }
	}
	
	public static enum EGamePanelButton {
		stop("rsc/panelImg/Stop.gif","rsc/panelImg/Stop_push.gif",10, 10, 50, 50),
		next("rsc/panelImg/Next.gif","rsc/panelImg/Next_push.gif",300, 640, 100, 50);
		private String buttonImg;
		private String buttonImg2;
		private int x;
		private int y;
		private int w;
		private int h;
		private EGamePanelButton(String buttonImg,String buttonImg2, int x, int y,int w, int h){
			this.buttonImg = buttonImg;
			this.buttonImg2 = buttonImg2;
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
		}
		public String getButtonImg() { return this.buttonImg; }
		public String getButtonImg2() { return this.buttonImg2; }
		public int getX() { return this.x; }
		public int getY() { return this.y; }
		public int getW() { return this.w; }
		public int getH() { return this.h; }
	}
}
