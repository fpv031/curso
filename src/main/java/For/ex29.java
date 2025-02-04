package For;

public class ex29 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 3};

        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
