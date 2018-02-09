package all_A;

import java.util.Scanner;

public class PatrickAndShopping {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			int arr[]=new int [4];
			int x;
			for(int i=0;i<4;i++){
				if(i==0)
					arr[i]=(a+b)*2;
				if(i==1)
					arr[i]=(a+c)*2;
				if(i==2)
					arr[i]=(a+b+c);
				if(i==3)
					arr[i]=(b+c)*2;				
			}
			x= arr[0];
			for(int i=0;i<4;i++){
				if(x>=arr[i]){
					x=arr[i];
				}
			}
			System.out.println(x);
		}
	}
}
