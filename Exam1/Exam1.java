import java.util.*;
import java.lang.Math.*;

public class Exam1{
	public static void main(String[] args){
		/*Develop a collection of four different rules
		for generating the terms of a sequence.

		Generate a program for randomly selecting a rule,
		and a starting point.

		Give the user the first four terms of the sequence,
		and ask them for the fifth.

		Tell them if they were correct or not.
		*/
		Scanner input = new Scanner(System.in);

		int guess;
		int numFour = 0;
		int ruleChoice;
		System.out.println("Hello");

		ruleChoice = (int)(Math.random()*4 +1);

//		System.out.println(ruleChoice);

		switch(ruleChoice){
		case 1: numFour = geometricRule();
			break;
                case 2: numFour = arithmeticRule();
			break;
                case 3: numFour = recurrenceRule();
			break;
                case 4: numFour = fibonacciRule();
			break;
		}

		System.out.print("What is the fifth number in this sequence?: ");
		guess = input.nextInt();

		if(guess == numFour){
			System.out.println("Right! The fifth number is " + numFour);
		}
		else{
			System.out.println("Sorry, but the correct answer is " + numFour);
		}
	}

	public static int geometricRule(){
		//Geometric

		/*Sequence in the form:
		a, ar, ar^2, ..., ar^n, ...
		Where a and r are real numbers
		*/

		int baseNumber;
		int incrementNumber;
		int middleNumber;
		int newNumber;
		int numFour;

		baseNumber = (int)(Math.random()*10 +1);
		incrementNumber = (int)(Math.random()*10 +1);

		for(int i = 0; i < 4; i++){
			middleNumber = (int)(Math.pow(incrementNumber, i));
			newNumber = middleNumber*baseNumber;
			System.out.print(newNumber + ", ");
		}

		System.out.println("?");
		middleNumber = (int)(Math.pow(incrementNumber, 4));
		numFour = middleNumber*baseNumber;

		return numFour;
	}

	public static int arithmeticRule(){
		//Arithmetic

                /*Sequence in the form:
                a, a+d, a+2d, ..., a+nd, ...
                Where a and d are real numbers
                */

		int baseNumber;
		int incrementNumber;
		int numOne;
		int numTwo;
		int numThree;
		int numFour;

		baseNumber = (int)(Math.random()*100);
		incrementNumber = (int)(Math.random()*20 +1);

		numOne = baseNumber + incrementNumber;
		numTwo = numOne + incrementNumber;
		numThree = numTwo + incrementNumber;
		numFour = numThree + incrementNumber;

		System.out.println(baseNumber + ", " + numOne + ", " + numTwo + ", " +
					numThree + ", ?");

		return numFour;
	}

	public static int recurrenceRule(){
		//Recurrence

                /*A recurrence relation for the sequence
                {a_n} is an equation that expresses a_n in
                terms of one or more of the previous terms of the sequence,
                namely, a_0, a_1, ..., a_n-1, for all integers n with n>=n_0,
                where n_0 is a nonnegative integer.

                A sequence is called a solution of a recurrence relation if its
                terms satisfy the recurrence relation.

                (A recurrence relation is said to recursively define a sequence)
		*/

		int baseNumber;
		int numOne;
		int numTwo;
		int numThree;
		int numFour;

		baseNumber = (int)(Math.random()*100);
		numOne = (int)(Math.random()*20 +1);

		while(numOne == baseNumber){
			numOne = (int)(Math.random()*20 +1);
		}

		numTwo = numOne-baseNumber;
		numThree = numTwo-numOne;
		numFour = numThree-numTwo;

		System.out.println(baseNumber + ", " + numOne + ", " + numTwo + ", " +
					numThree + ", ?");
		return numFour;
	}

	public static int fibonacciRule(){
		//Fibonacci

		/*The fibonacci sequence, f_0, f_1, f_2, ...,
		is defined bt the initial condition f_0 = 0, f_1 = 1,
		and the recurrence relation

		f_n = f_n-1 + f_n-2

		for n = 2, 3, 4
		*/
		int numFour;
		int[] fibonacci = new int[50];
		fibonacci[0] = 0;
		fibonacci[1] = 1;

		for(int i = 2; i <= 49; i++){
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}

		int initialNumber = (int)(Math.random()*45);

		for(int i = initialNumber; i <= initialNumber+3; i++){
			System.out.print(fibonacci[i] + ", ");
		}
		System.out.println("?");

		numFour = fibonacci[initialNumber+4];
		return numFour;
	}
}
