package codeforces;

import java.io.*;
import java.util.*;

public class InfiniteSequence {
	private static Scanner scan= new Scanner(System.in); 
	private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
	public static void main (String[] args) throws NumberFormatException, IOException{
		
		while(true){
		long  n= Long.parseLong(br.readLine());
		findelement(n);
//		long ans= findelement3(n);
//		System.out.println(ans);
	}
	}
	
	private static void findelement(long n) {
		ArrayList <Long> ar = new ArrayList<Long>();
		ar.add((long) 0);
		long j=1;
		while(ar.size()<=n){
			for(Long i=(long) 1;i<=j;i++){
				ar.add(i);
			}
			j++;
		}
		System.out.println(ar.get((int) n));
	}
	
	private static long findelement2(long n) {
		long a=0,i=1;
		while(i<=n){
			a+=i;
			i++;
		}		
		return a;
	}
	
	private static long findelement3(long n) {
		long a=(n*(n+1))/2;		
		return a;
	}
}














