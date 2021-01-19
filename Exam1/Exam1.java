import java.util.*;

class Exam1{
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

		int ruleChoice;
		System.out.println("Hello");

		ruleChoice = (int)(Math.random()*4 +1);

		System.out.println(ruleChoice);

		switch(ruleChoice){
		case 1: geometricRule();
			break;
                case 2: arithmeticRule(input);
			break;
                case 3: recurrenceRule();
			break;
                case 4: fibonnacciRule();
			break;
		}
	}

	public static void geometricRule(){
		//Geometric

		/*Sequence in the form:
		a, ar, ar^2, ..., ar^n, ...
		Where a and r are real numbers
		*/
		System.out.println("Geo");

	}

	public static void arithmeticRule(Scanner input){
		//Arithmetic

                /*Sequence in the form:
                a, a+d, a+2d, ..., a+nd, ...
                Where a and d are real numbers
                */

		int guess;
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
		System.out.print("What is the fifth number in the sequence?: ");
		guess = input.nextInt();

		if(guess == numFour){
			System.out.println("Right! The fifth number is " + numFour);
		}
		else{
			System.out.println("Sorry, but the correct answer is " + numFour);
		}
		System.out.println("Ari");

	}

	public static void recurrenceRule(){
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

		System.out.println("Rec");
	}

	public static void fibonnacciRule(){
		//Fibonnacci

		/*The fibonnacci sequence, f_0, f_1, f_2, ...,
		is defined bt the initial condition f_0 = 0, f_1 = 1,
		and the recurrence relation

		f_n = f_n-1 + f_n-2

		for n = 2, 3, 4
		*/

		System.out.println("Fib");
	}
}
