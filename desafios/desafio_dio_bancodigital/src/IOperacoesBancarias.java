public interface IOperacoesBancarias {
    boolean sacar(double valor);

    boolean depositar(double valor);

    boolean transferir(double valor, Conta destino);

    void imprimirExtrato();
}
