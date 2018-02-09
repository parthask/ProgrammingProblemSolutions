package all_A;
/*
5 2
1 3 5 2 3

4 2 
1 3 3 2

4 3 
6 2 5 1

5 2
2 2 2 2 2
*/
//import java.util.Scanner;
//
//public class IncreasingSequence {
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//
//		while(scan.hasNext()){
//			int i,j,k=0, x,y,z;
//			x= scan.nextInt();
//			y=scan.nextInt();
//			int arr[]= new int [x];
//			for(i=0;i<x;i++){
//				arr[i]=scan.nextInt();				
//			}
//
//			for(i=0;i<x-1;){
//				if(arr[i]<arr[i+1]){
//					i++;
//				}else{
//					do{
//						arr[i+1] =arr[i+1]+y;
//						k++;
//					}while(arr[i+1]<=arr[i]);				
//					i++;
//				}				
//			}
//
//
//			System.out.println(k);
//		}
//	}
//}

import java.util.Scanner;
public class IncreasingSequence {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int d = Integer.parseInt(scan.next());
		int[] b = new int[n];
		for(int i=0; i<n; i++)
			b[i] = Integer.parseInt(scan.next());
		int moves = 0;
		for(int i=1; i<n; i++)
		{
			if(b[i] <= b[i-1])
			{
				int k = (b[i-1]-b[i])/d;
				k++;
				moves+=k;
				b[i]+=k*d;
			}
		}
		System.out.println(moves);
	}

}

///////int j = (int) ceil((double) (a[i - 1] - a[i] + 1) / d);
//for (int i = 0; i < n; i++) 
//{
//	b[i] = in.nextInt();
//	if (i > 0 && b[i] - b[i-1] <= 0)
//	{
//		int temp = (b[i-1] - b[i] + d) / d;
//		b[i] += temp * d;
//		ans += temp;
//	}
//}

//import java.util.Scanner;
//public class IncreasingSequence {
//	public static void main(String[] args)
//	{
//		Scanner scan = new Scanner(System.in);
//		while(scan.hasNext()){
//			int n = Integer.parseInt(scan.next());
//			int d = Integer.parseInt(scan.next());
//			int x,y, p;
//			p=0;
//			y=scan.nextInt();
//			for(int i=1;i<n;i++){
//				x= scan.nextInt();
//				while(x<=y){
//					x+=d;
//					p++;
//				}
//				y=x;
//			}
//			System.out.println(p);
//		}
//	}
//}
//
//
//












