
public class HelloQassim {

	public static void main(String[] args) {
		System.out.println("Hello Qassim, here are the prime numbers between 1 and 100");
		
		for (int i = 1; i<=100; i++) {

			boolean isPrime = true;
			
			for (int p = 2; p < i; p++) {
				
				if (i % p == 0) {
					isPrime = false;
					break; 
				}
				
			}
			
			if (isPrime) {
				System.out.print(i+ "\n");
			}
		}

	}

}