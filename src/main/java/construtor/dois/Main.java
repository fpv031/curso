package construtor.dois;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fp", 17);
        Pessoa pessoa2 = new Pessoa();

        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
    }
}
