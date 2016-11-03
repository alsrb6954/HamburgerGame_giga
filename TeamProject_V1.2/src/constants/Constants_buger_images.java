package constants;

public class Constants_buger_images {
	// 랜덤 야채 이미지 enum 상수 타입
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
		// 랜덤 패티 이미지 enum 상수 타입
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
		// 랜덤 토핑 이미지 enum 상수 타입
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
		// 랜덤 위에빵 이미지 enum 상수 타입
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
		// 랜덤 음료수 이미지 enum 상수 타입
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
		// 랜덤 아래빵 이미지 enum 상수 타입
		public static enum EBottomBread{
			bottomBread("rsc/random/bottomBread.gif");
			
			private String img;
			private EBottomBread(String img){
				this.img = img;
			}
			public String getImg() { return this.img; }
		}
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
		public static enum EDrink_Sort {
			drink0("rsc/selects/drink/drinkCider.gif", 10, 20),
			drink1("rsc/selects/drink/drinkCola.gif", 180, 20),
			drink2("rsc/selects/drink/drinkFanta.gif", 350, 20),
			drink3("rsc/selects/drink/drinkGrape.gif", 520, 20);
			
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
