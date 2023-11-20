package entities;

public class Funcionario {

    private Integer Id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        Id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentaSalario(double percentagem){
        salario += (salario * percentagem);
    }

    @Override
    public String toString() {
        return "Id: " + Id + "\nnome " + nome + "\nsalario: " + salario;
    }
}
