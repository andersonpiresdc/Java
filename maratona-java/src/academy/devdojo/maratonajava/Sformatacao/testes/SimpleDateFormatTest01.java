package academy.devdojo.maratonajava.Sformatacao.testes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
   public static void main(String[] args) {
      String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z";
      String mascaranova = "'Dois Córregos', dd 'de' MMMM 'de' yyyy";
      SimpleDateFormat sdf = new SimpleDateFormat(mascaranova);
      String data = sdf.format(new Date());
      System.out.println(data);
   }
}
