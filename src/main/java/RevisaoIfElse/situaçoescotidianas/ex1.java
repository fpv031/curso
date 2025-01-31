package RevisaoIfElse.situaçoescotidianas;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da placa do veículo: ");
        String placa = sc.nextLine();

        // Pega o último caractere da placa
        char ultimoCaractere = placa.charAt(placa.length() - 1);
        int ultimoNumero = Character.getNumericValue(ultimoCaractere);

        if (ultimoNumero % 2 == 0) {
            System.out.println("Veículo pode passar no pedágio (placa termina com número par).");
        } else {
            System.out.println("Veículo NÃO pode passar no pedágio (placa termina com número ímpar).");
        }
    }

}
