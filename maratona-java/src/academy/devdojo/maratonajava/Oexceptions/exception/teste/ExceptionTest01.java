package academy.devdojo.maratonajava.Oexceptions.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {

   public static void main(String[] args){

      criarNovoArquivo();

   }

   private static void criarNovoArquivo(){
      File file = new File("arquivos\\teste.txt");
      try {
         file.createNewFile();
      }catch(IOException e){
         e.printStackTrace();
      }

   }

}
