package all_A;
/*
aaaa
aaaA

abs
Abz

abcdefg
AbCdEfF

bwuEhEveouaTECagLZiqmUdxEmhRSOzMauJRWLQMppZOumxhAmwuGeDIkvkBLvMXwUoFmpAfDprBcFtEwOULcZWRQhcTbTbX
HhoDWbcxwiMnCNexOsKsujLiSGcLllXOkRSbnOzThAjnnliLYFFmsYkOfpTxRNEfBsoUHfoLTiqAINRPxWRqrTJhgfkKcDOH


 */

import java.util.*;

public class PetyaAndString {

	private static final Scanner sc = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception {
		while(sc.hasNext()){
			String s=sc.nextLine();
			String n=sc.nextLine();
			String l=s.toUpperCase();
			String m=n.toUpperCase();
			char[]p=l.toCharArray();
			char[]o=m.toCharArray();
			int b=0;

			for(int i=0;i<p.length;i++){
				int j=(int)p[i];
				int k=(int)o[i];
				if(j!=k){
					b++;
					int w=j-k;
					if(w>0){
						System.out.println("1");
					}
					if(w<0){
						System.out.println("-1");
					}
					break;
				}
			}
			if(b==0){
				System.out.println("0");
			}
		}
	}

}



