package math.abs;

public class absoluto {
    public static void main(String[] args) {

        double[] numeros = {-10, 15, 0, -5.5, -100, -0.01, -1234, 3.1415, -999, -1,
                -25, 50, -0.5, -2.718, -777, -100000, -0.0001, 42, -8.8, -500};

        for (int i = 0; i < numeros.length; i++) {
            double valorAbsoluto = Math.abs(numeros[i]);
            System.out.println("Valor absoluto de " + numeros[i] + ": " + valorAbsoluto);
        }
    }
}
