package edu.guilford;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class FirstExceptionWork {
    public static void main(String[] args) // throws BadNumberException
    {
        Scanner scanner = new Scanner(System.in);
        String entered = "";
        int n = 0;
        boolean valid = false; // did the user enter the correct content?
        do { // a do loop is guaranteed to run at least once; a while loop may never run at
             // all
             // difference between checking the condition at the end of the loop (for do)
             // and at the beginning of the loop (for while)
            try { // try the following code
                System.out.println("Enter an integer: ");
                entered = scanner.next(); // next gets the next token (not the whole line of input includig the end of
                                          // the line)
                n = Integer.parseInt(entered); // try to convert the string to an integer
                if (n == 0) {
                    throw new BadNumberException("Bad number " + n);
                }
                valid = true; // we want to get her because it worked
            } catch (NumberFormatException ex) {
                // print out the stack trees for more deatailed debuggin
                ex.printStackTrace();
                System.err.println(" Input was not an integer " + entered);
                System.err.flush(); // flush the error stream or buffer so that the
                // error messgae is printed before the next prompt
            } catch (BadNumberException ex) {
                ex.printStackTrace();
                System.exit(1); // normal exit is 0; 1 means there was an error
                // and its possible to see other error codes as well
            }
        } while (!valid);

        System.out.println("You entered " + n + "; valid = " + valid);
    }

    // we can write our own exception classes
    private static class BadNumberException extends Exception {
        // all we need in this class is a constructor that tells what is supposed to
        // happen
        // when this exception is thrown
        public BadNumberException(String message) {
            // our constructor has one parameter: the messgae we want to send when this
            // exception is thrown
            super(message);
        }
    }
}
