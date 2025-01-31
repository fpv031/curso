package math.expressoesaritimeticas;

public class expressoes {
    public static void main(String[] args) {

        double[] numeros1 = {10, 20, 15, 100, 25, 30, 50, 2, 8, 45, 12, 12, 2, 15, 8, 7, 9, 50, 16, 10};
        double[] numeros2 = {5, 4, 3, 3, 4, 5, 8, 4, 2, 3, 3, 3, 5, 5, 3, 5, 9, 5, 5, 2};
        double[] expoentes = {3, 2, 2, 3, 2, 3, 3, 2, 3, 3, 3, 6, 3, 2, 2, 2, 2, 2, 2, 2};

        System.out.println("1. (10 + 5) * 2 = " + ((numeros1[0] + numeros2[0]) * 2));
        System.out.println("2. (20 - 4) / 2 = " + ((numeros1[1] - numeros2[1]) / 2));
        System.out.println("3. 15 + 3 * 2 = " + (numeros1[2] + numeros2[2] * 2));
        System.out.println("4. 100 / (2 + 3) = " + (numeros1[3] / (2 + 3)));
        System.out.println("5. 25 % 4 = " + (numeros1[4] % 4));
        System.out.println("6. (30 - 5) * (2 + 3) = " + ((numeros1[5] - 5) * (2 + 3)));
        System.out.println("7. (50 / 2) + (8 * 3) = " + ((numeros1[6] / 2) + (8 * 3)));
        System.out.println("8. 2 * (3 + 4) - 5 = " + (2 * (3 + 4) - 5));
        System.out.println("9. 100 - (25 / 5) = " + (100 - (25 / 5)));
        System.out.println("10. (8 + 2) * (6 - 4) = " + ((8 + 2) * (6 - 4)));
        System.out.println("11. 45 % (7 + 3) = " + (45 % (7 + 3)));
        System.out.println("12. (12 / 3) + (18 / 6) = " + ((12 / 3) + (18 / 6)));
        System.out.println("13. 2^3 + 5 * 2 = " + (Math.pow(2, expoentes[0]) + 5 * 2));
        System.out.println("14. (15 - 5) * (3^2) = " + ((15 - 5) * Math.pow(3, 2)));
        System.out.println("15. (8 % 3) + (6 / 2) = " + ((8 % 3) + (6 / 2)));
        System.out.println("16. (7 + 5) - (3 * 2) = " + ((7 + 5) - (3 * 2)));
        System.out.println("17. (9 * 9) - (81 / 9) = " + ((9 * 9) - (81 / 9)));
        System.out.println("18. (50 / (5 + 5)) + 10 = " + ((50 / (5 + 5)) + 10));
        System.out.println("19. (16 % 5) * (7 - 3) = " + ((16 % 5) * (7 - 3)));
        System.out.println("20. (10 + 5) / (2^2) = " + ((10 + 5) / Math.pow(2, expoentes[1])));
    }
}
