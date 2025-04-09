interface shape{
	void draw(); // default abstract method
	default void fill() { // define methods using default key word
		System.out.println("filling");
	}
}
class circle implements shape{
	public void draw(){// default public method in interface so override public method{
		System.out.println("Draw Circle");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		//Shape s = new Shape();//error
				shape s = new circle();
				s.draw();
				s.fill();

	}

}
