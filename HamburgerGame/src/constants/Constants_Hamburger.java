package constants;

import hamburger.BottomBread;
import hamburger.Drink;
import hamburger.Material;
import hamburger.Patty;
import hamburger.TopBread;
import hamburger.Topping;
import hamburger.Vegetable;

public class Constants_Hamburger {
	// 햄버거들의 객체 선원을 위한 enum 타입
	public static enum EGameHamburger {
		drink(new Drink()),
		topBread(new TopBread()),
		topping(new Topping()),
		patty(new Patty()),
		vegetable(new Vegetable()),
		bottomBread(new BottomBread());
		private Material material;
		private EGameHamburger(Material material){
			this.material = material;
		}
		public Material getMaterial() { return this.material; }
	}
	public static enum EGameHamburgerSix {
		drink(new Drink()),
		topBread(new TopBread()),
		patty2(new Patty()),
		topping(new Topping()),
		patty1(new Patty()),
		vegetable(new Vegetable()),
		bottomBread(new BottomBread());
		private Material material;
		private EGameHamburgerSix(Material material){
			this.material = material;
		}
		public Material getMaterial() { return this.material; }
	}
	public static enum EGameHamburgerSeven {
		drink(new Drink()),
		topBread(new TopBread()),
		vegetable1(new Vegetable()),
		patty1(new Patty()),
		topping(new Topping()),
		patty2(new Patty()),
		vegetable2(new Vegetable()),
		bottomBread(new BottomBread());
		private Material material;
		private EGameHamburgerSeven(Material material){
			this.material = material;
		}
		public Material getMaterial() { return this.material; }
	}
}
