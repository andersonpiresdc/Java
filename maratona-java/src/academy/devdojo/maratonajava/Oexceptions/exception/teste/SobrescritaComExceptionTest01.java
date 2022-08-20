package academy.devdojo.maratonajava.Oexceptions.exception.teste;

import academy.devdojo.maratonajava.Oexceptions.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.Oexceptions.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {

   public static void main(String[] args){
      Pessoa pessoa = new Pessoa();
      Funcionario funcionario = new Funcionario();

      funcionario.salvar();
   }

}
