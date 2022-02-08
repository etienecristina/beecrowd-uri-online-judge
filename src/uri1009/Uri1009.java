package uri1009;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome;
        double salarioFixo, vendasEfetuadas, total, comissao = 0.15;

        nome = scanner.nextLine();
        salarioFixo = scanner.nextDouble();
        vendasEfetuadas = scanner.nextDouble();
        total = salarioFixo + (vendasEfetuadas * comissao);
        System.out.printf("TOTAL = R$ %.2f\n", total);
        scanner.close();
    }
}
