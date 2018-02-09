package all_A;
/*
5
1 2 3 5 7

5
1 8 1 5 1

3
963 630 333

5
700 939 173 494 120

6
86 402 133 524 405 610
8
217 779 418 895 996 473 3 22
*/
import java.util.Scanner;

public class WormsEvolution {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int n=scan.nextInt();
			int t=0,i1=0,j1=0,k1=0;
			int arr[]=new int [n];
			for(int i=0;i<n;i++)
			{
				arr[i]= scan.nextInt();			
			}
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(i==j)
						continue;
					for(int k=0;k<n;k++){
						if(j==k)
							continue;
						if(arr[i]==arr[j]+arr[k]){
							i1= i+1;
							j1=j+1;
							k1=k+1;
							t=1;
							break;
						}
					}
				}				
			}
			
			if(t==1){
			System.out.println(i1+" "+j1+" "+k1);
			}else{
				System.out.println("-1");
			}
		}
	}
}
