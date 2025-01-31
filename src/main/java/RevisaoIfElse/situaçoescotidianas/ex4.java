package RevisaoIfElse.situaçoescotidianas;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        System.out.print("Digite o peso da pessoa: ");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("A pessoa está apta para doar sangue.");
        } else {
            System.out.println("A pessoa NÃO está apta para doar sangue.");
        }
    }

}
