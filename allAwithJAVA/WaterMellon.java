package all_A;

import java.util.Scanner;

public class WaterMellon {
	public static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		int x;
		while(scan.hasNext()){
			x= scan.nextInt();
			if(x>2){
				if(x%2!=0){
					System.out.println("NO");
				}else{
					System.out.println("YES");
				}
			}else{
				System.out.println("NO");
			}
		}

	}
}
