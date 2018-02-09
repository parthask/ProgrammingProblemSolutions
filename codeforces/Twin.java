package codeforces;

import java.util.*;
public class Twin {

	private static Scanner scan= new Scanner(System.in);
	public static void main (String[] args){
		while(scan.hasNext()){	
			int s=0;
			int n= scan. nextInt();
			int []ar= new int[n];
			for(int i=0;i< n;i++){
				ar[i]= scan.nextInt();
				s+=ar[i];
			}
			Arrays.sort(ar);
			int t= findmin(ar,s);
			System.out.println(t);
		}
	}
	private static int findmin(int[] ar, int s) {
		int min=0, a=0;
		int l= ar.length;
		for(int i=l-1; i>=0;i--){
			a+=ar[i];
			int p= s-a;
			min++;
			if(a>p)
				break;
		}
		return min;
	}
}
