package constants;

public class Constants_PausePanel {
	public final static int X = 50;
	public final static int Y = 50;
	public final static int WIDTH = 600;
	public final static int HIEGHT = 500;
	public static enum EGamePauseButton {
		replay("rsc/panelImg/Greplay.gif","rsc/panelImg/Greplay_push.gif",140,300,100,100),
		keep("rsc/panelImg/Gkeep.gif","rsc/panelImg/Gkeep_push.gif",250,300,100,100),
		quit("rsc/panelImg/Gquit.gif","rsc/panelImg/Gquit_push.gif",360,300,100,100);
		private String buttonImg;
		private String buttonImg2;
		private int x;
		private int y;
		private int w;
		private int h;
		private EGamePauseButton(String buttonImg, String buttonImg2,int x, int y,int w, int h){
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
