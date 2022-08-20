package academy.devdojo.maratonajava.Rdates.testes;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
   public static void main(String[] args) {
      Locale localeBrazil = new Locale("pt","BR");
      Locale localeItalia = new Locale("it", "IT");
      Locale localeIndia = new Locale("hi", "IN");
      Locale localeJapao = new Locale("ja", "JP");
      Calendar calendar = Calendar.getInstance();
      DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
      DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
      DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
      DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
      System.out.println("localeBrazil: "+df1.format(calendar.getTime()));
      System.out.println("localeItalia: "+df2.format(calendar.getTime()));
      System.out.println("localeIndia: "+df3.format(calendar.getTime()));
      System.out.println("localeJapao: "+df4.format(calendar.getTime()));

      System.out.println(localeBrazil.getDisplayCountry());
      System.out.println(localeItalia.getDisplayCountry());
      System.out.println(localeIndia.getDisplayCountry());
      System.out.println(localeJapao.getDisplayCountry());
   }
}
