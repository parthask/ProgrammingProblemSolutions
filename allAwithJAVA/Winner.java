package all_A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Winner {

    private static Scanner cin;
	public static void main(String[] args) {
        cin = new Scanner(System.in);
        HashMap<String,Integer> pointMap = new HashMap<String,Integer>();
        int n = cin.nextInt();
        String [] names = new String[n];
        int [] points = new int[n];
        
        for(int counter = 0; counter < n; counter++){
            String str = cin.next();
            int point = cin.nextInt();
            names[counter] = str;
            points[counter] = point;  
            
            if(!pointMap.containsKey(str)){
                pointMap.put(str, point);
            }else{
                int number = pointMap.get(str);
                number += point;
                pointMap.put(str, number);
            }
        }       
        System.out.println(solution(pointMap, names, points));
    } 
	
	
    public static String solution(HashMap<String,Integer> pointMap, String [] names, int [] points){
        int max = findMaxNumber(pointMap);
        HashMap<String,Integer> resultMap = new HashMap<String,Integer>();
        ArrayList<String> maxPointNames = maxNames(pointMap, max);
        
        for(int counter = 0; counter < names.length; counter++){
            String str = names[counter];
            int point = points[counter];
            
            if(!resultMap.containsKey(str)){
                if(point >= max && maxPointNames.contains(str)){
                    return str;
                }else{
                    resultMap.put(str, point);
                }
            }else{
                int number = resultMap.get(str);
                number += point;
                
                if(number >= max && maxPointNames.contains(str)){
                    return str;
                }else{
                    resultMap.put(str, number);
                }
            }
        }
        
        return null;
    }
    
    
    public static ArrayList<String> maxNames(HashMap<String,Integer> pointMap, int max){
        ArrayList<String> result = new ArrayList<String>();
        Set<String> keySet = pointMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        
        while(iterator.hasNext()){
            String str = iterator.next();
            int point = pointMap.get(str);
            
            if(point == max){
                result.add(str);
            }
        }    
        return result;
    }
    
    
    
    public static int findMaxNumber(HashMap<String,Integer> pointMap){
        Set<String> keySet = pointMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        int max = pointMap.get(iterator.next());
        
        while(iterator.hasNext()){
            int number = pointMap.get(iterator.next());
            
            if(number > max){
                max = number;
            }
        }
        
        return max;
    }

}