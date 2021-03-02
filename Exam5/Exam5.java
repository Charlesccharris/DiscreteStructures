import java.lang.*;

class Exam5{
	public static void main(String[] args){
/*		Write a program to count and print
		all the different ways there are to
		choose half a dozen donuts from
		3 varieties at a donut shop.

		Repeat the exercise for a full dozen
		with 21 varieties.
*/

		System.out.println("For 6 donuts, with three varieties");
		int varieties = 3;
		int donuts = 6;

		long count = 0;
		for(int a = 0; a < 3; a++){
			for(int b = 0; b < 3; b++){
				for(int c = 0; c < 3; c++){
					for(int d = 0; d < 3; d++){
						for(int e = 0; e < 3; e++){
							for(int f = 0; f < 3; f++){
								if(count < 10){
									System.out.println(a+", "+b+", "+c+", "+d+", "+e+", "+f);
								}
								count++;
							}
						}
					}
				}
			}
		}

		System.out.println("Total combinations:" + count);
		System.out.println("Unique combinations: " + uniqueCount(donuts, varieties));

		System.out.println("For 12 donuts, and 21 varieties");
		donuts = 12;
		varieties = 21;
		count = 0;
/*		for(int a = 0; a < 21; a++){
			for(int b = 0; b < 21; b++){
				for(int c = 0; c < 21; c++){
					for(int d = 0; d < 21; d++){
						for(int e = 0; e < 21; e++){
							for(int f = 0; f < 21; f++){
								for(int g = 0; g < 21; g++){
									for(int h = 0; h < 21; h++){
										for(int i = 0; i < 21; i++){
											for(int j = 0; j < 21; j++){
												for(int k = 0; k < 21; k++){
													for(int l = 0; l < 21; l++){
														if(count < 10){
															System.out.println(a+", "+b+", "+c+", "
																+d+", "+e+", "+f+", " +g+
																", "+h+", "+i+", "+j+
																", "+k+", "+l);
														}
														count++;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}*/

		System.out.println("Unique combinations: " + uniqueCount(donuts, varieties));
		System.out.println("Total combinations: " + totalCount(donuts, varieties));

		System.out.println("For 6 donuts, with 10 varieties");
		donuts = 6;
		varieties = 10;
		System.out.println("Unique combinations: " +  uniqueCount(donuts, varieties));
		System.out.println("Total combinations: " + totalCount(donuts, varieties));

	}

	public static long uniqueCount(int r, int n){
		long topTotal = 1;
		long bottomTotal = 1;
		long total;
		n = n+r-1;
		long top = n;
		long bottomLeft = r;
		long bottomRight = n - r;

		while(top>bottomRight){
			topTotal *= top;
			top -= 1;
		}
		while(bottomLeft > 0){
			bottomTotal *= bottomLeft;
			bottomLeft -= 1;
		}
		total = topTotal/bottomTotal;
		return total;
	}

	public static long totalCount(int slots, int numbers){
		double answer = Math.pow(numbers, slots);
		return (long)answer;
	}
}

