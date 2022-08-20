package academy.devdojo.maratonajava.Rdates.testes;

import java.util.Date;

public class DateTest01 {

   public static void main(String[] args) {
      Date data = new Date(1661015112048L); // long de milisegundos;
      System.out.println(data);
      data.setTime(data.getTime() + 3_600_000); // Adicionando uma hora a mais
      System.out.println(data);
   }

}
