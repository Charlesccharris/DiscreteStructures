import java.lang.Math.*;
class Exam7{
	public static void main(String[] args){
/*		Write a program to find as many prime Fibonacci numbers as you can.
		Bonus points will be given for the largest lists.*/

		//Variables

		//Fibonacci Sequence

		//Find prime
		fibonacciSequence();
	}

	public static void fibonacciSequence(){
		long one = 0;
		long two = 1;
		long three;
		boolean isPrime = true;
		while(true){
			three = one + two;
			one = two;
			two = three;
			isPrime = checkPrime(three);
			if(isPrime){
				System.out.println(three + " is prime");
			}
/*			else{
				System.out.println(three + " is not prime");
			}
*/
		}
	}

	public static boolean checkPrime(long fibNum){
		long check = (long)(Math.ceil(Math.sqrt(fibNum)));
		if(fibNum == 1 || fibNum == 2){
			return true;
		}
		for(long i = 2; i <= check; i++){
			if(fibNum%i == 0){
				return false;
			}
		}
		return true;
	}
}
