package javaprogrammes;

public class Calculator {

    public static void main(String[] args) {
        addition();
        subtraction();
        Calculator obj  = new Calculator();
        obj.multiplication();
        obj.division();




    }

    //Addition

    public static void addition(){
        int a =5;
        int b =10;
        int ans = a+b;
        // concatenation
        System.out.println("Addition of two number " +a+ " and " +b+ " is "+ans+".");

    }
     //Subtraction
    public static void subtraction(){
        int a = 10;
        int b = 2;
        int ans = a-b;
        System.out.println("subtraction of two numbers "+a+" and "+b+" is "+ans+".");


    }

    //multiplication
    void multiplication(){
        int a = 30;
        int b = 5;
        int ans = a*b;
        System.out.println("multiplication of two numbers "+a+" and "+b+" is "+ans+".");
    }

    protected void division(){
        int a = 10;
        int b = 2;
        int ans = a/b;
        System.out.println("division of two numbers "+a+" and "+b+" is "+ans+".");
    }
}
