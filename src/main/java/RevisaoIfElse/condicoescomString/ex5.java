package RevisaoIfElse.condicoescomString;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais ");
        } else {
            System.out.println("As palavras são diferentes.");
        }

        sc.close();
    }
}
