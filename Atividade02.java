package atividades;

/**
 * Uma   companhia   de   teatro   deseja   montar   uma   série   de   espetáculos.   A   direção   calcula   que,   a   R$ 5,00
 * o ingresso, serão vendidos 120 ingressos, e que as despesas serão de R$ 200,00. Diminuindo-se emR$ 0,50 o preço dos ingressos,
 * espera-se que as vendas aumentem em 26 ingressos. Faça um programa que escreva uma tabela de valores de lucros esperados em
 * função do preço do ingresso, fazendo-se variar esse preço de R$ 5,00 a R$ 1,00, de R$ 0,50 em R$ 0,50. Escreva, ainda, para
 * cada novo preço de ingresso, o lucro máximo esperado, o preço do ingresso e a quantidade de ingressos vendidos para a obtenção
 * desse lucro.
 */
public class Atividade02 {
    public static void main(String[] args) {
        double precoInicial = 5.00; // Preço inicial do ingresso
        double precoFinal = 1.00;   // Preço final do ingresso
        double incremento = 0.50;    // Incremento de preço do ingresso

        double lucroMaximo = 0;
        double precoMaximoLucro = 0;
        int ingressosVendidosMaximoLucro = 0;

        System.out.println("Preço do Ingresso | Ingressos Vendidos | Lucro Esperado");
        System.out.println("---------------------------------------------------");

        for (double precoIngresso = precoInicial; precoIngresso >= precoFinal; precoIngresso -= incremento) {
            int ingressosVendidos = 120 + (int) (26 * (5.00 - precoIngresso) / 0.50);
            double receita = precoIngresso * ingressosVendidos;
            double despesas = 200.00;
            double lucro = receita - despesas;

            System.out.printf("R$ %.2f             | %d                  | R$ %.2f%n", precoIngresso, ingressosVendidos, lucro);

            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
                precoMaximoLucro = precoIngresso;
                ingressosVendidosMaximoLucro = ingressosVendidos;
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Lucro Máximo Esperado: R$ " + lucroMaximo);
        System.out.println("Preço do Ingresso para o Lucro Máximo: R$ " + precoMaximoLucro);
        System.out.println("Quantidade de Ingressos Vendidos para o Lucro Máximo: " + ingressosVendidosMaximoLucro);
    }
}

