import java.nio.file.*;
import java.util.List;

public class trabArquivo {

   public static void main(String[] args){

//      Path diretorio = Paths.get("/home/anderson/Desenvolvimento/Java/");
      Path arquivo = Paths.get("/home/anderson/Desenvolvimento/Java/README.md");

      try {
         List<String> linhas = Files.readAllLines(arquivo);
         /*for(String linha:linhas){
            System.out.println(linha);
         }*/

         linhas.forEach(linha -> System.out.println(linha));

      }catch(Exception e){
        System.out.println("Erro");
      }

   }
}
