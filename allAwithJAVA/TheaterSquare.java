package all_A;

import java.util.*;

public class TheaterSquare {
	public static Scanner scan= new Scanner(System.in);

	public static double noOfTiles(double a,double b, double c){
		double n= Math.ceil(a/c);
		double m= Math.ceil(b/c);
		double x= n*m;
		return x;
	}

	public static void main (String[] args) throws java.lang.Exception {
		double n,m,a, x;
		while(scan.hasNextLine()){
			n= scan.nextDouble();
			m= scan.nextDouble();
			a= scan.nextDouble();
			x=noOfTiles(n,m,a);
			System.out.println((int)x);
		}
	}
}
