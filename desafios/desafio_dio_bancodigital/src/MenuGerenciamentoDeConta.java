import java.util.Scanner;

public class MenuGerenciamentoDeConta {
    private static final Scanner scan = new Scanner(System.in);

    public static void exibir(Banco banco) {
        while (true) {
            System.out.println("\nMenu de Gerenciamento de Conta:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Criar Conta");
            System.out.println("3. Buscar Conta por Número");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Listar Contas");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> cadastrarCliente(banco);
                case 2 -> criarConta(banco);
                case 3 -> buscarContaPorNumero(banco);
                case 4 -> banco.listarClientes();
                case 5 -> banco.listarContas();
                case 6 -> {
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private static void cadastrarCliente(Banco banco) {
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("CPF: ");
        String cpf = scan.nextLine();
        System.out.print("Idade: ");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Sexo (M/F): ");
        char sexo = scan.nextLine().toUpperCase().charAt(0);

        Cliente cliente = new Cliente(nome, cpf, idade, sexo);
        banco.adicionarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void criarConta(Banco banco) {
        System.out.print("CPF do cliente: ");
        String cpf = scan.nextLine();

        Cliente cliente = banco.getClientes().stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.println("Tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scan.nextInt();
        scan.nextLine();

        Conta conta;
        if (tipoConta == 1) {
            conta = new ContaCorrente(cliente);
        } else if (tipoConta == 2) {
            conta = new ContaPoupanca(cliente);
        } else {
            System.out.println("Tipo de conta inválido.");
            return;
        }

        banco.adicionarConta(conta);
        System.out.println("Conta criada com sucesso! Número da conta: " + conta.getNumero());
    }

    private static void buscarContaPorNumero(Banco banco) {
        System.out.print("Digite o número da conta: ");
        int numero = scan.nextInt();
        scan.nextLine();
        Conta conta = banco.buscarContaPorNumero(numero);
        if (conta != null) {
            System.out.println("Conta encontrada:");
            conta.imprimirExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
