package academy.devdojo.maratonajava.Rdates.testes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
   public static void main(String[] args) {
      LocalDateTime ldt = LocalDateTime.now();

      LocalDate date = LocalDate.of(2022, Month.AUGUST, 27);
      LocalDate dateParse = LocalDate.parse("2022-08-27");

      LocalTime time = LocalTime.of(9, 45, 00);
      LocalTime timeParse = LocalTime.parse("09:45:00");

      System.out.println(ldt);

      LocalDateTime ldt1 = date.atTime(time);

      System.out.println(ldt1);

      LocalDateTime ldt2 = time.atDate(date);

      System.out.println(ldt2);


   }
}
