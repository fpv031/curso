package ternaria;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        sc.close();

        System.out.println((idade > 60)?"Idoso":(idade >=18)?"Adulto":"Jovem");
    }
}
