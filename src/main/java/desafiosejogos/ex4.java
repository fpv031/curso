package desafiosejogos;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int[] nums = {num1, num2, num3};
        java.util.Arrays.sort(nums);  // Ordena os números em ordem crescente

        System.out.println("Números em ordem crescente: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
    }

}
