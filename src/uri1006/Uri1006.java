package uri1006;
import java.util.Locale;
import java.util.Scanner;

/**Leia 3 valores: A, B e C, que são as três notas de um aluno.
 A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2,
 a nota B tem peso 3 e a nota C tem peso 5.
 Considere que cada nota pode ir de 0 até 10.0,
 sempre com uma casa decimal.
 */

public class Uri1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double A, B, C;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10;
        System.out.printf("MEDIA = %.1f", MEDIA);
        scanner.close();
    }
}


