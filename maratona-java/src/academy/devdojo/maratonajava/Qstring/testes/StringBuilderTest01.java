package academy.devdojo.maratonajava.Qstring.testes;

public class StringBuilderTest01 {

   public static void main(String[] args) {
      String nome = "Anderson Pires";
      nome.concat(" de Almeida");
      System.out.println(nome);

      StringBuilder sb = new StringBuilder("Anderson Antonio");
      sb.append(" Pires de Almeida");
      System.out.println(sb);
      sb.reverse();
      System.out.println(sb);
      sb.delete(1, 5);
      System.out.println(sb);

   }

}
