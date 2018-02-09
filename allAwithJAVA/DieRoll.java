package all_A;

import java.util.Scanner;

public class DieRoll {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);

		while(scan.hasNext()){
			int w,y,d=0,i,j,a,b,c;
			w=scan.nextInt();
			y=scan.nextInt();
			if(w>y){
				d=6-w;
			}else{      
				d=6-y;
			}
			a=d+1;
			if(a==1){
				System.out.println("1/6");
			}else if(a==2){
				System.out.println("1/3");
			}else if(a==3){
				System.out.println("1/2");
			}else if(a==4){
				System.out.println("2/3");
			}else if(a==5){
				System.out.println("5/6");
			}else if(a==6){
				System.out.println("1/1");
			}else{
				System.out.println("0/1");
			}

		}
	}

}
