package atividades;

import java.util.Scanner;

/**Faça um programa que receba um conjunto de valores inteiros e positivos, calcule e mostre o maior e o
menor valor do conjunto. Considere que:
■■ para encerrar a entrada de dados, deve ser digitado o valor zero;
■■ para valores negativos, deve ser enviada uma mensagem;
■■ os valores negativos ou iguais a zero não entrarão nos cálculos. */
public class Atividade24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;

        System.out.print("Informe um número inteiro e positivo (Insira 0 para encerrar: ");

        while(true) {
            numero = input.nextInt();

            if (numero < 0) {
                System.out.println("Valor negativo, so pode número positivos.");
            } else if (numero == 0 ) {
                break;
            } else {
                if (numero > maior){
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

            }

        }

        if (maior == Integer.MIN_VALUE || menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor valido foi inserido.");
        } else {
            System.out.print("Maior valor: " +maior);
            System.out.print("Menor valor: " +menor);

        }

    input.close();
    }
}
