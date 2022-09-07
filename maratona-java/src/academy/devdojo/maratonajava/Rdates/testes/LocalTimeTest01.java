package academy.devdojo.maratonajava.Rdates.testes;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
   public static void main(String[] args) {
      LocalTime lt = LocalTime.of(23, 30);
      LocalTime ltNow = LocalTime.now();
      System.out.println(lt);
      System.out.println(ltNow);

      System.out.println(lt.getHour());
      System.out.println(lt.getMinute());
      System.out.println(lt.getSecond());

      System.out.println(ltNow.getHour());
      System.out.println(ltNow.getMinute());
      System.out.println(ltNow.getSecond());

      System.out.println(ChronoField.CLOCK_HOUR_OF_AMPM);

      System.out.println(LocalTime.MAX);
      System.out.println(LocalTime.MIN);

   }
}
