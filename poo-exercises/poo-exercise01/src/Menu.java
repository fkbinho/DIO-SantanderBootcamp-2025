import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner scan = new Scanner(System.in);
    private static ContaBancaria contaBancaria;

    public static void iniciar() {
        criarConta();

        int opcao;
        do {
            exibirMenu();
           try {
               opcao = scan.nextInt();
               executarOpcaoEscolhida(opcao);
           } catch (InputMismatchException e) {
               System.out.println("Opção inválida. Por favor, digite um número.");
               scan.nextLine();
               opcao = -1;
           }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        String menu = """
                \n====== MENU ======
                1. Consultar saldo
                2. Consultar chegue especial
                3. Depositar dinheiro
                4. Sacar dinheiro
                5. Pagar boleto
                6. Verificar uso do cheque especial
                0. Sair
                Escolha uma opção: 
                """;
        System.out.print(menu);
    }

    private static void executarOpcaoEscolhida(int opcao) {
        switch (opcao){
            case 1 -> System.out.println("Saldo atual: R$ " + contaBancaria.getSaldo());
            case 2 -> System.out.println("Cheque especial disponível: R$ " + contaBancaria.getChequeEspecial());
            case 3 -> {
                System.out.print("Digite o valor a depositar: R$ ");
                double valor = lerValor();
                contaBancaria.depositar(valor);
            }
            case 4 -> {
                System.out.print("Digite o valor a sacar: R$ ");
                double valor = lerValor();
                contaBancaria.sacar(valor);
            }
            case 5 -> {
                System.out.print("Digite o valor do boleto: R$ ");
                double valor = lerValor();
                contaBancaria.pagarBoleto(valor);
            }
            case 6 -> System.out.println(contaBancaria.estaUsandoChequeEspecial()
                    ? "Você está usando o cheque especial."
                    : "Você não está usando o cheque especial.");
            case 0 -> System.out.println("Saindo do programa...");
        }
    }

    private static void criarConta() {
        System.out.println("===== CRIAÇÃO DE CONTA =====");
        double depositoInicial;
        while (true) {
            try {
                System.out.print("Digite o valor do depósito inicial: R$ ");
                depositoInicial = scan.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Tente novamente.");
                scan.nextLine();
            }
        }
        contaBancaria = new ContaBancaria(depositoInicial);
    }


    private static double lerValor() {
        double valor;
        try {
            valor = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Voltando ao menu.");
            scan.nextLine();
            return 0;
        }
        return valor;
    }

}
