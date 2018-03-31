import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here's how you can output something:
		System.out.println("Hello");
		// You can also print out variables and constants
		int myInt = 5;
		System.out.println(myInt);
		
		
		// Here's how you do input. Look at the top of this file, there's an import statement
		Scanner myScanner = new Scanner(System.in);
		myInt = myScanner.nextInt();
		System.out.println(myInt);
		
	}

}
