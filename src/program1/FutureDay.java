package program1;

import java.util.Scanner;

public class FutureDay {
	
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.printf("Enter todays date (0-6): ");
        int date = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = in.nextInt();
        
        int future_date = (date + elapsed) % 7;
        String dow = "";

        switch(date){
        case 0: dow = "Sunday";
                break;
        case 1: dow = "Monday";
                break; 
        case 2: dow = "Tuesday";
                break;
        case 3: dow = "Wednesday";
                break;
        case 4: dow = "Thursday";
               break;
        case 5: dow = "Friday";
                break;
        case 6: dow = "Saturday";
                break;
    }

    if (future_date == 0){
        System.out.printf("Todays is %s and the future day is Sunday", dow);
    }else if(future_date == 1){
        System.out.printf("Todays is %s and the future day is Monday", dow);
    }else if(future_date == 2){
        System.out.printf("Todays is %s and the future day is Tuesday", dow);
    }else if(future_date == 3){
        System.out.printf("Todays is %s and the future day is Wednesday", dow);
    }else if(future_date == 4){
        System.out.printf("Todays is %s and the future day is Thursday", dow);
    }else if(future_date == 5){
        System.out.printf("Todays is %s and the future day is Friday", dow);
    }else if(future_date == 6){
        System.out.printf("Todays is %s and the future day is Saturday", dow);
        
    	}
    }
}
