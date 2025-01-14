package javaprogrammes;

public class MultiplicationTable {
    public static void main(String[] args) {
        // number n for which we have to print the
        // multiplication table.
        int N = 5;

        // looping from 1 to 10 to print the multiplication
        // table of the number.
        // using for loop
        for (int i = 1; i <= 10; i++) {
            // printing the N*i,ie ith multiple of N.
            System.out.println(N + " * " + i + " = "
                    + N * i);
        }
    }
}
