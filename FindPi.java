
/**
 * Java MonteCarlo
 *
 * @author Simon Biennier
 * @description A program to estimate Pi
 *
 **/

import java.util.Scanner;

public class FindPi {
    public static void main(String[] args) {
        (new FindPi()).estimate();
    }

    public void estimate() {
        int dots = 0;
        int circle = 0;
        int square = 0;
        double precision;
        double pi = 3;
        double x;
        double y;

        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Input precision:");
            precision = sc.nextDouble();

            do {
                dots++;
                x = Math.random();
                y = Math.random();

                if (x * x + y * y <= 1) {
                    circle++;
                }

                square++;

                pi = 4.0 * ((double) circle / square);

            } while (Math.abs(Math.PI - pi) > precision);

        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.print("Pi: ");
            System.out.println(pi);
            System.out.print("Total dots thrown: ");
            System.out.println(dots);
        }

    }
}
