import java.util.Scanner;

public class Menu {
    private static final Scanner scan = new Scanner(System.in);
    public static void exibir(){
        Banco banco = new Banco("Banco Dev");

        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Gerenciamento de Conta");
            System.out.println("2. Operações Bancárias");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scan.nextInt();
            scan.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> MenuGerenciamentoDeConta.exibir(banco);
                case 2 -> MenuOperacoesBancarias.exibir(banco);
                case 3 -> {
                    System.out.println("Saindo...");
                    scan.close();
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
