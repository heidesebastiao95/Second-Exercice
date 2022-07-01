package poo;

public  class Funcionario  {
    private String Nome;
    private float salario;
    private String data;


    public Funcionario(String nome, float salario, String data) {
        Nome = nome;
        this.salario = salario;
        this.data = data;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
