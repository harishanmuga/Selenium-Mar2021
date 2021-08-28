package practicejava.day1;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		int[] id = new int[3];
		int[] salary = new int[3];
		String[] name = new String[3];
		
		for (int i = 0; i < 3 ; i++) {
			System.out.println("Enter employee id: ");
			int empId = obj.nextInt();
			id[i] = empId;
			System.out.println("Enter employee salary: ");
			int empSalary = obj.nextInt();
			salary[i] = empSalary;
			System.out.println("Enter employee name: ");
			obj.nextLine();
			String empName = obj.nextLine();
			name[i] = empName;
		}
		
		for (int i=0;i<
				id.length;i++) {
			System.out.println(id[i]);
			System.out.println(salary[i]);
			System.out.println(name[i]);
		}
		
		
		int max = salary[0];
		int index = 0;
		
		for (int i = 1; i < salary.length; i++) {
			if (salary[i]>max) {
				max = salary[i];
				index = i;
			}
		}
		
		System.out.println(id[index]);
		System.out.println(name[index]);
		
		
	}

}
