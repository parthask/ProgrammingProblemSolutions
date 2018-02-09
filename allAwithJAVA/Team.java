package all_A;
/*
3
1 1 0
1 1 1
1 0 0

2
1 0 0
0 1 1

*/

import java.util.Scanner;

public class Team {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int n,x,y=0;
			n=scan.nextInt();
			int arr[]= new int [3];

			int arr2[]=new int [n];

			for(int j=0;j<n;j++){
				x=0;
				for(int i=0;i<3;i++){

					arr[i]=scan.nextInt();
					if(arr[i]==1){
						x++;
					}

				}
				arr2[j]=x;
			}
			for(int j=0;j<n;j++){
				if(arr2[j]>=2){
					y++;
				}

			}
			System.out.println(y);
		}
	}
}
