class Exam3{
	public static void main(String[] args){
/*		Estimating the number of primes less than x
		Write a program to count how many primes are less than
		10, 100, 1,000, ..., 100,000,000.

		Fit a curve to your data and estimate the number of primes less than x,
		where x is a positive integer.
*/
		int count = 0;
		int maxAmount = 10;

		for(i = 2; i < maxAmount; i++){
			if(isPrime(maxAmount)){
				count++;
			}
		}
		System.out.println("Number of primes less than " + maxAmount + ": " + count);
	}

	public static boolean isPrime (int max){
		System.out.println("In isPrime");
		for(int i = 2; i < max; i++){
			if(max%i == 0){
				System.out.println("Max :" + max + " and i: " + i);
				return false;
			}
		}
		return true;
	}
}
