import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        HashMap<Integer,String> carros = new HashMap<Integer,String>();

        // Adicionando elementos na coleção
        carros.put(1, "Polo");
        carros.put(2, "HRV");
        carros.put(3, "Golf");
        carros.put(4, "Camaro");
        carros.put(5, "Mustang");
        carros.put(6, "Cruze");

        System.out.println(carros);
        System.out.println(carros.get(2));

        System.out.println("------------------------------------------------");
        System.out.println("Utilizando for tradicional da coleção HashMap");
        System.out.println("------------------------------------------------");
        for(int i=1;i<=carros.size();i++){
            System.out.println(carros.get(i));
        }

        System.out.println("------------------------------------------------");
        System.out.println("Utilizando foreach da coleção HashMap");
        System.out.println("------------------------------------------------");

        for(String c:carros.values()){
            System.out.println(c);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Removendo items da coleção HashMap");
        System.out.println("------------------------------------------------");
        // Remover o Item
        carros.remove(5);
        for(String c:carros.values()){
            System.out.println(c);
        }


        System.out.println("------------------------------------------------");
        System.out.println("Limpando a coleção HashMap");
        System.out.println("------------------------------------------------");

        // Limpar o Item
        carros.clear();
        for(String c:carros.values()){
            System.out.println(c);
        }


    }
}
