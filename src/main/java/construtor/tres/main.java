package construtor.tres;

public class main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Fp", 1500.75, "Poupança");
        ContaBancaria conta2 = new ContaBancaria("Jp", 100.00, "Corrente");
        ContaBancaria conta3 = new ContaBancaria("Arthur", 0, "Corrente");

        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
        conta3.exibirInformacoes();
    }
}
