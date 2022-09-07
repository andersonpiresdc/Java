package academy.devdojo.maratonajava.Rdates.testes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
   public static void main(String[] args) {
      LocalDateTime now = LocalDateTime.now();
      LocalDateTime nowAfterTwoYaers = LocalDateTime.now().plusYears(2).plusMinutes(8);
      LocalTime timeNow = LocalTime.now();
      LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
      Duration d1 = Duration.between(now, nowAfterTwoYaers);
      Duration d2 = Duration.between(timeNow, timeMinus7Hours);
      Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
      System.out.println(d1);
      System.out.println(d2);
      System.out.println(d3);
   }
}
