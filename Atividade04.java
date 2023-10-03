package atividades;

import java.util.Scanner;
//Faça um programa que receba um número, calcule e mostre a tabuada desse número.
public class Atividade04{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um número ");
        num = entrada.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println( num + " x " + i +  " = " + num*i);
        }
        entrada.close();
    }
}

