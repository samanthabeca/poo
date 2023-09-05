/*
 * Crie uma classe chamada Pirâmide. Essa classe deve ter um método chamado desenhar que recebe
 *  um valor inteiro com parâmetro. Se o valor passado for 5, seu método deve desenhar
    *
    **
    ***
    ****
    *****
 * Para testar o projeto, crie uma classe Principal com o método main. No método main, crie um objeto
 * da classe Pirâmide e invoque o método.
 * 
 * Autora: Samantha Beca
 * Versão: 1.0.0
 */

import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);   
      Piramide piramide = new Piramide();
      int valor;

      System.out.print("Digite um número inteiro: ");
      valor = sc.nextInt();
      int linhas = valor; // Você pode alterar esse valor para testar com diferentes números de linhas
      piramide.desenhar(linhas);

      sc.close();
   }  
}
