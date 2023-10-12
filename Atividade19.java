package atividades;

import java.util.Scanner;

/**
 *Faça um programa que receba o tipo da ação, ou seja, uma letra a ser comercializada na bolsa de valores, o preço de compra e o preço de venda de cada ação e que calcule e mostre:
■■ o lucro de cada ação comercializada;
■■ a quantidade de ações com lucro superior a R$ 1.000,00;
■■ a quantidade de ações com lucro inferior a R$ 200,00;
■■ o lucro total da empresa.
Finalize com o tipo de ação ‘F’.
 */
public class Atividade19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char tipoDeAcao;
        double precoDaCompra =0, precoDaVenda =0, lucroAcao, acoesComLucroSuperior1000 = 0, acoesComLucroInferior200 = 0;
        double lucroTotalEmpresa =0;

        System.out.print("Informe o tipo de ação ('F' para finalizar):");

        while (true) {
            tipoDeAcao = input.next().charAt(0);

            if (tipoDeAcao == 'F') {
                break;
            }

            System.out.print("Digite o preço da compra da ação: ");
            precoDaCompra = input.nextDouble();

            System.out.print("Digite o preço da venda da ação: ");
            precoDaCompra = input.nextDouble();

            lucroAcao = precoDaVenda - precoDaCompra;
            lucroTotalEmpresa ++;

            System.out.println("O lucro da ação é: " +lucroAcao+ "R$");

            if (lucroAcao > 1000) {
                acoesComLucroSuperior1000++;
            }
            if (lucroAcao < 200) {
                acoesComLucroInferior200++;
            }

        }


        System.out.println("A quantidade de ações com lucro superiro a R$ 1000: " +acoesComLucroSuperior1000);
        System.out.println("A quantidade de ações com lucro inferior a R$ 200: " +acoesComLucroInferior200);
        System.out.println("O lucro total da empresa é: R$ " +lucroTotalEmpresa);

        input.close();
    }
}
