package uri1002;
import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double PI = 3.14159;
        double A, R;
        Scanner scanner = new Scanner(System.in);

        R = scanner.nextDouble();

        A = PI * (Math.pow(R, 2));

        System.out.printf("A=%.4f%n", A);
    }
}
