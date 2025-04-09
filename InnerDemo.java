
class Outer{
	int m = 100;
	class inner{
		void doStuff() {
			System.out.println("m= "+m);
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		Outer.inner innerObj = new Outer().new inner();
		innerObj.doStuff();
	}

}
