package academy.devdojo.maratonajava.Rdates.testes;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocaleDateTest01 {
   public static void main(String[] args) {
      System.out.println(new Date());
      System.out.println(Calendar.getInstance());
      System.out.println(Month.JANUARY.getValue());
      LocalDate data = LocalDate.of(2022, Month.AUGUST, 27);
      System.out.println("Ano: "+data.getYear());
      System.out.println("Mês: "+data.getMonth());
      System.out.println("Número do Mês: "+data.getMonthValue());
      System.out.println("Dia da Semana: "+data.getDayOfWeek());
      System.out.println("Dia do Mês: "+data.getDayOfMonth());
      System.out.println("Númeo de dias do Mês: "+data.lengthOfMonth());
      System.out.println("Ano Bisesto: "+data.isLeapYear());
      System.out.println(" "+data.get(ChronoField.MONTH_OF_YEAR));
      System.out.println(data);
   }
}
