package codeforces;

import java.util.Scanner;

public class No_1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		while(scan.hasNext()){
			int n,m,k,t=0,p=0,i,j;
			n= scan.nextInt();
			m= scan.nextInt();
			int [] num= new int [n];
			for( i=0;i<n;i++){
				num[i]=scan.nextInt();
			}


			for( i=0;i<n-1;i++){
				for( j=i;j<n;j++){
					if(num[i]<= num[j]){
						k=num[i];
						num[i]=num[j];
						num[j]=k;
					}
				}
			}

			loop: for( i=0;i<n;i++){
				p=p+num[i];
				t++;
				if(p>=m){
					System.out.println(t);
					break loop;
				}
			}
		}
	}
}


