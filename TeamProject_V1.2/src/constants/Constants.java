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
		background("rsc/start_page.gif");
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
	// 햄버거 좌표 위치 enum 상수 타입
	public static enum ERandomLocation {
		vegetable(0,150),patty(35,150),topping(0,120),topBread(0,90),drink(240,150),bottomBread(5, 150);
		private int x;
		private int y;
		private ERandomLocation(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX() { return this.x; }
		public int getY() { return this.y; }
	} 
	
	
}
