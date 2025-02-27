package Metodos;

import java.util.Scanner;

public class ex5 {
    public static void ordenarNumeros(int num1, int num2, int num3) {
        int[] nums = {num1, num2, num3};
        java.util.Arrays.sort(nums);  // Ordena os números em ordem crescente

        System.out.println("Números em ordem crescente: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();
        ordenarNumeros(num1, num2, num3);
        sc.close();
    }
}
