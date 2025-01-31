package RevisaoIfElse.categoriaseclassificacoes;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a pressão arterial sistólica: ");
        int sistolica = sc.nextInt();
        System.out.print("Digite a pressão arterial diastólica: ");
        int diastolica = sc.nextInt();

        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Pressão normal.");
        } else if (sistolica < 140 && diastolica < 90) {
            System.out.println("Pressão moderada.");
        } else {
            System.out.println("Pressão alta.");
        }
    }

}
