package TyrCath.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        String num1 = sc.nextLine();

        try {
            Integer.parseInt(num1);

            System.out.println(num1);
        }
        catch (NumberFormatException e){
            System.out.println("Valor inválido");
        }

        System.out.println("Finalizando programa...");
    }
}
