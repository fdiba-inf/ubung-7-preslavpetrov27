package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = false;
        if (  areMinutesValid(minutes) &&  areHoursValid(hours)){
          timeValid=true;
        }
         // Call validation methods
        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
       boolean fiki;
        if (hours>= 0 && hours <24){
         fiki = true;
          
        }else {
          fiki= false;
        }
        return fiki;
    }


    public static boolean areMinutesValid(int minutes) {
      boolean preslava;
      if(minutes>=0 && minutes <60){
        preslava=true;
        

      }else {
        preslava= false;
      }
        return preslava;
    }
}
