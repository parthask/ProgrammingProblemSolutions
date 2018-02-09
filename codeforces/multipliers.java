package codeforces;
/*
3 4
1 2 3
5 4 4 6
1 4 7
 */
import java.util.*;

public class multipliers {
	private static Scanner scan;

	public static void main (String[] args)  {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n= scan.nextInt();
			int x=1,p=1;
			ArrayList<Integer> ar= new ArrayList<Integer>();
			for(int i=1;i<=n;i++){
				int a= scan.nextInt();
				x= x*a;
			}
			int l= (int) Math.sqrt(x);
			for(int i=1;i<=l;i++){
				loop:	for(int j=x;j>=1;j--){
					if((i*j)==x){
						ar.add(i);
						ar.add(j);
						break loop;
					}
				}
			}
			int ll= ar.size();
			for(int i=0;i<ll;i++){
				p=p*ar.get(i);
			}
			System.out.println(p);
			
			
		}
	}
}
