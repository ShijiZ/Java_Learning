import java.util.Scanner;

public class Continue2 {
    public static void main(String[] args){

        Double number, sum = 0.;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i){
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if (number < 0){
                continue;
            }

            sum += number;
        }
        System.out.print("Sum = " + sum);
    }
}
