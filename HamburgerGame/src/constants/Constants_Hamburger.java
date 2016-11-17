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
}
