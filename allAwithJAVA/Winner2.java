/*
15
put
4
put
4
mut
6
hut
5
kut
8
put
5
rut
8
fut
9
mut
7
jut
7
mut
6
mut
5
rut
4
rut
2
jut
9
*/
package all_A;
import java.util.Scanner;

public class Winner2 {
	private static Scanner cin;

	public static void main(String[] args) {
		cin = new Scanner(System.in);
		while(cin.hasNext()){
			int n = cin.nextInt();
			String [] names = new String[n];
			int [] points = new int[n];

			for(int counter = 0; counter < n; counter++){
				String str = cin.next();
				int point = cin.nextInt();
				names[counter] = str;
				points[counter] = point;
			}
			for(int i=0;i<n-1;i++){
				if(names[i].equals(names[i+1])){
					points[i+1]= points[i]+points[i+1];
					names[i]=null;
					points[i]=0;
				}
				for(int j=0;j<=i;j++){
					if(names[j].equals(names[i+1])){
						names[j]=null;
						points[j]=0;
					}
				}
			}
			for(int i=0;i<n;i++){
				System.out.println(names[i]+" "+points[i]);
			}
		}
	}
}
