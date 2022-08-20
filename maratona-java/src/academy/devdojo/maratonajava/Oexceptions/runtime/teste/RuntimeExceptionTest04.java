package academy.devdojo.maratonajava.Oexceptions.runtime.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

   public static void main(String[] args) {

      try{
         throw new RuntimeException();
      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Dentro do ArrayIndexOutOfBoundsException");
         e.printStackTrace();
      }catch(IndexOutOfBoundsException e){
         System.out.println("Dentro do IndexOutOfBoundsException");
         e.printStackTrace();
      }catch(IllegalArgumentException e){
         System.out.println("Dentro do IllegalArgumentException");
         e.printStackTrace();
      }catch(ArithmeticException e){
         System.out.println("Dentro do ArithmeticException");
         e.printStackTrace();
      }catch(RuntimeException e){
         System.out.println("Dentro do RuntimeException");
         e.printStackTrace();
      }

      try{
         talvezLanceException();
      }catch(SQLException e){
         System.out.println("Dentro do SQLException da função talvezLanceException");
         e.printStackTrace();
      }catch(FileNotFoundException e){
         System.out.println("Dentro do FileNotFoundException da função talvezLanceException");
         e.printStackTrace();
      }


      try{
         talvezLanceException();
      }catch(SQLException e){
         System.out.println("Dentro do SQLException da função talvezLanceException");
         e.printStackTrace();
      }catch(FileNotFoundException e){
         System.out.println("Dentro do FileNotFoundException da função talvezLanceException");
         e.printStackTrace();
      }
/* Posso utilizar o código abaixo para melhorar o código, porém as exception não pode estar na mesma linha de herança*/
      try{
         talvezLanceException();
      }catch(SQLException | FileNotFoundException e){
         System.out.println("Dentro do SQLException ou FileNotFoundException da função talvezLanceException");
         e.printStackTrace();
      }
   }

   private static void talvezLanceException() throws SQLException, FileNotFoundException{

   }

}
