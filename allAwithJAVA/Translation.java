package all_A;

import java.util.Scanner;

public class Translation {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			String str= scan.nextLine();
			String str1=scan.nextLine();
			StringBuilder builder = new StringBuilder(str);
			String reverse = builder.reverse().toString();

			if(reverse.equals(str1)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
