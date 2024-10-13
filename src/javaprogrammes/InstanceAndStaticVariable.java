package javaprogrammes;

public class InstanceAndStaticVariable {

    String name = "xyz";// Instance variable
    static int number = 10;// Static variable


    public static void main(String[] args) {
        InstanceAndStaticVariable j = new InstanceAndStaticVariable();
        System.out.println(j.name);
        System.out.println(number);
        j.i1();

    }


    public void i1(){
        InstanceAndStaticVariable obj = new InstanceAndStaticVariable();
        System.out.println(obj.name);
        System.out.println(InstanceAndStaticVariable.number);

    }
}
