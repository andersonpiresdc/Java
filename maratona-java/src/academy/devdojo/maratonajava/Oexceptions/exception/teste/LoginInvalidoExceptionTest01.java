package academy.devdojo.maratonajava.Oexceptions.exception.teste;

import academy.devdojo.maratonajava.Oexceptions.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {

   public static void main(String[] args){

      try{
         logar();
      }catch (LoginInvalidoException e){
         e.printStackTrace();
      }

   }

   private static void logar() throws LoginInvalidoException {
      Scanner teclado = new Scanner(System.in);
      String usernameDB = "Anderson";
      String senhaDB = "apa";
      System.out.print("Usuário: ");
      String usernameDBDigitado = teclado.nextLine();
      System.out.print("Senha: ");
      String senhaDigitada = teclado.nextLine();
      if (!usernameDB.equals(usernameDBDigitado) || !senhaDB.equals(senhaDigitada)){
         throw new LoginInvalidoException("Usuário ou senha inválidos");
      }

      System.out.println("Usuário logado com sucesso");
   }

}
