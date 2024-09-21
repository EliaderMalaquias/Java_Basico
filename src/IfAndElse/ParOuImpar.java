package IfAndElse;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Esse Numero eh PAR");
        } else {
            System.out.println("Esse Numero eh IMPAR");
        }

    }
}
