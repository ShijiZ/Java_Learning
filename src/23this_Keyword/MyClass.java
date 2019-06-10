public class MyClass {
    int instVar;

    MyClass(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = "+this);
    }

    public static void main(String[] args){
        MyClass obj = new MyClass(8);
        System.out.println("object reference = "+obj);
    }
}
