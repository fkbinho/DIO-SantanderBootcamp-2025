public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double chegueEspecialUtilizado;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        this.chequeEspecial = (depositoInicial <= 500 ? 50 : depositoInicial * 0.5);
        this.chegueEspecialUtilizado = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public boolean estaUsandoChequeEspecial() {
        return saldo < 0;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser positivo.");        }
        saldo += valor;

        if (estaUsandoChequeEspecial()) {
            tentarPagarChequeEspecial();
        } else {
            System.out.println("Depósito efetuado com sucesso.");
        }
    }

    public void sacar(double  valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo.");
            return;
        }

        if (valor <= getTotalDisponivel()) {
            saldo -= valor;
            if (saldo < 0) {
                chegueEspecialUtilizado = -saldo;
            }
            System.out.println("Saque de R$ " + valor + " efetuado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void pagarBoleto(double valor) {
        if (valor <= 0) {
            System.out.println("Valor do boleto deve ser positivo.");
            return;
        }

        if (valor <= getTotalDisponivel()) {
            saldo -= valor;
            if (saldo < 0) {
                chegueEspecialUtilizado = -saldo;
            }
            System.out.println("Boleto pago com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para pagar o boleto.");
        }
    }

    private void tentarPagarChequeEspecial() {
        double taxaChequeEspecial = chegueEspecialUtilizado * 0.2;
        double totalAPagar = chegueEspecialUtilizado + taxaChequeEspecial;

        if (saldo >= totalAPagar) {
            saldo -= totalAPagar;
            chegueEspecialUtilizado = 0;

            System.out.println("Cheque especial quitado com taxa de R$ " + taxaChequeEspecial);
        } else {
            System.out.println("Depósito efetuado, mas não foi possível quitar o cheque especial.");
        }
    }

    private double getTotalDisponivel() {
        return saldo + chequeEspecial - chegueEspecialUtilizado;
    }
}
