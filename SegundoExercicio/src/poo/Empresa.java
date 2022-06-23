package poo;

public class Empresa {
    private String Nome;
    private String CNPJ;
    public Departamento[] departamentos=new Departamento[10];

    public Empresa(String nome, String CNPJ) {
        Nome = nome;
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return Nome;
    }

    public String getDepartamentos(int pos) {
        return ""+departamentos[pos].getNome()+"\n";

    }

    public void setDepartamentos(int pos,String nome) {
        if( pos<=10)
        {
            this.departamentos[pos]=new Departamento(nome);
        }

    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    public void aumentoSalarial(int numDepartamento,int percentagem)
    {
        double porcento,aumento;

        for(int i=0;i<=3;i++)
        {
            porcento=percentagem*departamentos[numDepartamento].getFuncionarios(i).getSalario()/100;
            aumento=departamentos[numDepartamento].getFuncionarios(i).getSalario()+porcento;
            departamentos[numDepartamento].getFuncionarios(i).setSalario((float) aumento);
        }
    }
public void TransfFuncionario(int numDepartamento,int numFuncionario,int numProximodepartamento,int numNovo){
        Funcionario FuncAuxiliar=departamentos[numDepartamento].getFuncionarios(numFuncionario);
        departamentos[numProximodepartamento].setFuncionarios(numNovo,FuncAuxiliar.getNome(),FuncAuxiliar.getSalario(),FuncAuxiliar.getData());
        departamentos[numDepartamento].setFuncionarios(numFuncionario,"",00.00f,"");
}

}
