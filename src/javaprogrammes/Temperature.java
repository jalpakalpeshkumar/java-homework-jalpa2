package javaprogrammes;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        // create a scanner object

        Scanner scanner = new Scanner(System.in);

        // input temperature in fahrenheit
        System.out.println("Enter temperature in Fahrenheit");

        double Fahrenheit = scanner.nextDouble();

        // convert to using formula (F - 32) * 5/9
        double fahrenheit = ( (Fahrenheit - 32) * 5/9 );
        // display the result

        System.out.println("Temperature in celsius:");
        // scanner close
        scanner.close();

}



}
