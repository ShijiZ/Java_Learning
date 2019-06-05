public class NestedIf {
    public static void main(String[] args){

        Double n1 = -1.0, n2 = 4.5, n3 = 5.3, largestNumber;

        if (n1 > n2){
            if (n3 > n1){
                largestNumber = n3;
            }
            else{
                largestNumber = n1;
            }
        }
        else{
            if (n3 > n2){
                largestNumber = n3;
            }
            else{
                largestNumber = n1;
            }
        }
        System.out.println("Largest number is " + largestNumber);
    }
}
