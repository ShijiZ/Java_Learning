public class MethodOverloading2 {

    // this method accept int
    private static void display(int a){
        System.out.println("Got integer data.");
    }

    // this method accept String
    private static void display(String b){
        System.out.println("Got string object.");
    }

    public static void main(String[] args){
        display(1);
        display("Hello");
    }
}
