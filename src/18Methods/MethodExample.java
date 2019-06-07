public class MethodExample {
    private static void MyMethod(){
        System.out.println("Printing from inside MyMethod()!");
    }

    public static void main(String[] args){
        System.out.println("About to encounter a method");

        // method call
        MyMethod();

        System.out.println("Method was executed successfully!");
    }
}
