import java.util.*;
class Exam8{
	public static void main(String[] args){
/*		Compare the number of operations and the time
		needed to sort lists of n elements for n = 100,
		1,000, and 10,000 from the set of positive integers
		less than a million where the elements are randomly
		selected positive integers, using the bubble sort and quick sort.
*/
		Scanner input = new Scanner(System.in);
		int number = 0;
		int opNumber = 0;
		System.out.print("Enter the number of Integers: ");
		number = input.nextInt();
		int[] list = new int[number];

		for(int x = 0; x < number; x ++){
			list[x] = (int)(Math.random()*100);
		}
		for(int x = 0; x < number; x ++){
			System.out.println(list[x]);
		}
		opNumber = bubbleSort(list);
		opNumber = quickSort(list);
	}

	public static int bubbleSort(int[] list){
		return 0;
	}

	public static int quickSort(int[] list){
		return 1;
	}
}
