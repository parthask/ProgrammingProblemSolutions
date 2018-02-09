package all_A;
/*
4
1 2 1 1

5
2 4 7 8 10

6
1 3 5 6 7 9
 */
import java.util.Scanner;

public class IQtest {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int x=0,y=0,x1=0,y1=0;
			int n= scan.nextInt();
			int arr[]=new int[n];
			int arr1[]=new int [n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
				arr1[i]=arr[i]%2;		
			}

			for(int i=0;i<n;i++){
				if(arr1[i]==0){
					x1=i+1;
					x++;
				}else{
					y1=i+1;
					y++;
				}
			}
			if(x>y)
				System.out.println(y1);
			else
				System.out.println(x1);
		}
	}
}
