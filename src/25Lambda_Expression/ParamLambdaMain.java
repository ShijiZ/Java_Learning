@FunctionalInterface
interface MyInterface2{
    String reverse(String n);
}

public class ParamLambdaMain {
    public static void main(String[] args){
        MyInterface2 myInterface = (str)-> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--){
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Lambda revered = "+myInterface.reverse("Lambda"));
    }
}
