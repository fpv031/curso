package For;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        int soma = 0;
        while (num != 0) {
            soma += num % 10;
            num /= 10;
        }
        System.out.println("A soma dos dígitos é: " + soma);
         sc.close();
    }
}
