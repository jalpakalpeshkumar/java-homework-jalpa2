package javaprogrammes;

public class ThreeNumberCalculate {
    public static void main(String[] args) {

        // take two numbers
        double num1 = 10;
        double num2 = 15;
        double num3 = 20;

        // declare sum variable
        // and initialize with 0
        double sum = 0.0;
        // declare average variable
        double avg = 0.0;

        // calculate the sum value
        sum = num1 + num2 + num3;
        // calculate the average value
        avg = sum/3;

        // display result
        System.out.println("Average: " + avg );
    }
}
