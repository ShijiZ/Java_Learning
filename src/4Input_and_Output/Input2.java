import java.util.Scanner;

public class Input2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Getting float input
        System.out.print("Enter float: ");
        float myFloat = input.nextFloat();
        System.out.println("Float entered: " + myFloat);

        // Getting double input
        System.out.print("Enter double: ");
        double myDouble = input.nextDouble();
        System.out.println("Double entered: " + myDouble);

        // Getting string input
        System.out.print("Enter string: ");
        String myString = input.next();
        System.out.println("String entered: " + myString);
    }
}
