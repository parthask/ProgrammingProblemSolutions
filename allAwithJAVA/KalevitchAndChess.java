package all_A;
/*
WWWWBWWB
WWWWBWWB
WWWWBWWB
WWWWBWWB
WWWWBWWB
BBBBBBBB
WWWWBWWB
BBBBBBBB

BBBBBBBB
WBBWWWBB
BBBBBBBB
WBBWWWBB
BBBBBBBB
BBBBBBBB
WBBWWWBB
BBBBBBBB

WWWBWWBW
BBBBBBBB
WWWBWWBW
WWWBWWBW
WWWBWWBW
WWWBWWBW
WWWBWWBW
WWWBWWBW

BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
BBBBBBBB
*/
import java.util.Scanner;

public class KalevitchAndChess {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		while(scan.hasNext()){
			String str1 = null;
		String arr []=  new String[8];
		int n=0;
		for(int i=0; i<8;i++){
			arr[i]= scan.nextLine();
		}
		for(int i=0;i<8;i++){
			if(arr[i].equals("BBBBBBBB")){
				n++;
			}else{
				str1= arr[i];
			}
		}
		if(n==8){
			System.out.println(n);
		}else{
		String str[]= str1.split("");
		for(int j=0;j<8;j++){
			if(str[j].equals("B"))
				n++;
		}	
		System.out.println(n);
		}
		
		}
	}

}


//import java.util.Scanner;
//
//public class KalevitchAndChess {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		while(scan.hasNext()){
//			String arr;
//			char ch[][]= new char[10][10];
//			int nc=0,nr=0,nb,p=0,k=0;
//			for(int i=0; i<8;i++){
//				arr= scan.nextLine();
//				for(int j=0;j<8;j++){
//					 ch[i][j]= arr.charAt(j);
//				}		
//				if(arr.equals("BBBBBBBB")){
//					nc++;
//				}
//			}
//			
//			for(int i=0;i<8;i++){
//				nb=0;
//				for(int j=0;j<8;j++){
//					if(ch[j][i]=='B'){
//						nb++;
//					}
//				}
//				if(nb==8){
//					nr++;
//				}
//			}
//			if(nc==8){
//				System.out.println(nc);
//			}else{
//				System.out.println(nc+nr);
//			}
//			}
//	}
//
//}
//
//
////import java.util.Scanner;
////
////public class Main {
////
////    public static void main(String args[]) {
////        Scanner in = new Scanner(System.in);
////        char[][] m = new char[8][8];
////        for (int i = 0; i < 8; i++) {
////            String s = in.next();
////            for (int j = 0; j < 8; j++) {
////                m[i][j] = s.charAt(j);
////            }
////        }
////        int cont = 0;
////        for (int i = 0; i < 8; i++) {
////            int n = 0;
////            for (int j = 0; j < 8; j++) {
////                if (m[i][j] == 'B') {
////                    n++;
////                }
////            }
////            if (n == 8) {
////                cont++;
////            }
////        }
////        for (int i = 0; i < 8; i++) {
////            int n = 0;
////            for (int j = 0; j < 8; j++) {
////                if (m[j][i] == 'B') {
////                    n++;
////                }
////            }
////            if (n == 8) {
////                cont++;
////            }
////        }
////        System.out.println(cont == 16 ? 8 : cont);
////    }
////}
