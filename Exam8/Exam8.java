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
		int[] list2 = new int[number];

		list = fillArray(list, number);
		list2 = fillDupe(list, number);

//		displayArray(list, number);
//		displayArray(list2, number);

		Operations bubbleOps = new Operations();
		Operations quickOps = new Operations();

		StopWatch bWatch = new StopWatch();
		bWatch.start();
		bubbleSort(list, number, bubbleOps);
		bWatch.stop();
		bubbleOps.showOps();

//		displayArray(list, number);
//		displayArray(list2, number);

		StopWatch qWatch = new StopWatch();
		qWatch.start();
		quickSort(list2, quickOps);
		qWatch.stop();
		quickOps.showOps();

//		displayArray(list, number);
//		displayArray(list2, number);
	}

	public static int[] fillArray(int[] list, int number){
		for(int x = 0; x < number; x ++){
			list[x] = (int)(Math.random()*1_000_000);
		}
		return list;
	}

	public static int[] fillDupe(int[] list, int number){
		int[] numbers = new int[number];
		for(int x = 0; x < number; x++){
			numbers[x] = list[x];
		}
		return numbers;
	}

	public static void displayArray(int[] list, int number){
		for(int x = 0; x < number; x ++){
			System.out.print(list[x] + ", ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] list, int number, Operations bubbleOps){
		int lowest = 0;
		int position = 0;
		int tempNum = 0;
		bubbleOps.addAssignment(3);
		for(int x = 0; x < number; x++){
			bubbleOps.addFor(1);
			bubbleOps.addAssignment(2);
			position = x;
			lowest = list[x];
			for(int y = x; y < number; y++){
				bubbleOps.addFor(1);
				if(list[y] < lowest){
					bubbleOps.addAssignment(4);
					bubbleOps.addIf(1);
					tempNum = list[y];
					list[y] = lowest;
					lowest = tempNum;
					list[x] = lowest;
				}
			}
		}
	}

	public static void quickSort(int[] list, Operations qO){
		quickSort(list, 0, list.length -1, qO);
	}

	public static void quickSort(int[] list, int first, int last, Operations qO){
		if(last > first){
			qO.addIf(1);
			int pivotIndex = partition(list, first, last, qO);
			quickSort(list, first, pivotIndex - 1, qO);
			quickSort(list, pivotIndex + 1, last, qO);
		}
	}

	public static int partition(int[] list, int first, int last, Operations qO){
		int pivot = list[first];
		int low = first + 1;
		int high = last;
		qO.addAssignment(3);
		while(high > low){
			qO.addWhile(1);
			while(low <= high && list[low] <= pivot){
				qO.addWhile(1);
				qO.addPlus(1);
				low++;
			}

			while(low <= high && list[high] > pivot){
				qO.addWhile(1);
				qO.addMinus(1);
				high--;
			}

			if(high > low){
				qO.addIf(1);
				qO.addAssignment(3);
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}

		while(high > first && list[high] >= pivot){
			qO.addWhile(1);
			qO.addMinus(1);
			high--;
		}

		if(pivot > list[high]){
			qO.addIf(1);
			qO.addAssignment(2);
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else{
			return first;
		}
	}
}

