package academy.devdojo.maratonajava.Npolimorfismo.teste;

import academy.devdojo.maratonajava.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {

   public static void main(String[] args){

      Computador computador = new Computador("Delli7", 11000);
      Tomate tomate = new Tomate("Vermelho", 10);

      CalculadoraImposto.calcularImpostoComputador(computador);
      System.out.println("=====================================================");
      CalculadoraImposto.calcularImpostoTomate(tomate);

   }

}
