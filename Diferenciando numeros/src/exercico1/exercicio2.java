package exercico1;

import java.util.Scanner;

public class exercicio2 {

    double valor1;
    double valor2;
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insira o primeiro valor:");
        double valor1 = leia.nextDouble();

        System.out.println("Insira o segundo valor: ");
        double valor2 = leia.nextDouble();

        if (valor1 == valor2) {
            System.out.println("Os valores são IGUAIS");
        } else {
            System.out.println("Os valores são DIFERENTES");
        }

    }
}
