import java.util.Scanner;

public class InputScanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("You entered string " + s);
		int a = in.nextInt();
		System.out.println("You entered integer " + a);
		float b = in.nextFloat();
		System.out.println("You entered float " + b);
		
		System.out.println("Closing Scanner...");
		in.close();
		System.out.println("Scanner is Closed now .");

	}

}
