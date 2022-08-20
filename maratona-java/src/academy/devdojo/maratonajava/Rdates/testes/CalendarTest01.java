package academy.devdojo.maratonajava.Rdates.testes;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {

   public static void main(String[] args) {
      Calendar calendar = Calendar.getInstance();
      System.out.println(calendar);
      Date data = calendar.getTime();
      System.out.println(data);
      if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
         System.out.println("Domingo é o primeiro dia da semana!");
      }
      int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);
      System.out.println("Dia da semana: "+diaSemana);
      int diaMes = calendar.get(Calendar.DAY_OF_MONTH);
      System.out.println("Dia do mês: "+diaMes);
      int diaAno = calendar.get(Calendar.DAY_OF_YEAR);
      System.out.println("Dia do ano: "+diaAno);
      int diaSemanaAno = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
      System.out.println("Número da semana do mês: "+diaSemanaAno);
      int mes = calendar.get(Calendar.MONTH);
      System.out.println("Mes: "+mes);
      int ano = calendar.get(Calendar.YEAR);
      System.out.println("Ano: "+ano);

      calendar.add(Calendar.DAY_OF_MONTH, 2);
      Date newDate = calendar.getTime();
      System.out.println(newDate);

   }

}
