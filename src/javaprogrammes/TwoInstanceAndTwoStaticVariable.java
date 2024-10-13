package javaprogrammes;

public class TwoInstanceAndTwoStaticVariable {
    int a = 10;// Instance
    int b = 20;
    static int c = 30;// Static variable
    static int d = 40;


    public static void main(String[] args) {
        TwoInstanceAndTwoStaticVariable s = new TwoInstanceAndTwoStaticVariable();
        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(TwoInstanceAndTwoStaticVariable.c);
        System.out.println(d);
        s.i1();

    }


    public void i1(){
        InstanceAndStaticVariable obj = new InstanceAndStaticVariable();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
