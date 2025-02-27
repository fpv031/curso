package metodoseclasses;

import java.util.Scanner;

public class ex4 {
    public static void verificarVoto(int idade) {
        if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        verificarVoto(idade);
        sc.close();
    }
}
