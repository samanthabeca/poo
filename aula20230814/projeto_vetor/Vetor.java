import java.util.Random;

public class Vetor {
    int[] vetor;

    void criar(int tamanho) {
        vetor = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++)
            vetor[i] = random.nextInt(100);
    }

    void imprimir() {
        for (int valor : vetor)
            System.out.print(valor + " ");
        System.out.println();
    }

    void inverter() {
        for (int i = vetor.length - 1; i >= 0; i--)
            System.out.print(vetor[i] + " ");
        System.out.println();
    }

    void ordenar() {
        int[] copiaVetor = vetor.clone();
        java.util.Arrays.sort(copiaVetor);
        for (int valor : copiaVetor)
            System.out.print(valor + " ");
        System.out.println();
    }
}