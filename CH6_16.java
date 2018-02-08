/*
(Number of days in a year) Write a method that returns the number of days in a year
Write a test program that displays the number of days in year from 2000 to 2020.
 */

public class Ch6_16 {

    public static void main(String[] args) {

        System.out.println("The number of days in a year from 2000 to 2020 is");
        for (int year=2000; year<2021; year++){
            System.out.println("Year: " + year + " Days: " + numberOfDaysInAYear(year));
        }//for loop
    }
    //returns the number of days in years  whether its 366 days or 365
    public static int numberOfDaysInAYear(int year){

            if((year % 400 == 0 ) || ((year % 4 == 0) && (year % 100 != 0)))
                return 366;
            else
                return 365;
    }//numberOfDaysInaYear

}//class Ch6_16