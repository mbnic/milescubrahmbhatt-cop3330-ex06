/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package base;
import java.time.Year;
import java.util.Scanner;
import java.util.Calendar;

public class App {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        App myApp = new App();
        Person user = new Person();

        myApp.getUserInfo(user);
        String output = myApp.generateOutput(user);
        myApp.printOutput(output);
    }

    public void printOutput(String output)   {
        System.out.println(output);
    }

    public String generateOutput(Person user) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int yearsLeft = user.retireInt - user.ageInt;
        int retireYear = year + yearsLeft;


        return String.format("You have %d years left until you can retire.\nIt's %d, so you can retire in %d.",
                yearsLeft, year, retireYear);
    }

    public void getUserInfo(Person user) {
        System.out.printf("What is your current age? ");
        user.ageString = in.nextLine();
        user.ageInt = Integer.parseInt(user.ageString);

        System.out.printf("At what age would you like to retire? ");
        user.retireString = in.nextLine();
        user.retireInt = Integer.parseInt(user.retireString);
    }
}
