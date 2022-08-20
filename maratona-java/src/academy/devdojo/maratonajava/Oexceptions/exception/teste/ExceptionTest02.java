package academy.devdojo.maratonajava.Oexceptions.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {

   public static void main(String[] args){
         try {
            criarNovoArquivo();
         }catch(IOException e){
            e.printStackTrace();
      }
   }

   public static void criarNovoArquivo() throws IOException{
      File file = new File("arquivos\\teste01.txt");
      try{
         file.createNewFile();
      }catch(IOException e){
         e.printStackTrace();
         throw e;
      }

      try{
         criarArquivo();
      }catch(RuntimeException e){
         e.printStackTrace();
      }
   }

   public static void criarArquivo() {
      File file = new File("arquivos\\teste03.txt");
      try{
         file.createNewFile();
      }catch(IOException e){
         e.printStackTrace();
         throw new RuntimeException("Problema ao criar o novo arquivo!");
      }
   }

}
