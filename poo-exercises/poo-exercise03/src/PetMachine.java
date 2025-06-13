public class PetMachine {

    private static final int MAX_WATER_CAPACITY = 30;
    private static final int MAX_SHAMPOO_CAPACITY = 10;

    private int water;
    private int shampoo;
    private boolean needsCleaning;

    private Pet pet;

    public PetMachine() {
        this.water = 10;
        this.shampoo = 5;
        this.needsCleaning = false;
        this.pet = null;
    }

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
        } else if (this.pet.isClean()) {
            System.out.println("O pet " + this.pet.getName() + " já está limpo.");
        } else if (this.water >= 10 && this.shampoo >= 2) {
            this.water -= 10;
            this.shampoo -= 2;
            this.pet.setClean(true);
            System.out.println("O pet " + this.pet.getName() + " tomou banho e está limpo.");
        } else {
            System.out.println("A máquina não tem água ou shampoo suficiente para dar banho no pet.");
        }
    }

    public void addWater() {
        if (water == MAX_WATER_CAPACITY) {
            System.out.println("A capacidade da água está no máximo.");
        }

        water += 2;
        System.out.println("A água foi adicionada. Capacidade atual: " + water + "/" + MAX_WATER_CAPACITY);
    }

    public void addShampoo() {
        if (shampoo == MAX_SHAMPOO_CAPACITY) {
            System.out.println("A capacidade do shampoo está no máximo.");
        }

        shampoo += 2;
        System.out.println("O shampoo foi adicionado. Capacidade atual: " + shampoo + "/" + MAX_SHAMPOO_CAPACITY);
    }

    public void insertPet(Pet pet) {
        if (this.pet != null) {
            System.out.println("Já existe um pet na máquina. Remova-o antes de inserir outro.");
        } else if(needsCleaning) {
            System.out.println("A máquina precisa de limpeza antes de inserir um novo pet.");
        } else {
            this.pet = pet;
            System.out.println("O pet " + pet.getName() + " foi inserido na máquina.");
        }
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para remover.");
        } else {
            if (!this.pet.isClean()) {
                this.needsCleaning = true;
                System.out.println("O pet " + this.pet.getName() + " removido não estava limpo. "
                                    + "Por favor, limpe a máquina antes de inserir outro pet.");
            } else {
                System.out.println("O pet " + this.pet.getName() + " retirado limpo.");
            }
        }
        this.pet = null;
    }

    public void cleanMachine() {
        if (this.water >= 3 && this.shampoo >= 1) {
            this.water -= 3;
            this.shampoo -= 1;
            this.needsCleaning = false;
            System.out.println("A máquina foi limpa com sucesso.");
        } else {
            System.out.println("A máquina não tem água ou shampoo suficiente para limpeza.");
        }
    }

    public void checkWater() {
        System.out.println("Água disponível: " + water + "/" + MAX_WATER_CAPACITY);
    }

    public void checkShampoo() {
        System.out.println("Shampoo disponível: " + shampoo + "/" + MAX_SHAMPOO_CAPACITY);
    }

    public void checkIfPetInMachine() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina.");
        } else {
            System.out.println("Pet na máquina: " + this.pet.getName());
        }
    }

}