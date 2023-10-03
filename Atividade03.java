package atividades;

import java.util.Scanner;

/**Faça um programa que receba a idade de oito pessoas, calcule e mostre:
 *  a) a quantidade de pessoas em cada faixa etária;
 *  b) a porcentagem de pessoas na primeira faixa etária com relação ao total de pessoas.
 *  c) a porcentagem de pessoas na última faixa etária com relação ao total de pessoa
 *  1° até 15 anos
 *  2° De 16 a 30 anos
 *  3° De 31 a 45 anos
 *  4° De 46 a 60 anos
 *  5° acima de 60 anos
*/
public class Atividade03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0, idade = 0;
        double porcfx1 = 0, porcfx5 = 0;

        for (int i = 0; i <= 7; i++){
            System.out.print("Informe sua idade: ");
            idade = input.nextInt();
            
            if (idade <= 15){
                faixa1++;
            } else if ((idade >=16) && (idade <= 30)){
                faixa2++;
            } else if ((idade >= 31) && (idade <= 45)){
                faixa3++;
            } else if ((idade >= 46) && (idade <= 60)){
                faixa4++;
            } else {
                faixa5++;
            }
        }
        System.out.println("A quantidade de pessoas por faixa étaria: ");
        System.out.println("Faixa étaria 01: " + faixa1);
        System.out.println("Faixa étaria 02: " + faixa2);
        System.out.println("Faixa étaria 03: " + faixa3);
        System.out.println("Faixa étaria 04: " + faixa4);
        System.out.println("Faixa étaria 05: " + faixa5);
        porcfx1 = faixa1/0.08;
        porcfx5 = faixa5/0.08;
        System.out.println("O percentual de pessoas da faixa étaria 1 é: "+ porcfx1 + "%");
        System.out.println("O percentual de pessoas da faixa étaria 5 é: "+ porcfx5 + "%");

        input.close();
    }
}
