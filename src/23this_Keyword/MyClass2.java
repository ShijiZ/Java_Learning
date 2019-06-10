public class MyClass2 {

    int instVar;
    MyClass2(int instVar){
        instVar = instVar;
    }

    public static void main(String[] args){
        MyClass2 mc = new MyClass2(2);
        System.out.println("mc.instVar = "+mc.instVar);
    }
}
