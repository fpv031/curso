package decisoesfinanceiras;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa: ");
        double salario = sc.nextDouble();

        if (salario >= 3000) {
            System.out.println("A pessoa pode financiar o imóvel.");
        } else {
            System.out.println("A pessoa NÃO pode financiar o imóvel.");
        }
    }
}
