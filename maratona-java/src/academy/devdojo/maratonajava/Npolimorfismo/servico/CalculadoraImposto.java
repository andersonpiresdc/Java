package academy.devdojo.maratonajava.Npolimorfismo.servico;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador "+computador.getNome());
        System.out.println("Valor do imposto: "+computador.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do computador "+tomate.getNome());
        System.out.println("Valor do imposto: "+tomate.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
    }

}
