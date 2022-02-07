package uri1003;

import java.util.Scanner;

/**
 * Leia dois valores inteiros, no caso para variáveis A e B.
 * A seguir, calcule a soma entre elas e atribua à variável SOMA.
 * A seguir escrever o valor desta variável.
 */

public class Uri1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, soma;

        A = scanner.nextInt();
        B = scanner.nextInt();
        soma = A + B;

        System.out.println("SOMA = "+soma+"\n");

    }
}
