package Metodos;

import java.util.Scanner;

public class ex2 {
    public static void classificarTemperatura(double temperatura) {
        if (temperatura < 18) {
            System.out.println("Está frio.");
        } else if (temperatura >= 18 && temperatura <= 25) {
            System.out.println("Está agradável.");
        } else {
            System.out.println("Está quente.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = sc.nextDouble();
        classificarTemperatura(temperatura);
        sc.close();
    }
}
