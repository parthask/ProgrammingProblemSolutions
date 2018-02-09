package all_A;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			long n = in.nextInt();
			long k = in.nextInt();
			long s = in.nextInt();
			if(n%s != 0){
				n=n/s+1;
			} else{
				n=n/s;
			}
			if(k%s != 0){
				k=k/s+1;
			} else{
				k=k/s;
			}
			System.out.println((long)k*n);
		}
	}

}