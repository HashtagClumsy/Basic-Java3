import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int fact =1;
		for(int i=n;i>=1;i--)
			fact  = fact*i;
		System.out.println("Factorial "+n+"!= " +fact);
        s.close();

	}

}
