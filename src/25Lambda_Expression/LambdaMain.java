public class LambdaMain {
    public static void main(String[] args){
        MyInterface myInterface;
        myInterface = ()->3.14;

        System.out.println("Value of Pi = "+myInterface.getPiValue());
    }
}
