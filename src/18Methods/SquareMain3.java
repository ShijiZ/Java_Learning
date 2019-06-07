public class SquareMain3 {

    public static int square(int n){
        return n*n;
    }

    public static void main(String[] args){
        for (int i = 1; i <= 5; i++){

            int result = square(i);
            System.out.println("Square of "+i+" is "+result);
        }
    }
}
