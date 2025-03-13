package gettesestteres.dois;

    public class ContaBancaria {
        private String titular;
        private double saldo;

        public ContaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        public boolean sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
                return true;
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente para realizar o saque.");
                return false;
            } else {
                System.out.println("Valor de saque inválido.");
                return false;
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo atual: " + saldo);
        }
    }