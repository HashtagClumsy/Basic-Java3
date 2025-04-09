import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		if(n % 2 == 0)
			System.out.println(n+ " is Even number" );
		else
			System.out.println(n+ " is Odd number" );		
	}

}
