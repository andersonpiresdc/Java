package academy.devdojo.maratonajava.Oexceptions.runtime.teste;

public class RuntimeExceptionTest02 {

   public static void main(String[] args){
      double resultado = 0;

      try {
         resultado = divisao(10, 2);
      }catch(RuntimeException e){
         e.printStackTrace();
      }

      System.out.println("O resultado da divisão é: "+resultado);
   }

   private static int divisao(int a, int b){

/*      if (b == 0) {
         throw new RuntimeException("Argumento ilegal, não pode ser 0");
      } */

/*O código acima é um forma mais generica de se tratar uma exception no Java através de um lançamento de exeção
 thron */

/*Já o código abaixo é uma forma mais especifica de se tratar uma exception no Java através de um lançamento de exeção
 thron */
      if (b == 0) {
         throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
      }

      return a/b;

/*O código abaixo é uma forma mais genérica de se tratar uma exception no Java de try{}catch{} */

      /*try{
         return a/b;
      }catch(RuntimeException e){
         e.printStackTrace();
      }
      return 0;*/
   }

}
