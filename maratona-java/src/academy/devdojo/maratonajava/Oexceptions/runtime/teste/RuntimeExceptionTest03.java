package academy.devdojo.maratonajava.Oexceptions.runtime.teste;

public class RuntimeExceptionTest03 {

   public static void main(String[] args) {

      abreConexao();

      abreConexao2();

   }

   private static String abreConexao() {
      try {
         System.out.println("Abrindo arquivo");
         System.out.println("Escrevendo dados no arquivo");
         /*throw new RuntimeException();*/
         return "conexão aberta";
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         System.out.println("Fechando o arquivo");
      }
      return null;
   }

   private static void abreConexao2() {
      try {
         System.out.println("Abrindo arquivo");
         System.out.println("Escrevendo dados no arquivo");
         /*throw new RuntimeException();*/
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         System.out.println("Fechando o arquivo");
      }

   }

}
