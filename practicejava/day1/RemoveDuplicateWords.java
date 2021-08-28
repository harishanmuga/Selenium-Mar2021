package practicejava.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		String[] dupsplit = split;
		
		int count = 0;
		
		for (int i = dupsplit.length-1; i >= 0; i--) {
			//for (int i = 0; i <= dupsplit.length-1; i++) {
			count = 0;
			for (int j = 0; j < dupsplit.length; j++) {
				if (split[i].equalsIgnoreCase(dupsplit[j])) {
					count++;
				}
				if (count>1) {
					split[i]="";
					
				}
			}
		}

		for (String string : split) {
			System.out.print(string+" ");
		}
	}

}
