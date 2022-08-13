package academy.devdojo.maratonajava.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Toya", 10000);

        gerente.imprimir();
        desenvolvedor.imprimir();
    }

}
