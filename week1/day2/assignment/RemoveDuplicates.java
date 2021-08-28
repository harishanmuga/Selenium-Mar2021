package week1.day2.assignment;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		String[] dupsplit = split;
		
		int count = 0;
		
		for (int i = dupsplit.length-1; i >= 0; i--) {
			
			count = 0;
			
			for (int j = 0; j < dupsplit.length; j++) {
				
				if (split[i].equals(dupsplit[j])) 
					count++;
					
				}if (count>1) {
					
					split[i]="";
					
				} 
				
				} for (String string : split) {
					
					System.out.print(string+" ");
					
				}
			}
			
		}
		
	

