package atividades;

import java.util.Scanner;

/**Faça um programa que receba dez números inteiros e mostre a quantidade de números primos dentre os
 * números que foram digitados. */
public class Atividade12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int quantidadeNumerosPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = input.nextInt();

            if (ehPrimo(numero)) {
                quantidadeNumerosPrimos++;
            }
        }

        System.out.println("Quantidade de números primos entre os números digitados: " + quantidadeNumerosPrimos);

        input.close();
    }

    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
        
    }
}
