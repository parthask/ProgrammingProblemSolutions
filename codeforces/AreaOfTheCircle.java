package codeforces;

import java.util.Scanner;

public class AreaOfTheCircle {
	private static Scanner scan;

	public static void main (String[] args)  {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			double n= scan.nextDouble();
			double m = (n*n) * 3.14159;
			System.out.print("A=");
			System.out.printf("%.4f",m);
			System.out.println();
		}
	}
}
