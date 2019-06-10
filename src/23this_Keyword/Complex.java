public class Complex {
    private int a,b;

    // parameterize constructor
    private Complex(int i, int j){
        this.a = i;
        this.b = j;
    }

    private Complex(int i){
        this(i,i); // invokes Complex(int i, int i)
    }

    private Complex(){
        this(0); // invokes Complex(int i)
    }

    @Override
    public String toString(){
        return this.a + "+" + this.b + "i";
    }

    public static void main(String[] args){
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(3);
        Complex c3 = new Complex();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }


}
