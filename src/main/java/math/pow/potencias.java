package math.pow;

public class potencias {
    public static void main(String[] args) {

        double[] bases = {2, 5, 10, 3, 7, 2, 0.5, 1, 4, -2, 6, 8, -3, 9, 2, 0.1, 100, 10, -1, 0};
        double[] expoentes = {3, 2, 0, 4, 2, 10, 2, 100, 0.5, 3, 3, 2, 2, 0.5, -3, 2, 0.5, -2, 3, 5};

        for (int i = 0; i < bases.length; i++) {
            double resultado = Math.pow(bases[i], expoentes[i]);
            System.out.println(bases[i] + " elevado a " + expoentes[i] + ": " + resultado);
        }
    }
}
