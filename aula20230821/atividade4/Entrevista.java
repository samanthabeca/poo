/*
 * -crie um classe chamada pessoa que tenha nome, ano de nascimento, peso, altura. Essa classe teve ter um método que calcula a idade. E outro método que calcula o IMC.
 * -crie uma classe chamada entrevista que possui um método obterDados.
 * -crie uma classe chamada relatório que tem um método para calcular a porcentagem de pessoas com idade entre 18 a 35 anos. Outro método para calcular a quantidade de pessoas entrevistadas e outro método para calcular a porcentagem de pessoas  acima de 40 anos. Adicione um método que recebe vetor de pessoas, cujo objetivo é imprimir a condição de cada pessoa de acordo com o índice IMC. Adicione outro método que recebe o vetor de pessoas e o ano atual e imprima a quantidade de pessoas com o resultado "dentro do peso" e a média das idades.
 * -crie uma classe chamada principal e no método main teste seu projeto, imprimindo todos os métodos da classe relatório.
 * 
 * Versão: 1.0
 */

import java.util.Scanner;

public class Entrevista {
    static Pessoa obterDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Ano de Nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        return new Pessoa(nome, anoNascimento, peso, altura);
    }
}