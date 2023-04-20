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
        System.out.println(:"please enter an integer: " );
        //Declare a Scanner to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        //read the integer from the keyboard
        int number = keyboard.nextInt();

        //call the sum method and print the result
        System.out.println("The sum of the integers from 1 to " + number + " is " + sum(number) );
        //call the sumWhile method and print the result
        System.out.println("The sum of the integers from 1 to " + number + " is " + sumWhile(number) );
        

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
