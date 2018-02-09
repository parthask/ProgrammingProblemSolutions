package all_A;

import java.util.Scanner;

public class WayTooLongWords {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int n=scan.nextInt();
			scan.nextLine();
			String str[]=new String[n];
			for(int i=0;i<n;i++){
				str[i]=scan.nextLine();			
			}

			for(int i=0;i<n;i++){			
				int x=str[i].length();
				if(x>10){
					String ch[]= str[i].split("");
					System.out.println(ch[0]+(x-2)+ch[x-1]);
				}else{
					System.out.println(str[i]);
				}
			}
		}
	}
}
