package javaprogrammes;

public class StaticVariable {
    static int a = 20;
    static String name = " Jalpa Result ";

    public static void main(String[] args) {
        System.out.println(StaticVariable.a);
        System.out.println(StaticVariable.name);
        StaticVariable obj = new StaticVariable();
        obj.m1();

    }

    public void m1(){
        System.out.println(StaticVariable.a);
        System.out.println(StaticVariable.name);
    }

}
