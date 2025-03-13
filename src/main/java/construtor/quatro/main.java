package construtor.quatro;

public class main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto A", 50.0);
        Produto produto2 = new Produto("Produto B", -10.0);

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
    }
}

