import java.util.HashSet;

public class App {
    public static void main(String[] args){

        HashSet<String> carros = new HashSet<String>();

        // Adicionando elementos;
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Curze");
        carros.add("Argo");
        carros.add("Ka");

        System.out.println(carros);

        // Verificando se exists
        String carro = "Camaro";
        if (carros.contains(carro)){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }

        //

    }
}
