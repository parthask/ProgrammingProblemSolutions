package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class GivenLengthAndSumOfDigits {
	private static Scanner scan= new Scanner(System.in);
	public static void main (String[] args){
		while(scan.hasNext()){	

			int n= scan.nextInt();
			int s= scan.nextInt();
			boolean flag=false;
			String max = getmaxarr(n,s);
			if(max.contains("0")){
				flag=true;
			}
			String min = getminarr(n,s, flag);
			if(s==0 && n>1){
				min="-1"; max="-1";
			}
			if(s==0  && n==1){
				min="0"; max="0";
			}
			System.out.println(min+" "+max );
		}	
	}
	private static String getminarr(int n, int s, boolean flag) {
		int ar []= new int [n];
		String ans="";
		Arrays.fill(ar, 0);
		if(s<=9 || s>=n){
			if(n==1){
				ar[0]=s;
			}else{
				ar[0]=1;
				ar[n-1]= s-1;
			}
			ans= getmaxorminnum(ar);
		}
		int p=n;
		if(s>9){
			int c= 1;
			while(p>0){
				c+=9;
				p--;
			}
			if(s>=c){
				ans= "-1";
			}else{
				if(flag){
					ar[0]= 1;
					s=s-1;
				}
				for(int i=n-1;i>=0;i--){
					if(s<9){
						ar[i]=s;
						ans= getmaxorminnum(ar);
						break;
					}
					ar[i]= 9;
					s=s-9;
					if(i== 0){
						ans= getmaxorminnum(ar);
						break;
					}
				}
			}
		}
		return ans;
	}
	private static String getmaxarr(int n, int s) {
		int ar []= new int [n];
		String ans="";
		Arrays.fill(ar, 0);
		if(s<9){
			ar[0]= s;
			ans= getmaxorminnum(ar);
		}
		if(s==9){
			ar[0]= 9;
			ans= getmaxorminnum(ar);
		}
		int p=n;
		if(s>9){
			int c= 1;
			while(p>0){
				c+=9;
				p--;
			}
			if(s>=c){
				ans= "-1";
			}else{
				for(int i=0;i<n;i++){
					if(s<9){
						ar[i]= s;
						ans= getmaxorminnum(ar);
						break;
					}
					ar[i]= 9;
					s-=9;
					if(i== n-1){
						ans= getmaxorminnum(ar);
						break;
					}
				}
			}
		}
		return ans;
	}
	private static String getmaxorminnum(int[] ar) {
		String ans="";
		int l= ar.length;
		for(int i=0;i<l;i++){
			ans+=Integer.toString(ar[i]);		
		}
		return ans;
	}
}
