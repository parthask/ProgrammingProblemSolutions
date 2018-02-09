package all_A;
/*
5 10
10 20 50 60 65

5 1
55 30 29 31 55

 */
import java.util.Scanner;

public class Reconnaissance {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int c;
			int n=scan.nextInt();
			int d=scan.nextInt();
			int x=0;
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			int r=0,j=0;
			for(int i=0;i<n;i++){
				for(int k=0;k<n;k++){
					if(k==i)
						continue;
					c=arr[i]-arr[k];

					if(c<0){
						c=c*(-1);
					}
					if(c<=d){
						x++;

					}

				}
			}

			int result=x;
			System.out.println(result);
		}
	}
}
