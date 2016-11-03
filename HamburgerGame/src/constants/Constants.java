package constants;


public class Constants {
	public final static String MAINFRAME_TITLE = "버거쿡";
	// MainFrame enum 상수타입
	public static enum EMainFrame {
		X(300), Y(0), W(720), H(730);
		private int value;
		private EMainFrame(int value) {
			this.value = value;
		}
		public int getValue() { return this.value; }
	}
	// StartPanel enum 상수타입
	public static enum EStartPanel {
		X(0), Y(0), W(700), H(700), drawX(230), drawX1(440), drawY(680), drawY1(680), Font(60), 
		background("rsc/panelImg/start_page.gif");
		private int value;
		private String backgroundName;
		private EStartPanel(int value) {
			this.value = value;
		}
		private EStartPanel(String backgroundName) {
			this.backgroundName = backgroundName;
		}
		public int getValue() { return this.value; }
		public String getBackgroundName() { return this.backgroundName; }
	}

	public static enum EEndPanelButton {
		Replay("rsc/panelImg/Replay.gif",100, 500, 200, 85), Quit("rsc/panelImg/Quit.gif",400, 500, 200, 85);
		private String buttonImg;
		private int x;
		private int y;
		private int w;
		private int h;
		private EEndPanelButton(String buttonImg,int x, int y,int w, int h){
			this.buttonImg = buttonImg;
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
		}
		public String getButtonImg() { return this.buttonImg; }
		public int getX() { return this.x; }
		public int getY() { return this.y; }
		public int getW() { return this.w; }
		public int getH() { return this.h; }
	}
}
