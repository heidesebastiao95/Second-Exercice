package poo;

public class Main {

    public static void main(String[] args) {
	// write your code here.

        //Criando empresa.
        Empresa primEmpresa=new Empresa("HS Company","DHK2343454H RREUU78");

        //Definindo os departamentos
        primEmpresa.setDepartamentos(0,"Tecnologia de Informacao");
        primEmpresa.setDepartamentos(1,"Recursos Humanos");
        primEmpresa.setDepartamentos(2,"Limpesa");
        primEmpresa.setDepartamentos(3,"Manuntencao");
        primEmpresa.setDepartamentos(4,"Saude");

        //Adicionando funcionarios
        primEmpresa.departamentos[0].setFuncionarios(0,"Heide Sebastiao",800.000f,"10/02/2023");
        primEmpresa.departamentos[0].setFuncionarios(1,"Nilton Daniel",200.56f,"4/05/2021");
        primEmpresa.departamentos[0].setFuncionarios(2,"Evandro Daniel",100.56f,"10/02/2020");
        primEmpresa.departamentos[0].setFuncionarios(3,"Gabriel Raul",230.56f,"10/02/2022");

        primEmpresa.departamentos[1].setFuncionarios(0,"Carlos Bernado",80.56f,"10/02/2023");
        primEmpresa.departamentos[1].setFuncionarios(1,"Salmos Sebastiao",20.56f,"10/02/2020");
        primEmpresa.departamentos[1].setFuncionarios(2,"Ivan Guedes",100.56f,"10/02/2021");
        primEmpresa.departamentos[1].setFuncionarios(3,"Felicia Raul",23.56f,"10/02/2019");

        primEmpresa.departamentos[2].setFuncionarios(0,"Edmundo Simao",80.56f,"10/02/2024");
        primEmpresa.departamentos[2].setFuncionarios(1,"Quim da costa",20.56f,"10/04/2023");
        primEmpresa.departamentos[2].setFuncionarios(2,"Jordan Ferreira",100.56f,"12/03/2023");
        primEmpresa.departamentos[2].setFuncionarios(3,"Andreia Pedro",23.56f,"10/02/2013");

        primEmpresa.departamentos[3].setFuncionarios(0,"Andre guerreiro",80.56f,"10/02/2023");
        primEmpresa.departamentos[3].setFuncionarios(1,"Pedro Matos",20.56f,"10/02/2023");
        primEmpresa.departamentos[3].setFuncionarios(2,"Jordan Silva",100.56f,"10/02/2023");
        primEmpresa.departamentos[3].setFuncionarios(3,"Elizandra Virginia",23.56f,"10/02/2023");

        //Consulta,apresentando os funcionarios.

        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++){

                System.out.println("\n"+"=========Departamento=========: "
                        +primEmpresa.departamentos[i].getNome()+"\n======Funcionario/a=====\n"+
                        "Nome: "+primEmpresa.departamentos[i].getFuncionarios(j).getNome()+"\n Salario: "
                        +primEmpresa.departamentos[i].getFuncionarios(j).getSalario()+" kz"+
                        "\n Data de entrada: "+primEmpresa.departamentos[i].getFuncionarios(j).getData()+"");
            }

        }

            // Aumento salarial.Os parametros: posicao do departamento,valor da percentagem.
        primEmpresa.aumentoSalarial(0,10);


        /*  Transferindo um funcionario para outro departamento.Os parametros :
        posicao do departamento actual,posicao do funcionario,posicao do proximo departamento,
        nova posicao do funcionario.
         */
        primEmpresa.TransfFuncionario(1,2,3,3);


        System.out.println("\n*************Consulta apos actualizacao***********\n");
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=3;j++){

                System.out.println("\n"+"=========Departamento=========: "
                        +primEmpresa.departamentos[i].getNome()+"\n======Funcionario/a=====\n"+
                        "Nome: "+primEmpresa.departamentos[i].getFuncionarios(j).getNome()+"\n Salario: "
                        +primEmpresa.departamentos[i].getFuncionarios(j).getSalario()+" kz"+
                        "\n Data de entrada: "+primEmpresa.departamentos[i].getFuncionarios(j).getData()+"");
            }

        }

    }

}
