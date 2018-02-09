package codeforces;

import java.util.*;

public class T_primes {
	private static Scanner scan= new Scanner(System.in);
	public static void main (String[] args){
		while(scan.hasNext()){ 
			ArrayList<String> st=new ArrayList<>();
			int n= scan.nextInt();
			while(n>0){
				int num= scan.nextInt();				
				Boolean flag= cheakTPrime( num);			
				if(flag){
					st.add("YES");
				}else{
					st.add("NO");
				}
				n--;
			}
			for(int i=0;i<n;i++){
				System.out.println(st.get(i));
			}
			st.clear();
		}
	}
	private static Boolean cheakTPrime(int num) {
		ArrayList<Integer> ar=new ArrayList<>();
		int n= (int) Math.sqrt(num);
		boolean flag= true;
		ar.add(1);
		ar.add(num);
		
		for(int i=2;i<=n;i++){
			int p= num%i;
			int k= num/i;
			if((p==0)&&(i==k)){
				ar.add(i);
			}
			if(ar.size()>2)
				flag=false;
		}
		
		return flag;
	}
	
}
