/*
* This program gets string containgin numbers from user,
* converts to many occurrences of the character to the right of the digit
* and show the converted string.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-05-02
*/
// package ca.mths.assignment.assignment01.java.main;

import java.util.Scanner;


public final class StringBlowup {
    private StringBlowup() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * This method get the type of food, number of food and
    * prints out the time to reheat in the microwave.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        String convertedString = "";

        // String input
        System.out.print("Enter a string containing numbers to blow up "
                                                        + "(ex. a3tx2z): ");
        String stringWithNumber = myObj.nextLine();

        // Process
        for (int strIndex = 0; strIndex < stringWithNumber.length();
                                                            strIndex++) {
            if (Character.isDigit(stringWithNumber.charAt(strIndex))) {
                if (strIndex != stringWithNumber.length() - 1) {
                    for (int charIndex = 0; charIndex
                            < Character.getNumericValue(
                            stringWithNumber.charAt(strIndex)); charIndex++) {
                        convertedString += stringWithNumber.charAt(strIndex
                                                                     + 1);
                    }
                }
            } else {
                convertedString += stringWithNumber.charAt(strIndex);
            }
        }
        // Output
        System.out.println("The blow up string is " + convertedString + ".");

        System.out.println("\nDone.");
    }
}
