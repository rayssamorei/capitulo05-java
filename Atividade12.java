package atividades;

import java.util.Scanner;

/**Faça um programa que receba dez números inteiros e mostre a quantidade de números primos dentre os
 * números que foram digitados. */
public class Atividade12 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int num, primo = 0, qntPrimos = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.println("Informe um número: ");
            num = entrada.nextInt();

            if(num % 2 == 0){
                primo++;
                qntPrimos =+ primo;
            }
        }

        System.out.println("A quantidade de números primos dentre os valores que você digitou anteriormente é: " + qntPrimos);
        
        entrada.close();
    }
}
