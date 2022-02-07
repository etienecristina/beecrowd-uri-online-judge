package uri1004;

import java.util.Scanner;

/**
 * Leia dois valores inteiros.
 * A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
 * A seguir mostre a variável PROD com mensagem correspondente.
 */

public class Uri1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, PROD;
        a = scanner.nextInt();
        b = scanner.nextInt();
        PROD = a * b;
        System.out.println("PROD = " + PROD);
        scanner.close();
    }
}
