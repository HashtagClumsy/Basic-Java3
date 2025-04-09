class Base{
	int i;
	int j;
	void inputij(int i, int j) {
		this.i = i;
		this.j = j;
	}
	void displayij() {
		System.out.println("i=" +i+ " j=" +j);
	}
}
class Derived extends Base{
	int k;
	
	void inputk(int k) {
		this.k = k;
		
	}
	void displayk() {
		System.out.println(" k=" +k);
	}
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		Base b = new Base();
		b.inputij(3, 5);
		b.displayij();
		Derived d = new Derived();
		d.inputk(8);
		d.displayk();				
	}

}
