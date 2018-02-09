package all_A;

import java.util.*;

public class Main2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] people = new String[n];
		int[]  values = new int[n];
		Map<String,Integer> map = new HashMap<>();
		for(int i =0;i<n;i++){
			String a = sc.next();
			int b = sc.nextInt();
			people[i] = a;
			int score = b;
			Integer cur = map.get(a);
			if(cur != null){
				score+= cur;
			}
			values[i] = score;
			map.put(a, score);
		}
		int max = Integer.MIN_VALUE;
		for(String key: map.keySet()){
			max = Math.max(max, map.get(key));
		}
		for(int i =0;i<n;i++){
			if(values[i]>=max && map.get(people[i])== max){
				System.out.println(people[i]);
				break;
			}
		}
	}
}