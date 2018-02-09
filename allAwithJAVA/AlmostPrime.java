package all_A;

import java.util.Scanner;

public class AlmostPrime {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int n= scan.nextInt();
			int count =0,x,y;

			for(int i=1;i<=n;){
				if(isPrime(i)){
					i++;
				}else{
					for(int j=2;j<=i;){
						if(isPrime(j)){
							x=i%j;
							if(x==0){
								count++;
							}
							j++;
						}
						j++;
					}
					i++;
				}
			}
			System.out.println((int)Math.ceil(count/2));
		}
	}
	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) { 
				return false;
			}
		} 
		return true; 
	}
}
