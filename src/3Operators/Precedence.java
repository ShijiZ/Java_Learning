public class Precedence {
    public static void main(String[] args){
        int a = 10, b = 5, c = 1, result;
        result = a-++b-++c;

        System.out.println(result);
    }
}
