import JavaPackageExample.Helper;

public class UseHelper {
    public static void main(String[] args){

        double value = 99.5;
        String formattedValue = Helper.getFormattedDollar(value);
        System.out.println("formatted value = "+formattedValue);
    }

}
