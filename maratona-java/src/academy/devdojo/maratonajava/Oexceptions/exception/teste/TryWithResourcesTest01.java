package academy.devdojo.maratonajava.Oexceptions.exception.teste;

import academy.devdojo.maratonajava.Oexceptions.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.Oexceptions.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {

   public static void main(String[] args){

      try{
         lerLeitor();
      }catch(IOException e){
         e.printStackTrace();
      }

   }

   /*TryWithResource eu posso remover o catch, porem tenho que declarar o throw na função como mostrado no lerArquivoNew*/
   public static void lerArquivo(){
      try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

      }catch(IOException e){
         e.printStackTrace();
      }
   }

   public static void lerArquivoNew() throws IOException{
      try(Reader reader = new BufferedReader(new FileReader("Teste.txt"))){

      }
   }

   public static void lerLeitor() throws IOException{
      try(Leitor1 leitor1 = new Leitor1();
          Leitor2 leitor2 = new Leitor2()){
      }
   }

   public static void lerArquivo2() {
      Reader reader = null;
      try {
         reader = new BufferedReader(new FileReader("teste.txt"));
      } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
      }finally{
         try {
            if (reader != null) {
               reader.close();
            }
         } catch (IOException e) {
            throw new RuntimeException(e);
         }
      }
   }

}
