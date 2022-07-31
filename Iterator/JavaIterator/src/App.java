import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> carros = new ArrayList<String>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("City");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Ka");

        System.out.println(carros);

        System.out.println();
        System.out.println();

        System.out.println("---------------------------------------");
        System.out.println("Trabalhando com o Iterator da classe");
        System.out.println("---------------------------------------");

        Iterator<String> it = carros.iterator();

        while(it.hasNext()){
           System.out.println(it.next());
        }

        System.out.println("   ------------------------------------------------------");
        System.out.println("   Trabalhando com o Iterator da classe - Removendo itens");
        System.out.println("   ------------------------------------------------------");

        while (it.hasNext()){
            String carro = it.next();
            if (carro == "Argo") {
                it.remove();
            }
        }

        System.out.println(carros);

     }
}
