/*
 * Crie um classe chamada Vetor. Essa classe deve ter uma variável de instância um vetor de inteiros.
 * Essa classe deve ter um método chamado criar que receba um valor como parâmetro,
 * esse valor vai ser usado para instanciar o vetor e preenche-lo com valores aleatórios (use a classe Random) e
 * imprima os dados. Crie outro método chamado inverter cuja objetivo é imprimir o vetor de trás para frente.
 * Crie outro método chamado ordenar cuja objetivo é imprimir o vetor com os dados em ordem crescente.
 * Versão: 1.0.0
 */

public class Main {
    public static void main(String[] args) {
        Vetor obj1 = new Vetor();

        obj1.criar(5); //Método cria o vetor conforme o tamanho especificado aqui

        System.out.println("Vetor preenchido:");
        obj1.imprimir();

        System.out.println("Vetor invertido:");
        obj1.inverter();

        System.out.println("Vetor ordenado:");
        obj1.ordenar();
    }
}
