package javaprogrammes;

public class Triangle {

    static float findArea(float a, float b, float c)
    {
        // Length of sides must be positive and sum of any two sides
        // must be smaller than third side.
        if (a < 0 || b < 0 || c <0 || (a+b <= c) ||
                a+c <=b || b+c <=a)
        {
            System.out.println("Not a valid triangle");
            System.exit(0);
        }
        float s = (a+b+c)/2;
        return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    // Driver method
    public static void main(String[] args)
    {
        float a = 3.0f;
        float b = 4.0f;
        float c = 5.0f;

        System.out.println("Area is " + findArea(a, b, c));
    }
}
