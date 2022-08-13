package academy.devdojo.maratonajava.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.10;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Canculando imposto do tomate...");
        return valor * IMPOSTO_POR_CENTO;
    }
}
