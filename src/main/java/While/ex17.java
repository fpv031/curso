package While;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int i = 2;
        boolean primo = true;

        do {
            if (num % i == 0) {
                primo = false;
                break;
            }
            i++;
        } while (i <= num / 2);

        if (primo && num > 1) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
             sc.close();
        }
    }
}
