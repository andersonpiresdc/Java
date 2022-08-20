package academy.devdojo.maratonajava.Qstring.testes;

public class StringPerformaceTest {

   public static void main(String[] args) {
      long inicio = System.currentTimeMillis();
      concatString(30000);
      long termino = System.currentTimeMillis();
      System.out.println("Tempo de execução concatString: "+(termino - inicio) + "ms");

      inicio = System.currentTimeMillis();
      concatStringBuilder(300000);
      termino = System.currentTimeMillis();
      System.out.println("Tempo de execução concatStringBuilder: "+(termino - inicio) + "ms");

      inicio = System.currentTimeMillis();
      concatStringBuffer(300000);
      termino = System.currentTimeMillis();
      System.out.println("Tempo de execução concatStringBuffer: "+(termino - inicio) + "ms");

   }

   private static void concatString(int tamanho){
      String texto = "";

      for (int i=0;i<tamanho;i++){
         texto +=i;
      }
   }

   private static void concatStringBuilder(int tamanho){
      StringBuilder sb = new StringBuilder();

      for (int i=0;i<tamanho;i++){
         sb.append(i);
      }
   }

   private static void concatStringBuffer(int tamanho){
      StringBuffer sb = new StringBuffer();

      for (int i=0;i<tamanho;i++){
         sb.append(i);
      }
   }
}
