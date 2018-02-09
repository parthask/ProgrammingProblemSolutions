package all_A;
/*
5
10 12 13 15 10

4
10 20 30 40

5
90 80 70 60 50

6
744 359 230 586 944 442

 */
import java.util.Scanner;

public class Reconnaissance2 {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int n=scan.nextInt();
			int x[]=new int[n];;
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
			}
			int k=1,r=0;
			for(int i=0;i<n;i++){
				if(i==(n-1)){
					x[i]=arr[i]-arr[0];
					if(x[i]<0){
						x[i]=x[i]*(-1);
					}
				}else{
					x[i]=arr[i]-arr[k];
					if(x[i]<0){
						x[i]=x[i]*(-1);
					}
					k++;
				}

			}
			for(int i=1;i<n;i++){
				if(x[0]>x[i]){
					r=i;		
					int temp= x[i];
					x[0]=temp;
					x[i]=x[0];
				}

			}
			
			int p=0;
			for(int i=0;i<n;i++){
				if(i==(n-1)){
					if(i==r){
						if(p==1){
							break;
						}
						System.out.println((i+1)+" "+1);
						p=2;
					}else{
						break;
					}
				}else{
					if(i==r){
						if(p==2){
							break;
						}
						System.out.println((i+1)+" "+(i+2));
						p=1;
					}
				}
			}
		}
	}
}
