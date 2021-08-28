package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {2,7,11,15};
		
		int target = 9;
		
		Map<Integer,Integer> mapNum	= new LinkedHashMap<Integer,Integer>();
		
		for (int i = 0; i < num.length; i++) {
			mapNum.put(num[i], 0);
		}
		
		for (Entry<Integer, Integer> i : mapNum.entrySet()) {
			
			System.out.println(i.getKey());
			
			System.out.println(i.getValue());
			
		}
		
		
		
	}

}
