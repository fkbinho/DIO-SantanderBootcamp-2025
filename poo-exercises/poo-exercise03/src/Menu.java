import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine machine = new PetMachine();

    public static void init () {
        int option;
        do{
            mostrarMenu();

            try {
                System.out.println("Escolha uma opção:");
                option = scanner.nextInt();
                processarOpcao(option);
            } catch (InputMismatchException e){
                System.out.println("Opção inválida. Por favor, insira um número.");
                scanner.next();
                option = -1;
            }
        } while (option != 0);
    }

    private static void mostrarMenu() {
        String menu = """
                1. Dar banho no Pet
                2. Abastecer com água
                3. Abastecer com shampoo
                4. Verificar nivel de água
                5. Verificar nivel de shampoo
                6. Verificar se tem pet no banho
                7. Colocar pet na máquina
                8. Retirar pet da máquina
                9. Limpar máquina
                0. Sair
                """;
        System.out.println(menu);
    }

    private static void processarOpcao(int option) {
        switch (option) {
            case 1 -> machine.takeAShower();
            case 2 -> machine.addWater();
            case 3 -> machine.addShampoo();
            case 4 -> machine.checkWater();
            case 5 -> machine.checkShampoo();
            case 6 -> machine.checkIfPetInMachine();
            case 7 -> setPetInMachine();
            case 8 -> machine.removePet();
            case 9 -> machine.cleanMachine();
            case 0 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void setPetInMachine() {
        System.out.print("Digite o nome do pet: ");
        String name = scanner.next();
        Pet pet = new Pet(name);
        machine.insertPet(pet);
    }


}
