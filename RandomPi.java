import java.util.Random;
import java.util.Scanner;

public class RandomPi {
    public static void main(String[] args) {
        (new RandomPi()).find();
    }

    public void find() {
        int dots = 0;
        int circle = 0;
        int square = 0;
        double precision;
        double pi;
        double x;
        double y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input precision:");
        precision = sc.nextDouble();
        sc.close();
        Random gen = new Random();

        do {
            dots++;
            x = gen.nextDouble();
            y = gen.nextDouble();

            if (x * x + y * y <= 1) {
                circle++;
            } else {
                square++;
            }
            if (square == 0) {
                pi = 4.0 * ((double) circle / square);
            } else {
                pi = 3.0;
            }

        } while (Math.abs(pi - Math.PI) < precision);

        System.out.println(pi);
        System.out.println(dots);
    }
}
