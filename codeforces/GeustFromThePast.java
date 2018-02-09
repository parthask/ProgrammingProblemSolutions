package codeforces;
/*
10
11
9
8

10
5
6
1
private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 // Note: String splitting and/or input parsing is needed afterwards
	private static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
			// PrintWriter allows us to use the pr.printf() function
			// do not forget to call pr.close() before exiting your Java program

 */
import java.io.*;
import java.util.*;
public class GeustFromThePast {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
   
	private static Scanner scan= new Scanner(System.in);
	public static void main (String[] args) throws NumberFormatException, IOException{
			int n =Integer.parseInt(br.readLine());
			int a=Integer.parseInt(br.readLine());
			int b= Integer.parseInt(br.readLine());
			int c= Integer.parseInt(br.readLine());
			int ans= getAns(n,a,b,c);
			System.out.println(ans);
		br.close();
	}
	private static int getAns(int n, int a, int b, int c) {
		int x,y,z=0,o=0,p=0,r=0,ans;
		if(a<=n){
			x=n/a;
			y= x*a;
			y= n-y;
			if(y>=b){
				z=y/b;
			}
			o=x+z;
		}
		
		if(b<=n){
			x=n/b;
			y=x*b;
			y=n-y+c;
			if(y<=a){
			z=a/y;
			z=z+x;
			}
			if(y<=b){
				r=b/y;
				r=r+x;
			}
			
		}
		if(z>=r){
			p=z;
		}else{
			p=r;
		}
		if(o>=p){
			ans=o;
		}else{
			ans=p;
		}
		
		return ans;
	}
}










