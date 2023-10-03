package atividades;
//Faça um programa que mostre as tabuadas dos números de 1 a 10.
public class Atividade05 {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 1; i <= 10; i++){ //De fora.
            System.out.println("A tabuada de " + i + ":");
            System.out.println( num + " x " + i +  " = " + num*i);
            for (int j = 0; j <= 10; j++){ //De dentro.
                int resultado = i * j;
                System.out.println( i + " x " + j +  " = " + resultado);
            }
            System.out.println();
        }
    }
}
