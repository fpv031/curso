package ternaria.ex14;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        sc.close();

        System.out.println((num >=10 && num <=50) ?"\nDentro do intervalo":"Fora do intervalo");
    }
}
