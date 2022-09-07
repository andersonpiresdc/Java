package academy.devdojo.maratonajava.Rdates.testes;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
   public static void main(String[] args) {
      Instant inst = Instant.now();
      System.out.println(inst);
      System.out.println(LocalDateTime.now());
      System.out.println(inst.getEpochSecond());
      System.out.println(inst.getNano());
   }
}
