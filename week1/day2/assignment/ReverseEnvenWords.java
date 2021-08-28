package week1.day2.assignment;

public class ReverseEnvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am an software tester";
		String[] split = text.split(" ");
		String op = "";
		
		for (int i = 0; i <= split.length-1; i++) {
			if(i%2==0) {
				char[] charArray = split[i].toCharArray();
				for (int j = charArray.length-1; j >= 0 ; j--) {
					System.out.print(charArray[j]);				
					//String string = Character.toString(charArray[j]);
					//System.out.print(string);
					//op = string;
					//System.out.print(op+" ");
				}
				
			} else {
				System.out.print(" "+split[i]+" ");
			}
		}
	}

}
