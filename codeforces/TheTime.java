package codeforces;
/*
11:20
20

12:50
120

23:20
50
 */
import java.util.Scanner;

public class TheTime {
	private static Scanner scan= new Scanner(System.in);
	public static void main (String[] args){
		while(scan.hasNext()){ 
			String r1,t1;
			String s1= scan.next();
			int t= Integer.parseInt(scan.next());
			String s[]= s1.split(":");
			int f= Integer.parseInt(s[0]);
			int se= Integer.parseInt(s[1]);
			f=f*60+se+t;
			int r=f/60;
			t= r*60;
			t=f-t;
			while(r>24){
				r=r-24;
			}
			if(r>=10){
				if(r==24){
					r1="00";
				}else{
					r1=Integer.toString(r);
				}
			}else{
				r1="0".concat(Integer.toString(r));
			}
			if(t>=10){
				
					if(t==60){
						t1="00";
					}else{
						t1=Integer.toString(t);
					}
			}else{
				t1= "0".concat(Integer.toString(t));
			}
			System.out.println(r1+":"+t1);
		}
	}
}







