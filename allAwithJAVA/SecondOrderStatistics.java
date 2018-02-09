package all_A;
/*
5
1 2 3 1 1

1
28

4
1 2 2 -4

3
-83 40 -80

8
93 77 -92 26 21 -48 53 91
 */
import java.util.Scanner;

public class SecondOrderStatistics {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int result,x,temp=0;
			int n= scan.nextInt();
			int arr[]=new int [n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}

			if(arr.length==1){
				System.out.println("NO");
			}
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(arr[i]>=arr[j]){				
						result= arr[j];
						arr[j]=arr[i];
						arr[i]=result;
					}

				}
			}
			x=arr[0];
			for(int i=1;i<n;i++){
				if(x==arr[i]){
					temp++;

				}

				if((temp+1)==arr.length){
					System.out.println("NO");
					break;
				}
			}

			x=arr[temp];
			loop:	for(int i=temp+1;i<n;){
				if(x==arr[i]){
					i++;
				}else{
					System.out.println(arr[i]);
					break loop;
				}
			}

		}
	}
} 
