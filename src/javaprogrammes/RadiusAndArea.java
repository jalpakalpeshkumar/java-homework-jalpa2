package javaprogrammes;

import java.util.Scanner;

public class RadiusAndArea {

    public static void main(String[] args) {

        double radius,area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;
        System.out.println("Are of the Circle is "+area);
    }
}
