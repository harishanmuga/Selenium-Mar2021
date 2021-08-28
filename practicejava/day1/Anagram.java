package practicejava.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "stops";
		String b = "potss";
		int count = 0;
		
		// to check both strings has same value or not.
		
		if (a.length()==b.length()) {
			char[] c = a.toCharArray();
			char[] d = b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			for (int i = 0; i < c.length; i++) {
				if (c[i]==d[i]) {
					System.out.println(c[i]+" = "+d[i]);
				} else {
					System.out.println(c[i]+" != "+d[i]);
					count++;
				}
				
			}
			if (count>0) {
				System.out.println("Not Anagram");
			}else {
				System.out.println("Anagram");
			}
		}

	}

}
