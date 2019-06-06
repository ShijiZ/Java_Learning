public class EnhancedForLoop {
    public static void main(String[] args){

        int[] numbers = {3,4,5,-5,0,12};
        int sum = 0;

        for (int i: numbers){
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
