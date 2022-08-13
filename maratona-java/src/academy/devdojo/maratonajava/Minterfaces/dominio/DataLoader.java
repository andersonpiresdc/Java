package academy.devdojo.maratonajava.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();

    default void checkPermission(){

        System.out.println("Testando o checkPermission...");

    }

    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }



}
