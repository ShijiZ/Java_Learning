public class ArithmaticMain {
    public static int getIntegerSum(int i, int j){
        return i+j;
    }

    public static int multiplyInteger(int i, int j){
        return i*j;
    }

    public static void main(String[] args){
        System.out.println("10 + 20 = "+getIntegerSum(10,20));
        System.out.println("10 * 20 = "+multiplyInteger(10,20));
    }
}
