public abstract class Conta implements IOperacoesBancarias {
    private static final String AGENCIA_PADRAO = "2603";
    private static int SEQUENCIAL  = 1;

    private String agencia;
    private int numero;
    protected double saldo;
    private Cliente titular;

    public Conta(Cliente titular) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.titular = titular;
        this.saldo = 0.0;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean transferir(double valor, Conta destino) {
        if (valor > 0 && valor <= this.saldo) {
            this.sacar(valor);
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.printf("Titular: %s%n", this.titular.getNome());
        System.out.printf("Agência: %s%n", this.agencia);
        System.out.printf("Conta: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }
}
