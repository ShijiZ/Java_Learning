public class ShallowCopy {
    public static void main(String[] args){

        int [] numbers = {1,2,3,4,5,6};
        int [] positiveNumbers = numbers;

        numbers[0] = -1;

        for (int i: positiveNumbers){
            System.out.print(i+", ");
        }
    }
}
