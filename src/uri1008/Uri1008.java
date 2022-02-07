package uri1008;
import java.util.Locale;
import java.util.Scanner;

/**
 * Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
 * o valor que recebe por hora e calcula o salário desse funcionário.
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 */

public class Uri1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numero, horasTrabalhadas;
        double valorPorHora, salario;

        numero = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        valorPorHora = scanner.nextDouble();
        salario = horasTrabalhadas * valorPorHora;
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        scanner.close();
    }
}
