package atividades;

import java.util.Scanner;
/**Faça um programa que leia o código do cliente, o tipo do investimento e o valor investido, e que calcule
e mostre o rendimento mensal de acordo com o tipo do investimento. No final, o programa deverá mostrar
o total investido e o total de juros pagos.
A leitura terminará quando o código do cliente digitado for menor ou igual a 0 */
public class Atividade25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigoCliente;
        double totalInvestido =0, totalJurosPago =0;

        System.out.println("Bem-vindo à calculadora de investimentos!");

        while(true) {
            System.out.print("Digite o código do cliente (ou menor ou igual a 0 para encerrar): ");
            codigoCliente = input.nextInt();

            if (codigoCliente <= 0) {
                break;
            }

            System.out.print("Digite o tipo de investimento (1 - Poupança, 2 - Poupança Plus, 3 - Fundos de Renda Fixa): ");
            int tipoInvestimento = input.nextInt();

            System.out.print("Digite o valor investido: R$ ");
            double valorInvestido = input.nextDouble();

            double rendimentoMensal = calcularRendimentoMensal(tipoInvestimento, valorInvestido);

            totalInvestido += valorInvestido;
            totalJurosPago += rendimentoMensal;

            System.out.println("Rendimento Mensal: R$ " + rendimentoMensal);
        }

        input.close();
    }

    private static double calcularRendimentoMensal(int tipoInvestimento, double valorInvestido) {
        double taxaRendimento;

        switch (tipoInvestimento) {
            case 1:
                taxaRendimento = 0.015;
                break;
            case 2:
                taxaRendimento = 0.02;
                break;
            case 3:
                taxaRendimento = 0.04;
                break;
            default:
                taxaRendimento = 0;
                break;
        }

        return valorInvestido * taxaRendimento;
    }
}
