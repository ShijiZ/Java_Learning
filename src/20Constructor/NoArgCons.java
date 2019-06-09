public class NoArgCons {

    int i;

    // Constructor with no parameter
    private NoArgCons(){
        i = 5;
        System.out.println("Object created and i = "+i);
    }

    public static void main(String[] args){
        NoArgCons obj = new NoArgCons();
    }
}
