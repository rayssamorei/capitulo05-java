package atividades;

import java.util.Scanner;

/**
 * Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade, sexo (M/F)
 * e salário. Faça um programa que calcule e mostre
 * ■■ a média dos salários do grupo;
 * ■■ a maior e a menor idade do grupo;
 * ■■ a quantidade de mulheres com salário até R$ 200,00;
 * ■■ a idade e o sexo da pessoa que possui o menor salário.
*/
public class Atividade18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, totalSalario =0, totalPessoas =0, idadeMenorSalario =0, sexoMenorSalario = ' ', mulherSalarioAte200 =0;
        int maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE, menorSalario = Integer.MAX_VALUE;
        double salario = 0, media;
        char sexo;

        System.out.print("Informe o dados dos habitantes (Sexo [M/F] salário) informe uma idade negativa para encerrar.");

        while (true) {
            idade = input.nextInt();

            if (idade < 0 ){
                break;
            }

            sexo = input.next().charAt(0);
            salario = input.nextDouble();

        totalSalario += salario;
        totalPessoas ++;

        if (idade > maiorIdade) {
        maiorIdade = idade;
        }

        if (idade < menorIdade) {
        menorIdade = idade;
        }

        if (sexo == 'F' && salario <= 200) {
            mulherSalarioAte200 ++;
        }

        if (salario < menorSalario) {

            menorSalario = (int) salario;
            idadeMenorSalario = idade;
            sexoMenorSalario = sexo;

        }

        if (totalPessoas == 0) {
            media = (double) totalSalario / totalPessoas;

            System.out.println("A media dos salário dos grupos é: " +media);
            System.out.println("A maior idade do grupo é: " +maiorIdade+ ". A menor idade do grupo é: " +menorIdade);
            System.out.println("A quantidade de mulheres com salário até 200R$ é: " +mulherSalarioAte200);
            System.out.println("A idade da pessoa com o menor salário é: " +idadeMenorSalario);
            System.out.println("O sexo da pessoa com o menor salário é: " +sexoMenorSalario);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }



        }

    input.close();
    }
}
