package construtor.tres;

    public class ContaBancaria {
        String titular;
        double saldo;
        String tipoConta;

        public ContaBancaria(String titular, double saldo, String tipoConta) {
            this.titular = titular;
            this.saldo = saldo;
            this.tipoConta = tipoConta;
        }

        public ContaBancaria(String titular) {
            this.titular = titular;
            this.saldo = 0.0;
            this.tipoConta = "Corrente";
        }

        public void exibirInformacoes() {
            System.out.println("Titular: " + this.titular);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Tipo de Conta: " + this.tipoConta);
        }
}
