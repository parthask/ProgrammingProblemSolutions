package all_A;

import java.util.Scanner;

public class StringTask {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			String s= scan.nextLine().toLowerCase();
			String []str={"a","e","i","o","u","y"};
			String str1[]=s.split("");
			int l1= str1.length;
			String s1[]=new String [l1];

			for(int i=0;i<str1.length;i++){
				loop:	for(int j=0;j<str.length;){
					if(str1[i].equals(str[j])){
						str1[i]="";
						break loop;

					}else{
						j++;
					}
				}
			}
			for(int i=0;i<l1;){
				if(str1[i].equals("")){
					i++;
				}else{
					System.out.print("."+str1[i]);
					i++;
				}
			}
			System.out.println();
		}
	}
}
