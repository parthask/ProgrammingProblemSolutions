package all_A;
/*
3 3
000
000
111

3 3
000
111
002

4 3
233
333
444
555

3 3
444
777
444

 */
public class Flag{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        while(input.hasNext()){
        String[] x = new String[input.nextInt()];
        int l = input.nextInt();
        boolean m = true;
        for(int i = 0; i < x.length; i++){
            x[i] = input.next();
            for(int j = 0 ; j < l-1 && l > 1; j++)
                if(x[i].charAt(j) != x[i].charAt(j+1))
                    m = false;
            for(int k = i; k > 0; k--)
                if(x[k].equals(x[k-1]))
                    m = false;
        }
        System.out.println(m ? "YES" : "NO");
        }
    }
}

//import java.util.Scanner;
//
//public class Flag {
//	private static Scanner scan;
//	public static void main(String[] args) {
//		scan = new Scanner(System.in);	
//		while(scan.hasNext()){
//			int n,m,x=0,y=1,p,z=1;
//			n=scan.nextInt(); 
//			m=scan.nextInt();
//			p=n*m;
//			scan.next();
//			String str[]=new String [n];
//			String str2=scan.nextLine();
//			for(int i=0;i<n-1;i++){  
//				str[i]=scan.nextLine();
//				if(str2.equals(str[i])){
//					String str1[]= str[i].split("");
//					int len = str1.length;
//					for(int j=0;j<len;j++){
//						if(str1[j].matches(str1[0])){
//							x=1;
//						}
//
//					}
//					str2=str[i];
//				}else{
//					y=0;
//				}
//			}
//			if(x==1 && y==1){
//				System.out.println("YES");
//			}else if(y==0){
//				System.out.println("NO");
//			}
//			
//		}
//	}
//}
