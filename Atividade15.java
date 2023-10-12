package atividades;

import java.util.Scanner;

/**. Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado. Para isso
 * forneceu o sexo do entrevistado e sua resposta (S — sim; ou N — não). Sabe-se
 * que foram entrevistadas dez pessoas. Faça um programa que calcule e mostre:
 * ■■ o número de pessoas que responderam sim;
 * ■■ o número de pessoas que responderam não;
 * ■■ o número de mulheres que responderam sim; e
 * ■■ a percentagem de homens que responderam não, entre todos os homens analisados. */
public class Atividade15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int numeroSim = 0, numeroNao = 0, numeroMulheresSim = 0, numeroHomensNao =0, numeroHomens =0;
        char escolha, sexo;
        double porcentagemHomensNao;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Informe o seu sexo (M para masculino, e F para feminino)");
            sexo = input.next().charAt(0);

            System.out.println("Você gostou do novo produto (S para sim, e N para não)");
            escolha = input.next().charAt(0);

            if (escolha == 'S' || escolha == 's') {
                numeroSim ++;
                if (sexo == 'F' || sexo == 'f') {
                    numeroMulheresSim ++;
                }
            } else if (escolha == 'N' || escolha == 'n') {
                numeroNao ++;

                if (sexo == 'M' || sexo == 'm') {
                    numeroHomensNao ++;
                    numeroHomens ++;
                }
            }

        }

        input.close();

        porcentagemHomensNao = (numeroHomens == 0) ? 0 : (double) numeroHomensNao / numeroHomens * 100;
        System.out.print("O números de pessoas que respoderam sim: " +numeroSim);
        System.out.print("O números de pessoas que respoderam não: " +numeroNao);
        System.out.print("O números de mulheres que respoderam sim: " +numeroMulheresSim);
        System.out.print("a percentagem de homens que responderam não, entre todos os homens analisados: " +porcentagemHomensNao);
    }
}
