public class ThreeDimensionalArray {
    public static void main(String[] args){

        int[][][] a = {
                {
                        {1,-2,3},
                        {2,3,4}
                },
                {
                        {-4,-5,6,9},
                        {2},
                        {1,3}
                }
        };

        int i = 0, j = 0;

        for (int[][] innerArray: a){
            System.out.println("Inner array index: "+i);
            i++;
            for (int[] innerInnerArray: innerArray){
                System.out.println("Inner-inner array index: "+j);
                j++;
                for (int data: innerInnerArray){
                    System.out.println(data);
                }
            }
            j = 0;
        }
    }
}
