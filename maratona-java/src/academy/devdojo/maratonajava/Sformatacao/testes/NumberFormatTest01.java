package academy.devdojo.maratonajava.Sformatacao.testes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
   public static void main(String[] args) {
      Locale localePT = new Locale("pt", "BR");
      Locale localeJP = Locale.JAPAN;
      Locale localeIT = Locale.ITALY;
      Locale localeDefault = Locale.getDefault();
      NumberFormat[] nfa = new NumberFormat[4];
      nfa[0] = NumberFormat.getInstance(localePT);
      nfa[1] = NumberFormat.getInstance(localeJP);
      nfa[2] = NumberFormat.getInstance(localeIT);
      nfa[3] = NumberFormat.getInstance(localeDefault);
      double valor = 10_000.2130;

      for(NumberFormat numberFormat : nfa){
         System.out.println(numberFormat.getMaximumFractionDigits());
         numberFormat.setMaximumFractionDigits(2);
         System.out.println(numberFormat.format(valor));
      }

      String valorString = "10000.2130";

/*      Double.parseDouble(valorString);
      Float.parseFloat(valorString);*/
      System.out.println();
      System.out.println();

      try{
         System.out.println(nfa[0].parse(valorString));
      }catch(ParseException e){
         e.printStackTrace();
      }

   }
}
