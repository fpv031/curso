package For;

public class ex28 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = (double) soma / vetor.length;
        System.out.println("A média dos elementos do vetor é: " + media);
    }
}
