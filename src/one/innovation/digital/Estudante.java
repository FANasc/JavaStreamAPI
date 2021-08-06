package one.innovation.digital;

public class Estudante {

    private String nome;
    private Integer idade;

    public Estudante(String nome, Integer idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder str = null;
        str = new StringBuilder();
        str.append("Nome: " + getNome() + " - Idade: " + getIdade());
        return str.toString();
    }
}
