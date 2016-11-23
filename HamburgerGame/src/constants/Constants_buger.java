package constants;

public class Constants_buger {
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
		// 햄버거 좌표 위치 enum 상수 타입
		public static enum EFiveRandomLocation {
			vegetable(0,150),patty(35,150),topping(0,122),topBread(0,90),drink(240,150),bottomBread(5, 150);
			private int x;
			private int y;
			private EFiveRandomLocation(int x, int y){
				this.x = x;
				this.y = y;
			}
			public int getX() { return this.x; }
			public int getY() { return this.y; }
		}
		public static enum ESixRandomLocation {
			vegetable(0,150),patty1(35,115),topBread(0,70),patty2(35,150);
			private int x;
			private int y;
			private ESixRandomLocation(int x, int y){
				this.x = x;
				this.y = y;
			}
			public int getX() { return this.x; }
			public int getY() { return this.y; }
		} 
		public static enum ESevenRandomLocation {
			vegetable1(0,80),patty1(35,115),topBread(0,60),patty2(35,150),vegetable2(0,150);
			private int x;
			private int y;
			private ESevenRandomLocation(int x, int y){
				this.x = x;
				this.y = y;
			}
			public int getX() { return this.x; }
			public int getY() { return this.y; }
		} 
		
}
