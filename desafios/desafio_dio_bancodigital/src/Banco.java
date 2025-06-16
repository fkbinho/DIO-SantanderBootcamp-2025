import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNumero() + ", Titular: " + conta.getTitular().getNome());
        }
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNome());
        }
    }

    public Conta buscarContaPorNumero(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void exibirTodasContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
