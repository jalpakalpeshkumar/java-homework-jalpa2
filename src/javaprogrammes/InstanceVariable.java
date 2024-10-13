package javaprogrammes;

public class InstanceVariable {
    int a =13;// a is a instance variable or Global variable
    int b =20;
    String name ="test";

    public static void main(String[] args) {

        InstanceVariable obj = new InstanceVariable();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.name);
        System.out.println("m1 test result");
        obj.m1();

    }

    public void m1(){
        InstanceVariable obj = new InstanceVariable();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.name);



    }

}
