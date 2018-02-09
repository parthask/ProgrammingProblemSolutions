package codeforces;

import java.util.Scanner;

public class PashaAndStick {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			String n1=scan.next();
			long n=Integer.parseInt(n1);
			long c=0;
			for(int i=2;i<n/2;i+=2){
				c++;
			}
			System.out.println(c);
		}
	}
}
