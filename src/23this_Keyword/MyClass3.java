public class MyClass3 {

    int instVar;

    MyClass3(int instVar){
        this.instVar = instVar;
    }

    public static void main(String[] args){
        MyClass3 obj = new MyClass3(8);
        System.out.println("obj.instVar = "+obj.instVar);
    }
}
