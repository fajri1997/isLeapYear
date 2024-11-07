package CalculateYourAge;
import java.util.Calendar;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (dd/mm/yyyy): \n ");

//        int yearOfBirth = scanner.nextInt();
        System.out.println("enter the day of date of your birthday");
        int day = scanner.nextInt();

        System.out.println("enter the month date of your birthmonth");
        int month = scanner.nextInt()-1;
        System.out.println("enter the year date of your year");
        int year = scanner.nextInt();

        Calendar current = Calendar.getInstance();
        Calendar user = Calendar.getInstance();
        user.set(year, month, day);

        int age = current.get(Calendar.YEAR)- user.get(Calendar.YEAR);

        System.out.println("so you are  "+ age + "years old ");





    }
}