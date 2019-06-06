public class MultidimensionalArray2 {
    public static void main(String[] args){

        int[][] a = {
                {1,-2,3},
                {-4,-5,7,6},
                {3,2}
        };
        int i = 0;

        for (int[] innerArray: a){
            System.out.println("Inner array index: "+i);
            i ++;
            for (int data: innerArray){
                System.out.println(data);
            }
        }
    }
}
