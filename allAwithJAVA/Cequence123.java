package all_A;
/*
15
3 2 1 1 1 1 3 2 2 3 3 1 2 3 2

30
2 1 3 2 3 2 2 2 2 3 2 2 3 2 1 1 3 1 3 2 1 2 3 1 1 3 3 1 3 1

 */
import java.util.Scanner;

public class Cequence123 {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int n=scan.nextInt();
			int one=0, two=0,three=0;
			int arr[]=new int [n];
			for(int i=0;i<n;i++){
				arr[i]=scan.nextInt();
				if(arr[i]==1){
					one ++;
				}else if(arr[i]==2){
					two++;
				}else {
					three++;
				}
			}
			int max= Math.max(one, two);
			max= Math.max(max, three);
			if(max==one){
				System.out.println(two+three);
			}else if(max== two){
				System.out.println(one+three);
			}else {
				System.out.println(two+one);
			}
		}
	}
}
