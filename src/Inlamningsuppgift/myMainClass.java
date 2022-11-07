package Inlamningsuppgift;

import java.util.Scanner;

public class myMainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        myLogicClass lc = new myLogicClass();


        System.out.println("PROGRAM: INPUT COUNTER.");
        System.out.println("Write as many words you want! When you´re done, write Stop.");
        System.out.println("This program will count the number of letters in every word you input.");

        String userWords = scan.nextLine();

        while (!userWords.equals("Stop")) {
            System.out.println("Enter your word:");
            lc.setNumberOfRows(userWords);
            userWords = scan.nextLine();

        }
        if (userWords.equals("Stop")) {


            System.out.println("You wrote stop!  The total number of rows are: " + lc.getRows() + " and the total number of letters are: "
                    + lc.getNumberOfCharacters());

            System.out.println("The program has successfully finished!");

        }

    }
}