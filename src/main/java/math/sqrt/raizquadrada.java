package math.sqrt;

public class raizquadrada {
    public static void main(String[] args) {


        double[] numeros = {16, 81, 2, 0, 144, 225, 0.25, 1, 10, 400, 0.04, 121, 625, 50, 900, 10000, 0.001, 36, 49, 169};


        for (int i = 0; i < numeros.length; i++) {
            double raizQuadrada = Math.sqrt(numeros[i]);

            if (numeros[i] == 2) {
                System.out.println("Raiz quadrada de " + numeros[i] + " : " + String.format("%.2f", raizQuadrada));
            } else if (numeros[i] == 10) {
                System.out.println("Raiz quadrada de " + numeros[i] + " : " + String.format("%.1f", raizQuadrada));
            } else if (numeros[i] == 0.001) {
                System.out.println("Raiz quadrada de " + numeros[i] + " : " + String.format("%.3f", raizQuadrada));
            } else {
                System.out.println("Raiz quadrada de " + numeros[i] + ": " + raizQuadrada);
            }
        }
    }
}