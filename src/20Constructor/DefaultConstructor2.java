public class DefaultConstructor2 {

    int a;
    boolean b;

    private DefaultConstructor2(){
        a = 0;
        b = false;
    }

    public static void main(String[] args){
        DefaultConstructor2 obj = new DefaultConstructor2();

        System.out.println("a = "+obj.a);
        System.out.println("b = "+obj.b);
    }
}
