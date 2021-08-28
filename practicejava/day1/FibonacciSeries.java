package practicejava.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8;
		int fNum = 0;
		int sNum = 1;
		int sum = 0;
		
		System.out.println(fNum);
		System.out.println(sNum);
		
		
		for (int i = 0; i < range; i++) {
			sum = fNum+sNum;
			System.out.println(sum);
			fNum=sNum;
			sNum=sum;
		}
		
		int array[]= {1,3,3,3,3,5,6,6,7,7,7};
		Set<Integer> org = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			org.add(array[i]);
		}
		
		System.out.println(org);

	}

}
