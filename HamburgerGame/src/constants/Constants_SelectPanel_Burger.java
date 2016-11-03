package constants;

import hamburger.BottomBread;
import hamburger.Drink;
import hamburger.Material;
import hamburger.Patty;
import hamburger.TopBread;
import hamburger.Topping;
import hamburger.Vegetable;

public class Constants_SelectPanel_Burger {
	public static enum EGameSelectHamburger {
		bottomBread(new BottomBread()),
		vegetable(new Vegetable()),
		patty(new Patty()),
		topping(new Topping()),
		topBread(new TopBread()),
		drink(new Drink());
		private Material material;
		private EGameSelectHamburger(Material material){
			this.material = material;
		}
		public Material getMaterial() { return this.material; }
	}
}
