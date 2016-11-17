package constants;

public class Constants_SelectPanel {
	// ��ä���� ��ǥ�� �̹��� enum Ÿ��
	public static enum EVegetable_Sort {
		vegetable0("rsc/selects/vegetable/cucumber.gif", 0, 20),
		vegetable1("rsc/selects/vegetable/lettuce.gif", 160, 20),
		vegetable2("rsc/selects/vegetable/onion.gif", 330, 20),
		vegetable3("rsc/selects/vegetable/paprika.gif", 480, 20);
		private String img;
		private int x, y;
		private EVegetable_Sort(String img, int x, int y){
			this.img = img;
			this.x = x;
			this.y = y;
		}
		public String getImg() { return this.img; }
		public int getX() { return this.x; }
		public int getY() { return this.y; }
	}
	// ��Ƽ���� ��ǥ�� �̹��� enum Ÿ��
	public static enum EPatty_Sort {
		patty0("rsc/selects/patty/curryPatty.gif", 10, 20),
		patty1("rsc/selects/patty/hanwooPatty.gif", 180, 20),
		patty2("rsc/selects/patty/meatPatty.gif", 350, 20),
		patty3("rsc/selects/patty/spicyPatty.gif", 520, 20);
		
		private String img;
		private int x, y;
		private EPatty_Sort(String img, int x, int y){
			this.img = img;
			this.x = x;
			this.y = y;
		}
		public String getImg() { return this.img; }
		public int getX() { return this.x; }
		public int getY() { return this.y; }
	}
	// ���ε��� ��ǥ�� �̹��� enum Ÿ��
	public static enum ETopping_Sort {
		topping0("rsc/selects/topping/cheese.gif", 0, 20),
		topping1("rsc/selects/topping/egg.gif", 170, 20),
		topping2("rsc/selects/topping/mushroom.gif", 330, 20),
		topping3("rsc/selects/topping/tomato.gif", 490, 20);
		
		private String img;
		private int x, y;
		private ETopping_Sort(String img, int x, int y){
			this.img = img;
			this.x = x;
			this.y = y;
		}
		public String getImg() { return this.img; }
		public int getX() { return this.x; }
		public int getY() { return this.y; }
	}
	// ���������� ��ǥ�� �̹��� enum Ÿ��
	public static enum ETopBread_Sort {
		topBread0("rsc/selects/topBread/topBread1.gif", 0, 20),
		topBread1("rsc/selects/topBread/topBread2.gif", 170, 20),
		topBread2("rsc/selects/topBread/topBread3.gif", 330, 20),
		topBread3("rsc/selects/topBread/topBread4.gif", 490, 20);
		
		private String img;
		private int x, y;
		private ETopBread_Sort(String img, int x, int y){
			this.img = img;
			this.x = x;
			this.y = y;
		}
		public String getImg() { return this.img; }
		public int getX() { return this.x; }
		public int getY() { return this.y; }
	}
	// ������� ��ǥ�� �̹��� enum Ÿ��
	public static enum EDrink_Sort {
		drink0("rsc/selects/drink/drinkCider.gif", 50, 20),
		drink1("rsc/selects/drink/drinkCola.gif", 220, 20),
		drink2("rsc/selects/drink/drinkFanta.gif", 400, 20),
		drink3("rsc/selects/drink/drinkGrape.gif", 570, 20);
		
		private String img;
		private int x, y;
		private EDrink_Sort(String img, int x, int y){
			this.img = img;
			this.x = x;
			this.y = y;
		}
		public String getImg() { return this.img; }
		public int getX() { return this.x; }
		public int getY() { return this.y; }
	}
	
}
