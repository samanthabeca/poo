/*
 * (EXERCÍCIO ADAPTADO)
 * Crie uma classe chamada Nota que possa ser utilizado por uma loja de suprimentos
 * de informática para representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes
 * informações como atributos:
 * • o número do item faturado,
 * • a descrição do item,
 * • a quantidade comprada do item,
 * • o preço unitário do item.
 * Crie um método chamado inicializar para inicializar as variáveis de instância. Além disso, forneça um método chamado
 * obterValorNota que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item) e
 * depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as capacidades da
 * classe Nota.
 * FONTE: DEITEL, H.; DEITEL, P. Java como programar. 6 ed. São Paulo: Pearson, 2005.
 * VALE ponto.
 * 
 * Autora: Samantha Beca
 * Versão: 1.0.0
 */

public class Teste {
    public static void main(String[] args) {
        Nota obj1 = new Nota();

        obj1.inicializar(100, 50, 10.0, "Sucrilhos");
        obj1.imprimirDadosNota();
        System.out.println("Total faturado: " + obj1.obterValorNota());

    }
}
