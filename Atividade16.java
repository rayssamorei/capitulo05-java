package atividades;

import java.util.Scanner;

/**
 * Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas.
 * Finalize digitando idade igual a zero
*/
public class Atividade16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, somaIdade = 0, quantidadeIdade = 0;
        double mediaIdade;

        System.out.println("Informe as idade (Digite 0 para encerrar)");

        while (true) {
            idade = input.nextInt();

            if (idade == 0) {
                break;
            }

            somaIdade += idade;
            quantidadeIdade++;

            if (quantidadeIdade > 0) {
                mediaIdade = (double) somaIdade / quantidadeIdade;
                System.out.println("A media das idade digitadas é: " +mediaIdade);
            } else {
                System.out.println("Nenhuma idade foi digitada.");
            }
        }
    input.close();

    }
}
