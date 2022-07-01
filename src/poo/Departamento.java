package poo;

public class Departamento {
    private String Nome;
    private Funcionario[] funcionarios=new Funcionario[10];


    public Departamento(String nome) {
        Nome = nome;

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Funcionario getFuncionarios(int pos) {
        return funcionarios[pos];
    }

    public void setFuncionarios(int pos,String nome,float salario,String data) {
        this.funcionarios[pos] = new Funcionario(nome,salario,data);
    }
}
