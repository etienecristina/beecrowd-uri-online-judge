package uri1007;

import java.util.Scanner;

/**
 * Leia quatro valores inteiros A, B, C e D.
 * A seguir, calcule e mostre a diferença do produto de
 * A e B pelo produto de C e D segundo a fórmula:
 * DIFERENCA = (A * B - C * D).
 */
public class Uri1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D, diferenca;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();
        diferenca = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + diferenca);
        scanner.close();
    }
}
