import java.nio.file.*;

public class altArquivos {

   public static void main(String[] args){

      Path logoNova = Paths.get("/home/anderson/Desenvolvimento/Java/altArquivo/src/imagens/tdpNEW.jpg");
      Path logoOLD  = Paths.get("/home/anderson/Desenvolvimento/Java/altArquivo/src/imagens/tdpOLD.jpg");

      try {
         byte[] bytesLogoNova = Files.readAllBytes(logoNova);
         Files.write(logoOLD, bytesLogoNova);
      }catch (Exception e){
         System.out.println("Erro");
      }

   }
}
