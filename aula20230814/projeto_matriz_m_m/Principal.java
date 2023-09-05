/*
 * Crie uma classe chamada Matriz. Essa classe deve possuir um método chamado void desenhar(int num).
 * Quando esse método for chamado este deve desenhar uma matriz de acordo com o número passado
 * (observe a imagem para esclarecimentos). Matriz MxM.
 * Crie uma classe chamada Auxilia. Essa classe deve ter um método int obterNumero(), cuja finalidade
 * é obter o número digitado pelo usuário.
 * Crie uma classe chamada Principal. No método main, crie um objeto da classe Auxilia e chame o
 * método obterNúmero e guarde em uma variável chamada entrada do tipo int.
 * Depois crie um objeto da classe Matriz e chame o método desenhar e passe para o método a variável entrada.
 * 
 * Versão: 2.0.0
 */


public class Principal {
    public static void main(String[] args) {
        Auxilia aux = new Auxilia();
        int entrada = aux.obterNumero();

        Matriz matriz = new Matriz();
        matriz.desenhar(entrada);
    }
}
