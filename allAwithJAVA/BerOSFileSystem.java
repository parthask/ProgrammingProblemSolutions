package all_A;

//uusr///locaal//ngiinx/sbbin
///c:)///user////funny:///usB:

import java.util.Scanner;

public class BerOSFileSystem {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		while(scan.hasNext()){
			int x,y,i,j=0,tr=0;

			String str= scan.nextLine();
			x= str.length();

			if(str.length()==1){
				System.out.println(str);
			}else{
				loop:	for(int l=0;l<x;){
					if(str.charAt(l)=='/'){
						l++;
						tr=1;
					}else{
						tr=0;
						break loop;
					}
				}
			if(tr==1){
				System.out.println('/');
				continue;
			}

			for(i=0;i<x-1;){
				if(str.charAt(i)==str.charAt(i+1)){
					if((Character.isAlphabetic(str.charAt(i)))&&
							(Character.isAlphabetic(str.charAt(i+1)))){
						System.out.print(str.charAt(i));						
					}
					i++;
				}else {

					System.out.print(str.charAt(i));
					i++;

				}
			}
			if(str.charAt(x-1)!='/'){
				System.out.println(str.charAt(x-1));
			}else{
				System.out.println();
			}

			}
		}
	}
}

