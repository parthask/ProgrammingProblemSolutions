package all_A;

import java.util.Scanner;

public class NoldbatchProblem {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int x,y,z=0,p=0;		
			x= cin.nextInt();
			y= cin.nextInt();
			int arr[]=new int [x];
			for(int i=2;i<=x;i++){
				if(isPrime(i)){
					arr[p]=i;
					p++;
				}
			}
			loop:	for(int i=0;i<p-1;i++){
				int a= arr[i]+ arr[i+1]+1;
				if(isPrime(a)){

					if(a<=x){
						z++;
					}else{
						break loop;
					}
				}
			}
			if(z>=y){
				System.out.println("YES");

			}else{
				System.out.println("NO");
			}
		}
	}

	public static boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number) + 1;
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0) { 
				// number is perfectly divisible - no prime
				return false;
			}
		} 
		return true; 
	}
}
//	public static boolean isPrime(int num) {
//		if (num == 2 )
//			return true;
//		if (num % 2 == 0) 
//			return false;
//		for (int i = 3; i * i <= num; i += 2){
//			if (num % i == 0){
//				return false;
//			}
//		}
//		return true;
//	}



//import java.util.*;
//
///**
// *
// * @author VMCUONG
// */
//public class Problem17A {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean  isPrime[] = new boolean[1000];
//        Arrays.fill(isPrime, true);
//        for(int i = 2; i * i < 1000; i++)
//            if(isPrime[i])
//                for (int j = i*i; j < 1000; j+=i) 
//                    isPrime[j] = false;
//                
//        
//        int n = sc.nextInt(), k = sc.nextInt(), count = 0;
//        for(int i = 3; ;i+=2){
//            if(isPrime[i]){
//                int j = i + 2;
//                
//                for( ;!isPrime[j]; j++);
//                
//                if(i+j+1>n)
//                    break;
//                if(isPrime[1+i+j])
//                    count++;
//                
//            }
//        }
//        System.out.println(count>=k? "YES": "NO");
//    }
//}





