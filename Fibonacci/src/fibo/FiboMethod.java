package fibo;
import java.util.Scanner;

/**
 * Class containing two methods that generate a sequence of values ​​using the Fibonacci method.
 * 
 * @author Ramos, Isaac
 */
public class FiboMethod {
	Scanner scan = new Scanner (System.in);

	private int numberOne = 0, numberTwo = 1, aux = 0,counter = 0, amount = 0;

	/**
	 * Method 1 generates a user-defined sequence of values ​​during execution.
	 */
	public void fiboMethod01 () {
		System.out.println("Amout of values?");
		amount = scan.nextInt();
		while (counter < amount) {
			System.out.println(numberOne + " ");
			aux = numberOne + numberTwo;
			numberOne = numberTwo;
			numberTwo = aux;
			counter++;
		}
	}

	/**
	 * Method 2 generates a user-defined sequence of values ​​in the main class and passed by parameter.
	 */
	public int fiboMethod02 (int amount, int value) {
		if (value <= 1) 
			return value;
		
			return fiboMethod02(amount, value - 1) + fiboMethod02(amount, value - 2);
		
	}
}
