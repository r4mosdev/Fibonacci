package fibo;

/**
 * Main class, where the methods are executed
 */
public class Main { 
	public static void main(String[] args) {
		FiboMethod fibo = new FiboMethod();
		System.out.println("Executing method 1\n");
		fibo.fiboMethod01();
		
		System.out.println("\nExecuting method 2\n");
		System.out.println("Amount of values?");
		int n = fibo.scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(fibo.fiboMethod02(n, i) + " ");
		}
		}

}
