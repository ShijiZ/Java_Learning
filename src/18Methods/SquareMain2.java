public class SquareMain2 {
    public static void main(String[] args){
        int result,n;

        n = 3;
        result = square(n);
        System.out.println("Squared value of 3 is: "+result);

        n = 4;
        result = square(n);
        System.out.println("Squared value of 4 is: "+result);
    }

    public static int square(int n){
        return n*n;
    }
}
