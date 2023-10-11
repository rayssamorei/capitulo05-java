package atividades;

import java.util.Scanner;

/**Faça um programa que receba a idade e o peso de quinze pessoas, e que calcule e mostre as médias dos
 * pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a
 * 30 anos e de 31 anos para cima. */

public class Atividade13 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        double peso = 0, somaPesos1 = 0, somaPesos2 = 0, somaPesos3 = 0, somaPesos4 = 0;
        int idade = 0, faixaEtaria1 = 0, faixaEtaria2 = 0, faixaEtaria3 = 0, faixaEtaria4 = 0;
        double media1 = 0, media2 = 0, media3 = 0, media4 = 0;

        for(int i = 1; i <= 15; i++){
            System.out.print("Informe seu peso: ");
            peso = entrada.nextDouble();
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();

            System.out.println();

            if(idade <= 0){
                System.out.println("Erro!");
            }

            if(idade >= 1 && idade <= 10){
                faixaEtaria1++;
                somaPesos1 += peso;
            } else if (idade >= 11 && idade <= 20){
                faixaEtaria2++;
                somaPesos2 += peso;
            } else if (idade >= 21 && idade <= 30){
                faixaEtaria3++;
                somaPesos3 += peso;
            } else {
                faixaEtaria4++;
                somaPesos4 += peso;
            }
        }
        
        media1 = faixaEtaria1 / somaPesos1;
        media2 = faixaEtaria2 / somaPesos2;
        media3 = faixaEtaria3 / somaPesos3;
        media4 = faixaEtaria4 / somaPesos4;

        System.out.println("A média das pessoas da faixa etária 1 é: " + media1);
        System.out.println("A média das pessoas da faixa etária 2 é: " + media2);
        System.out.println("A média das pessoas da faixa etária 3 é: " + media3);
        System.out.println("A média das pessoas da faixa etária 4 é: " + media4);

        entrada.close();
    }
}
