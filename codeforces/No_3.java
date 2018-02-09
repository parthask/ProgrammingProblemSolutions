package codeforces;

import java.util.Scanner;

public class No_3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		while(scan.hasNext()){
			int n,i,j,k,t=0,p;
			n= scan.nextInt();
			int arr[]= new int[n];
			for(i=0;i<n;i++){
				arr[i]= scan.nextInt();
			}
			
			p=n-1;
			for( i=0;i<n-1;i++){
				for( j=i;j<n;j++){
					if(arr[i]<= arr[j]){
						k=arr[i];
						arr[i]=arr[j];
						arr[j]=k;
					}
				}
			}
			for( i=0;i<n-1;i++){
					arr[i]= arr[p]-1;
					
				
				
			}
					
		}

	}

}
