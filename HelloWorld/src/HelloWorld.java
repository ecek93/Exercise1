import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	private static Scanner a;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 System.out.println("Hello ASE2016 - how are you now? :)");
		 a = new Scanner(System.in);
		 System.out.print("Please enter your name :");
		 String s=a.nextLine();
		 HelloUser.greetUser(s);
	}

}

