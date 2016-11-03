package constants;

import hamburger.BottomBread;
import hamburger.Drink;
import hamburger.Material;
import hamburger.Patty;
import hamburger.TopBread;
import hamburger.Topping;
import hamburger.Vegetable;

public class Constants_RandomPanel {

	public static enum EGameRandomHamburger {
		drink(new Drink()),
		topBread(new TopBread()),
		topping(new Topping()),
		patty(new Patty()),
		vegetable(new Vegetable()),
		bottomBread(new BottomBread());
		private Material material;
		private EGameRandomHamburger(Material material){
			this.material = material;
		}
		public Material getMaterial() { return this.material; }
	}
}
