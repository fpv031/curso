package For;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + num + " é: " + fatorial);
         sc.close();
    }
}
