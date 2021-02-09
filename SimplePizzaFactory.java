
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("chicken")) {
			pizza = new ChickenPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggieLover();
		}else if (type.equals("deep dish")) {
			pizza = new DeepDishPizza();
		}
		return pizza;
	}

}
