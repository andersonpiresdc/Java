package academy.devdojo.maratonajava.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        salario = salario + salario * 0.20;
    }

    @Override
    public void buscarNome() {
        System.out.println("Desenvolvedor busca nome: "+nome);
    }

    public void imprimir(){
        System.out.println("-------------------------------------");
        System.out.println("Desenvolvedor: "+nome+", salário: "+salario);
        System.out.println("-------------------------------------");
    }



}
