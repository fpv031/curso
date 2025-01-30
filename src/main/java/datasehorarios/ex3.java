package datasehorarios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o mês (1 a 12): ");
        int mes = sc.nextInt();
        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        boolean diaValido = false;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:  // Meses com 31 dias
                if (dia >= 1 && dia <= 31) {
                    diaValido = true;
                }
                break;
            case 4: case 6: case 9: case 11:  // Meses com 30 dias
                if (dia >= 1 && dia <= 30) {
                    diaValido = true;
                }
                break;
            case 2:  // Fevereiro (considerando não ser ano bissexto)
                if (dia >= 1 && dia <= 28) {
                    diaValido = true;
                }
                break;
        }

        if (diaValido) {
            System.out.println("Dia válido.");
        } else {
            System.out.println("Dia inválido.");
        }
    }

}
