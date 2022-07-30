import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class StackQueue {
   public static void main(String[] args){

      Stack<String> carros = new Stack<>();
      Stack<String> carrosNew = new Stack<>();

      carros.push("HRV");
      carros.push("Golf");
      carros.push("Polo");
      carros.push("Camaro");
      carros.push("Tiggo 3X");

      System.out.println("Topo da pilha: " + carros.peek());
      System.out.println("Topo da pilha e retira o elemento: " + carros.pop());

      if (carros.empty()){
         System.out.println("Pilha está vazia...");
      }else{
         System.out.println("Pilha com elementos...");
      }

      System.out.println(carrosNew.empty()?"Pilha vazia...":"Pilha com elementos...");// -> Com condição ternária

      System.out.println(carros);

//      for(String carro:carros){
//         System.out.println(carro);
//      }

      System.out.println("Aqui começa a Queue");

      fncQueue();

   }

   private static void fncQueue(){

      Queue<String> carrosQueue = new LinkedList<>();

      carrosQueue.add("HRV");
      carrosQueue.add("Golf");
      carrosQueue.add("Polo");
      carrosQueue.add("Camaro");
      carrosQueue.add("Tiggo 3X");

      System.out.println("Topo da fila: " + carrosQueue.peek());
      System.out.println("Topo da fila e retira o elemento: " + carrosQueue.poll());

      if (carrosQueue.isEmpty()){
         System.out.println("Fila está vazia...");
      }else{
         System.out.println("Fila com elementos...");
      }

      System.out.println(carrosQueue.isEmpty()?"Fila vazia...":"Fila com elementos...");// -> Com condição ternária

      System.out.println(carrosQueue);
   }
}
