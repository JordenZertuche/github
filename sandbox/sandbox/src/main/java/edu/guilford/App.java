package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
        //Ask the user for an integer
        System.out.println("please enter an integer: " );
        //Declare a Scanner to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        //read the integer from the keyboard
        int number = keyboard.nextInt();


        //build a switch statement that does different choices for 1, 2, 3, 4, and 5
        switch (number) {
        case 1:
            System.out.println("You entered 1");
            break;
        case 2:
            System.out.println("You entered 2");
            break;
        case 3:
            System.out.println("You entered 3");
            break;
        case 4:
            System.out.println("You entered 4");
            break;
        case 5: 
            System.out.println("You entered 5");
            break;
        default:    //whats done if no other case is satisfied
            System.out.println("You entered something other than 1, 2, 3, 4, or 5");
            break;
        }



        //call the sum method and print the result
        System.out.println("The sum of the integers from 1 to " + number + " is " + sum(number) );

        //call the sumWhile method and print the result
        System.out.println("The sum of the integers from 1 to " + number + " is " + sumWhile(number) );

        //print a message if the result of sumwhile is a really big number
        if (sumWhile(number) > 1000000) {
            System.out.println("That's a really big number!");
        }
        


    }

    //write a method that adds the integers from 1 to n
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //write a method that uses a while loop to add the integers from 1 to n
    public static int sumWhile(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }
}
