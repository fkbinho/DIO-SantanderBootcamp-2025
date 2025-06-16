import java.util.Scanner;

public class MenuOperacoesBancarias {
    private static final Scanner scan = new Scanner(System.in);

    public static void exibir(Banco banco) {
        while (true) {
            System.out.println("\nMenu de Operações Bancárias:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Imprimir Extrato");
            System.out.println("5. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1 -> realizarDeposito(banco);
                case 2 -> realizarSaque(banco);
                case 3 -> realizarTransferencia(banco);
                case 4 -> imprimirExtrato(banco);
                case 5 -> {
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    private static void realizarDeposito(Banco banco) {
        Conta conta = buscarConta(banco);
        if (conta != null) {
            System.out.print("Valor do depósito: ");
            double valor = scan.nextDouble();
            scan.nextLine();
            if (conta.depositar(valor)) {
                System.out.println("Depósito realizado com sucesso!");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }
    }

    private static void realizarSaque(Banco banco) {
        Conta conta = buscarConta(banco);
        if (conta != null) {
            System.out.print("Valor do saque: ");
            double valor = scan.nextDouble();
            scan.nextLine();
            if (conta.sacar(valor)) {
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para saque.");
            }
        }
    }

    private static void realizarTransferencia(Banco banco) {
        System.out.print("Número da conta de origem: ");
        int origem = scan.nextInt();
        scan.nextLine();
        System.out.print("Número da conta de destino: ");
        int destino = scan.nextInt();
        scan.nextLine();
        System.out.print("Valor da transferência: ");
        double valor = scan.nextDouble();
        scan.nextLine();

        Conta contaOrigem = banco.buscarContaPorNumero(origem);
        Conta contaDestino = banco.buscarContaPorNumero(destino);

        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.transferir(valor, contaDestino)) {
                System.out.println("Transferência realizada com sucesso!");
            } else {
                System.out.println("Falha na transferência.");
            }
        } else {
            System.out.println("Conta de origem ou destino não encontrada.");
        }
    }

    private static void imprimirExtrato(Banco banco) {
        Conta conta = buscarConta(banco);
        if (conta != null) {
            conta.imprimirExtrato();
        }
    }

    private static Conta buscarConta(Banco banco) {
        System.out.print("Número da conta: ");
        int numero = scan.nextInt();
        scan.nextLine();
        Conta conta = banco.buscarContaPorNumero(numero);
        if (conta == null) {
            System.out.println("Conta não encontrada.");
        }
        return conta;
    }
}
