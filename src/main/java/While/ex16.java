package While;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int i = 1;

        do {
            System.out.println(num * i);
            i++;
        } while (i <= 10);
        sc.close();
    }
}
