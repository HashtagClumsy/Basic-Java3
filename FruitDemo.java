/*Create an abstract class “Fruit” which contains an abstract method cost(). 
Create sub classes “Apple and Mango” which extends Fruit class. Use appropriate data 
members in the respective classes. Create a class FruitDemo to test the above 
functionalities.
--abstract method cost() in the abstract class Fruit 
--ensures that all fruit types implement their own cost calculation logic. */
abstract class Fruit{
	String name;
	double pricePerUnit;
	int qty;
	
	Fruit(String name, int qty, double pricePerUnit)
	{
		this.name = name;
		this.qty = qty;
        this.pricePerUnit = pricePerUnit;
	}
	
	abstract double cost();

	void displayDetails() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Quantity: " + qty);
        System.out.println("Price per lb: $" + pricePerUnit);
        System.out.println("Total Cost: $" + cost());
        System.out.println("------------------------------");
    }
}

abstract class Apple extends Fruit {

	Apple(String name, int qty, double pricePerUnit) {
		super(name, qty, pricePerUnit);
		
	}
}
class GalaApple extends Apple 
{

	GalaApple(String name, int qty, double pricePerUnit) 
	{
	super("Gala Apple", qty, 3.49);
		}

		@Override
		double cost() {
			return qty * pricePerUnit;
		}
		
	}
class RedApple extends Apple {

	RedApple(String name, int qty, double pricePerUnit) {
		super("Red Apple", qty, 2.29);
	}

	@Override
	double cost() {
		return qty * pricePerUnit;
	}
	
}

	
class Mango extends Fruit {

	
	Mango(String name, int qty, double pricePerUnit) {
		super("Mango", qty, 9);
	}



	@Override
	double cost() {
		return qty * pricePerUnit;
	}

	
}
public class FruitDemo {

	public static void main(String[] args) {
	
//ParentClassType objectName = new ChildClassType(arguments);

		Fruit g = new GalaApple (null, 12, 3);
		Fruit r = new RedApple(null, 10,0);  
        Fruit m = new Mango(null, 5,0); 
        
        g.displayDetails();
        System.out.println();

        r.displayDetails();
        System.out.println();

        m.displayDetails();
	}

}
