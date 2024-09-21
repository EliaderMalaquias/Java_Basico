package IfAndElse;

import java.util.Scanner;

public class IFandElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = sc.next();
        System.out.print("Digite sua Idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println( nome + " Voce Pode Dirigir");
        } else {
            System.out.println( nome + " Voce Nao Pode Dirigir");
        }

        sc.close();

    }
}
