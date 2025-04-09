
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Begin");
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		try
		{
			int res = n1 / n2;
			System.out.println("Result = "+res);
		}
		catch(Exception e)
		{
			System.err.println("Divide by zero not allowed");
		}

		System.out.println("End");
	}

}
