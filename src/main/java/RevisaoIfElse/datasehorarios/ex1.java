package RevisaoIfElse.datasehorarios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Digite os minutos (0-59): ");
        int minutos = sc.nextInt();

        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
        }
    }
}
