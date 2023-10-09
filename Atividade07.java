package atividades;

import java.util.Scanner;
/**Faça um programa que receba a idade, a altura e o peso de cinco pessoas, calcule e mostre:
■■ a quantidade de pessoas com idade superior a 50 anos;
■■ a média das alturas das pessoas com idade entre 10 e 20 anos;
■■ a porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas. */
public class Atividade07{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //var ent = new Scanner(System.in);
        int idade = 0, idadeMaior50 = 0, qntAlturasIdades10e20 = 0;
        double altura = 0, peso = 0, somaAlturasIdades10e20 = 0;
        double pesoMenor40 = 0, mediaAlturas = 0, perPeso = 0, somaPesos = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.print("Informe sua altura: ");
            altura = entrada.nextDouble();
            System.out.print("Informe seu peso: ");
            peso = entrada.nextDouble();

            System.out.println();

            if(idade > 50){
                idadeMaior50++;
                //idadeMaior50 = idadeMaior50 + 1;
            }
            if((idade>= 10) && (idade <= 20)){
                qntAlturasIdades10e20++;
                somaAlturasIdades10e20 =+ altura;
                //somaAlturasIdade10e20 =  somaAlturasIdade10e20 + altura;
            }
            if(peso < 40){
                pesoMenor40 += peso;
            }

            somaPesos += peso;
        }
        mediaAlturas = somaAlturasIdades10e20 / qntAlturasIdades10e20;
        perPeso = (pesoMenor40 / somaPesos) * 100;

        System.out.println("A quantidade de pessoas com idade superior a 50 anos: " + idadeMaior50 );
        System.out.println("a média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas);
        System.out.println("a porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas: " + perPeso + "%");

        entrada.close();
    }
}