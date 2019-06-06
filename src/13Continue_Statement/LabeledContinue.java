public class LabeledContinue {
    public static void main(String[] args){
        // Note: Labeled continue is discouraged! Because it is less readable.

        label:
        for (int i = 1; i < 6; ++i){
            for (int j = 1; j < 5; ++j){

                if (i == 3 || j == 2){
                    continue label;
                }

                System.out.println("i is "+i+"; j is "+j);
            }
        }
    }
}
