package program5;

import java.util.Scanner;

public class MultiWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your 10 grade percentages:");
		
		Scanner input = new Scanner(System.in); 
		
		String grade;
		grade = "invalid";
		
	
		
		int g1;
		int g2;
		int g3;
		int g4;
		int g5;
		int g6;
		int g7;
		int g8;
		int g9;
		int g10;
		
		int sum;
		int avg;

		

		System.out.println("What is your first grade?");
		g1 = input.nextInt();
		
		System.out.println("What is your second grade?");
		g2 = input.nextInt();
		
		System.out.println("What is your third grade?");
		g3 = input.nextInt();
		
		System.out.println("What is your fourth grade?");
		g4 = input.nextInt();
		
		System.out.println("What is your fifth grade?");
		g5 = input.nextInt();
		
		System.out.println("What is your sixth grade?");
		g6 = input.nextInt();
		
		System.out.println("What is your seventh grade?");
		g7 = input.nextInt();
		
		System.out.println("What is your eighth grade?");
		g8 = input.nextInt();
		
		System.out.println("What is your ninth grade?");
		g9 = input.nextInt();
		
		System.out.println("What is your tenth grade?");
		g10 = input.nextInt();
		
		sum = g1+g2+g3+g4+g5+g6+g7+g8+g9+g10;
		
		avg = sum/10;
		
		
		if (avg >=90) {
			grade = "A";
		}
		else if ( avg >=80) {
			grade = "B";
		}
		else if ( avg >=70) {
			grade = "C";
		}
		else if ( avg >=60) {
			grade = "D";
		}
		else if ( avg >=0) {
			grade = "F";
		}
		else {
			System.out.println("Grade average is not 1-100");
		}
		
		if (!grade.equals("invalid")) {
			System.out.println("Youre average grade is " +grade);
		}

	}

}
