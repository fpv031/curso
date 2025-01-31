package RevisaoIfElse.situaçoescotidianas;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Escolha a conversão (F para Fahrenheit, K para Kelvin): ");
        char escolha = sc.next().charAt(0);

        if (escolha == 'F' || escolha == 'f') {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "°C é igual a " + fahrenheit + "°F.");
        } else if (escolha == 'K' || escolha == 'k') {
            double kelvin = celsius + 273.15;
            System.out.println(celsius + "°C é igual a " + kelvin + "K.");
        } else {
            System.out.println("Opção inválida.");
        }
    }

}
