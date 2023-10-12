package atividades;

import java.util.Scanner;

/**Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e sua opinião
 * em relação ao filme: ótimo — 3; bom — 2; regular — 1. Faça um programa que receba a idade e a opinião de quinze espectadores
 * calcule e mostre:
■■ a média das idades das pessoas que responderam ótimo;
■■ a quantidade de pessoas que responderam regular; e
■■ a percentagem de pessoas que responderam bom, entre todos os espectadores analisados.
*/
public class Atividade14 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int idade = 0, op = 0;
        int otimo = 0, bom = 0, regular = 0;
        double somaIdades = 0, mediaOtimo = 0, percenBom = 0;

        for(int i = 1; i <= 15; i++){
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.println("Informe sua opinião digitando os números com base nas informações a seguir: " + " ótimo - 3; bom - 2; regular - 1.");
            op = entrada.nextInt();

            switch (op) {
                case 3:
                    otimo++;
                    somaIdades += idade;
                    break;
                case 2:
                    bom++;
                    break;
                case 1:
                    regular++;
                    break;
                default:
                    break;
            }
        }

        mediaOtimo = somaIdades / otimo;
        percenBom = (int) ((double) bom / 15 * 100);
        System.out.println("A média das idades de quem opinou por o filme ser ótimo: " + mediaOtimo);
        System.out.println("A quantidade de pessoas que responderam regular: " + regular);
        System.out.println("O percentual de pessoas que colocaram bom dentre todas foi de: " + percenBom + "%");


        entrada.close();
    }
}
