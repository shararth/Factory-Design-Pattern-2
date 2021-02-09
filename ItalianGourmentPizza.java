
public class ItalianGourmentPizza {

	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("You ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);

		pizza = store.orderPizza("chicken");
		System.out.println("You ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		pizza = store.orderPizza("veggie");
		System.out.println("You ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		
		pizza = store.orderPizza("deep dish");
		System.out.println("You ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		
		pizza = store.orderPizza("clam");
		System.out.println("You ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}

}
