import java.util.Arrays;

public class DeepCopy2 {
    public static void main(String[] args){

        int[] n1 = {2,3,4,5,6,7};
        int[] n2 = new int[n1.length];
        int[] n3 = new int[5];

        // copying entire n1 to n2
        System.arraycopy(n1,0,n2,0,n1.length);
        System.out.println("n2 = "+Arrays.toString(n2));

        // copying elements from index 2 on n1 to index 3 of n3
        System.arraycopy(n1,2,n3,3,2);
        System.out.println("n3 = "+Arrays.toString(n3));
    }
}
