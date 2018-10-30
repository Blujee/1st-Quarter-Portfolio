package program3;

import java.util.Scanner;

public class TrueFalseBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			double f;
			double c;
			
			
			System.out.println("What is the teperature?");
			f = input.nextInt();
			
			c = (f-32)*.5556;
			
			
			System.out.println("The Celcius is " +c +" degrees" );
	}

}
