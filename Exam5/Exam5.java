class Exam5{
	public static void main(String[] args){
/*		Write a program to count and print
		all the different ways there are to
		choose half a dozen donuts from
		3 varieties at a donut shop.

		Repeat the exercise for a full dozen
		with 21 varieties.*/

		int count = 0;
		for(int a = 0; a < 3; a++){
			for(int b = 0; b < 3; b++){
				for(int c = 0; c < 3; c++){
					for(int d = 0; d < 3; d++){
						for(int e = 0; e < 3; e++){
							for(int f = 0; f < 3; f++){
								if(count < 10){
									System.out.println(a+""+b+""+c+""+d+""+e+""+f);
								}
								else if(count > 719){
									System.out.println(a+""+b+""+c+""+d+""+e+""+f);
								}
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
