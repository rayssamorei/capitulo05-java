package atividades;

import java.util.Scanner;
/**
 * Uma loja utiliza o código V para transação à vista e P para transação a prazo.
 * Faça um programa que receba o código e o valor de quinze transações, calcule e mostre:
 * ■■ o valor total das compras à vista;
 * ■■ o valor total das compras a prazo;
 * ■■ o valor total das compras efetuadas; e
 * ■■ o valor da primeira prestação das compras a prazo juntas, sabendo-se que serão pagas em três vezes.
 */

public class Atividade06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String codigo;
        double totalAVista =  0, totalAPrazo = 0, valorCompra = 0, total = 0;
        
        for(int i = 0; i < 15; i++){
            System.out.print("Informe o código: ");
            codigo = entrada.next().toUpperCase();
            System.out.print("Qual o valor da compra? ");
            valorCompra = entrada.nextDouble();
            if(codigo.equals("V")){
                totalAVista = totalAVista + valorCompra;
            }else if(codigo.equals("P")){
                totalAPrazo = totalAPrazo + valorCompra;
            }else{
            System.out.println("Código inválido!");
            }
        }

        total = totalAPrazo + totalAVista;

        System.out.println("O valor total das compras à vista " + totalAVista);
        System.out.println("O valor total das compras à prazo " + totalAVista);
        System.out.println("O valor total das compras efetudas: " +total);
        System.out.println("O valor total das compras efetuadas " + totalAPrazo/3);
        entrada.close();
    }
}
