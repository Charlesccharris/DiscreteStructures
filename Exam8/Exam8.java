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

		list = fillArray(list,number);
//		displayArray(list, number);

		bubbleSort(list, number);
		quickSort(list);
	}

	public static int[] fillArray(int[] list, int number){
		for(int x = 0; x < number; x ++){
			list[x] = (int)(Math.random()*1_000_000);
		}
		return list;
	}

	public static void displayArray(int[] list, int number){
		for(int x = 0; x < number; x ++){
			System.out.print(list[x] + ", ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] list, int number){
		int lowest = 0;
		int position = 0;
		int tempNum = 0;
		int assignment = 0;
		int ifLoop = 0;
		int forLoop = 0;
		for(int x = 0; x < number; x++){
			position = x;
			lowest = list[x];
			assignment += 2;
			for(int y = x; y < number; y++){
				if(list[y] < lowest){
					tempNum = list[y];
					list[y] = lowest;
					lowest = tempNum;
					list[x] = lowest;
					assignment += 4;
					ifLoop += 1;
				}
				forLoop +=1;
			}
			forLoop += 1;
		}
//		displayArray(list, number);
		displayOperations(assignment, ifLoop, forLoop);
	}

	public static void quickSort(int[] list){

	}

	public static void displayOperations(int assignment, int ifLoop, int forLoop){
		System.out.println("Assignments: " + assignment + ", Ifs: " + ifLoop +
			", Fors: " + forLoop);
	}
}
