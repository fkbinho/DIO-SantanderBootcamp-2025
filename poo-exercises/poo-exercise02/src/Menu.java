import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner scan = new Scanner(System.in);
    private static final Carro carro = new Carro();

    public static void iniciar() {
        int opcao;
        do {
            mostrarOpcoes();

            try {
                System.out.print("Escolha um opção: ");
                opcao = scan.nextInt();
                processarOpcao(opcao);
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Por favor, insira um número.");
                scan.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);
    }

    private static void mostrarOpcoes() {
        String menu = """
                \n==== MENU DO CARRO ====
                1 - Ligar carro
                2 - Desligar o carro
                3 - Acelerar
                4 - Frear
                5 - Virar à esquerda
                6 - Virar à direita
                7 - Mostrar velocidade
                8 - Trocar marcha
                0 - Sair
                """;
        System.out.println(menu);
    }

    private static void processarOpcao(int opcao) {
        switch  (opcao) {
            case 1 -> carro.ligar();
            case 2 -> carro.desligar();
            case 3 -> carro.acelerar();
            case 4 -> carro.frear();
            case 5 -> carro.virar("esquerda");
            case 6 -> carro.virar("direita");
            case 7 -> carro.mostrarVelocidade();
            case 8 -> {
                System.out.print("Digite a marcha desejada (0-6): ");
                try {
                    int novaMarcha = scan.nextInt();
                    carro.trocarMarcha(novaMarcha);
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido. Por favor, insira um número entre 0 e 6.");
                    scan.nextLine();
                }
            }
            case 0 -> System.out.println("Saindo do menu...");
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
