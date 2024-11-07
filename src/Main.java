//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean isLeapYear;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print(name + " welcome ");

//
//        System.out.println("Enter your password: ");
//        String  password = scanner.nextLine();
//        System.out.print(" password was saved \n ");

//        Date date = new Date();


        System.out.println("Enter year of birth: \n ");
        int yearOfBirth = scanner.nextInt();
        System.out.print(" your year of birth was saved \n ");
        System.out.print(" so you are " + (2024 - yearOfBirth) + " years old ");


        isLeapYear = (yearOfBirth % 4 == 0);

        if (isLeapYear) {
            System.out.println(yearOfBirth + " is a leap year.");
        } else {
            System.out.println(yearOfBirth + " is not a leap year.");
        }
    }



//
//        System.out.println("Enter username");
//        Scanner myScanner = new Scanner(System.in);  // Create a Scanner object
//
//        String userInput = myScanner.nextLine();
////        int userNumber = myScanner.nextInt();
//
//        System.out.println("Enter username");



//        System.out.println("Username is: " + myScanner);




}