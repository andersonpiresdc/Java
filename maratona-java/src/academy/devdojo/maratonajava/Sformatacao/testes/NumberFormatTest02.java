package academy.devdojo.maratonajava.Sformatacao.testes;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
   public static void main(String[] args) {
      Locale localePT = new Locale("pt", "BR");
      Locale localeJP = Locale.JAPAN;
      Locale localeIT = Locale.ITALY;
      Locale localeDefault = Locale.getDefault();
      NumberFormat[] nfa = new NumberFormat[4];
      nfa[0] = NumberFormat.getCurrencyInstance(localePT);
      nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
      nfa[2] = NumberFormat.getCurrencyInstance(localeIT);
      nfa[3] = NumberFormat.getCurrencyInstance(localeDefault);
      double valor = 10_000.2130;

      for(NumberFormat numberFormat : nfa){
         System.out.println(numberFormat.getMaximumFractionDigits());
         System.out.println(numberFormat.format(valor));
      }

      String valorString = "R$10000.2130";

      try{
         System.out.println(nfa[0].parse(valorString));
      }catch(ParseException e){
         e.printStackTrace();
      }


   }
}
