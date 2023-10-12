package atividades;
/**. Faça um programa que receba a idade e a altura de várias pessoas, calcule e mostre a média das alturas
daquelas com mais de 50 anos. Para encerrar a entrada de dados, digite idade menor ou igual a zero.*/

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, contador =0;
        double altura, mediaAltura =0, somaAltura =0;


        System.out.print("Informe a idade da pessoa (Digite 0 ou menos para encerrar.): ");
        idade = input.nextInt();

        while (idade > 0) {
            System.out.println("Informe a altura da pessoa");
            altura = input.nextDouble();


            if (idade > 50) {
                somaAltura += altura;
                contador ++;
            }

            System.out.println("Digite a idade da próxima pessoa (digite 0 ou menos para encerrar): ");
            idade = input.nextInt();

        }
        
        if (contador > 0) {
            System.out.println("A media da altura das pessoas com mais de 50 anos é: " +mediaAltura);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada");
        }


        input.close();
    }
}
