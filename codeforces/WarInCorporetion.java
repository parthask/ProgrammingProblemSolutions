package codeforces;

import java.util.Scanner;

public class WarInCorporetion {
	private static Scanner scan= new Scanner(System.in);
	public static void main (String[] args){

		String s1= scan.nextLine();
		String s2= scan.nextLine();
		int t=0;

		while( s1.contains(s2)){
			int in= s1.indexOf(s2);
			String st[]= s1.split("");
			st[in+1]="#";
			String s="";
			int l= st.length;
			for(int i=0;i<l;i++){
				s+=st[i];
			}
			s1=s;
			t++;
		}
		System.out.println(t);

	}

}
