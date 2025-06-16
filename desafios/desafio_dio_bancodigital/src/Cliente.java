public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private char sexo;

    public Cliente(String nome, String cpf, int idade, char sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente:\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Idade: " + idade + "\n" +
                "Sexo: " + sexo + "\n";

    }
}
