public class app {

   public static void main(String[] args){

      int res, n1, n2;
      n1 = 10;
      n2 = 3;

      System.out.println("-------------------------------------------");
      System.out.println("Math.min()");
      System.out.println("-------------------------------------------");
      res = Math.min(n1,n2);
      System.out.println(res);

      System.out.println();

      System.out.println("-------------------------------------------");
      System.out.println("Math.max()");
      System.out.println("-------------------------------------------");
      res = Math.max(n1,n2);
      System.out.println(res);

      System.out.println();

      System.out.println("-------------------------------------------");
      System.out.println("Math.sqrt() - Raiz quadrada");
      System.out.println("-------------------------------------------");
      double resultado, num1;
      num1 = 255;
      resultado = Math.sqrt(num1);
      System.out.println(resultado);


      System.out.println();

      System.out.println("-------------------------------------------");
      System.out.println("Math.abs() - retorna valor absoluto positivo");
      System.out.println("-------------------------------------------");
      double resAbs, numAbs;
      numAbs = 255;
      resAbs = Math.abs(numAbs);
      System.out.println(resAbs);

      System.out.println();

      System.out.println("-------------------------------------------");
      System.out.println("Math.ramdon() - Retorna valor randomico    ");
      System.out.println("-------------------------------------------");



      System.out.println();

      System.out.println("-------------------------------------------");
      System.out.println("Math.ramdon() - Retorna valor randomico    ");
      System.out.println("-------------------------------------------");

      for(int i=1;i<11;i++){
         System.out.println((int)(Math.random()*10));
      }

      System.out.println(Math.pow(10,10));

   }
}
