package academy.devdojo.maratonajava.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        salario = salario + salario * 0.10;
    }

    @Override
    public void buscarNome() {
        System.out.println("busca nomes..."+nome);
    }

    public void imprimir(){
        System.out.println("-------------------------------------");
        System.out.println("Gerente: "+nome+", salário: "+salario);
        System.out.println("-------------------------------------");
    }
}
