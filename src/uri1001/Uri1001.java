package uri1001;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B.
 * Efetue a soma de A e B atribuindo o seu resultado na variável X.
 * Imprima X conforme exemplo apresentado abaixo.
 * Não apresente mensagem alguma além daquilo que está sendo especificado e
 * não esqueça de imprimir o fim de linha após o resultado,
 * caso contrário, você receberá "Presentation Error".
 */

public class Uri1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        int X;

        A = scanner.nextInt();
        B = scanner.nextInt();
        X = A + B;
        scanner.close();
        System.out.println("X = "+X);
        System.out.println(" ");
    }
}
