package constants;

public class Constants {
	public final static String MAINFRAME_TITLE = "¹ö°ÅÄî";
	
	public static enum EMainFrame {
		X(300), Y(0), W(720), H(730);
		private int value;
		private EMainFrame(int value) {
			this.value = value;
		}
		public int getValue() { return this.value; }
	}
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
	public static enum ERandomLocation {
		vegetable(0,150),patty(35,150),topping(0,120),topBread(0,90),drink(240,150);
		private int x;
		private int y;
		private ERandomLocation(int x, int y){
			this.x = x;
			this.y = y;
		}
		public int getX() { return this.x; }
		public int getY() { return this.y; }
	}
	public static enum EVegetable {
		vegetable0("rsc/random/vegetable/cucumber.gif"),
		vegetable1("rsc/random/vegetable/lettuce.gif"),
		vegetable2("rsc/random/vegetable/onion.gif"),
		vegetable3("rsc/random/vegetable/paprika.gif");
		
		private String img;
		private EVegetable(String img){
			this.img = img;
		}
		public String getImg() { return this.img; }
	}
	public static enum EPatty {
		patty0("rsc/random/patty/curryPatty.gif"),
		patty1("rsc/random/patty/hanwooPatty.gif"),
		patty2("rsc/random/patty/meatPatty.gif"),
		patty3("rsc/random/patty/spicyPatty.gif");
		
		private String img;
		private EPatty(String img){
			this.img = img;
		}
		public String getImg() { return this.img; }
	}
	public static enum ETopping{
		topping0("rsc/random/topping/cheese.gif"),
		topping1("rsc/random/topping/egg.gif"),
		topping2("rsc/random/topping/mushroom.gif"),
		topping3("rsc/random/topping/tomato.gif");
		
		private String img;
		private ETopping(String img){
			this.img = img;
		}
		public String getImg() { return this.img; }
	}
	public static enum ETopBread{
		topbread0("rsc/random/topbread/topbread1.gif"),
		topbread1("rsc/random/topbread/topbread2.gif"),
		topbread2("rsc/random/topbread/topbread3.gif"),
		topbread3("rsc/random/topbread/topbread4.gif");
		
		private String img;
		private ETopBread(String img){
			this.img = img;
		}
		public String getImg() { return this.img; }
	}
	public static enum EDrink{
		drink0("rsc/random/drink/drinkCider.gif"),
		drink1("rsc/random/drink/drinkCola.gif"),
		drink2("rsc/random/drink/drinkFanta.gif"),
		drink3("rsc/random/drink/drinkGrape.gif");
		
		private String img;
		private EDrink(String img){
			this.img = img;
		}
		public String getImg() { return this.img; }
	}
}
