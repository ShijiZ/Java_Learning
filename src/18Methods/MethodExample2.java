public class MethodExample2 {
    public void MyMethod(){
        System.out.println("Printing from inside MyMethod().");
    }
}

class Output2{
    public static void main(String[] args){

        MethodExample2 obj = new MethodExample2();
        System.out.println("About to encounter a method.");

        // calling MyMethod() from MethodExample2.class
        obj.MyMethod();

        System.out.println("Method was executed successfully!");
    }
}
