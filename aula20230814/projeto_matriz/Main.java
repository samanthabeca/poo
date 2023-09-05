package projeto_matriz;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){

        MinhaMatriz obj1 = new MinhaMatriz();
        Scanner sc = new Scanner(System.in);
        int linha = sc.nextInt();

        int coluna = sc.nextInt();
        obj1.criar(linha,coluna);
        obj1.preencher(linha, coluna);
        obj1.imprimir(linha, coluna);

        double media = obj1.calcularMedia(linha, coluna);
        System.out.println("Média dos valores da matriz: " + media);

        int[] indiceMaiorValor = obj1.encontrarIndice(linha, coluna);
        if (indiceMaiorValor[0] != -1) {
            System.out.println("Índice do maior valor da matriz: [" + indiceMaiorValor[0] + "] [" + indiceMaiorValor[1] + "]");
        } else {
            System.out.println("Sem valores para mostrar");
        }

        if (linha == coluna) {
            int somaDiagonal = obj1.calcularSomaElementos(linha, coluna);
            System.out.println("Soma dos elementos onde l == c: " + somaDiagonal);
        } else {
            System.out.println("A matriz não é quadrada.");
        }
        sc.close();

    }
}
