package projeto_matriz;
public class MinhaMatriz {
    int m1[][];

    void criar (int l, int c){
        m1 = new int[l][c];
    }

    void preencher (int l, int c){
        int valor = 10;
        if (m1 != null){
            for (int i = 0; i < l; i++) //linhas
                for(int z = 0; z < c; z++) {//colunas
                    m1[i][z] = valor;
                    valor += 10;
                }//for
            //for    
        }//if
    }

    void imprimir (int l, int c){
        for (int i = 0; i < l; i++){
            for (int z = 0; z < c; z++){
                System.out.printf("[%d] [%d]: %d\n", i, z, m1[i][z]);
            }
            System.out.println();
        }
    }

    double calcularMedia(int l, int c) {
        //método que calcula a média dos valores da matriz

        int soma = 0;
        int totalElementos = l * c;

        if (m1 != null) {
            for (int i = 0; i < l; i++) {
                for (int z = 0; z < c; z++) {
                    soma += m1[i][z];
                }
            }
        }

        return (double) soma / totalElementos;
    }

    int[] encontrarIndice(int l, int c) {
        //método que encontra o índice do maior valor da matriz

        int maiorValor = Integer.MIN_VALUE;
        int[] indiceMaiorValor = {-1, -1};

        if (m1 != null) {
            for (int i = 0; i < l; i++) {
                for (int z = 0; z < c; z++) {
                    if (m1[i][z] > maiorValor) {
                        maiorValor = m1[i][z];
                        indiceMaiorValor[0] = i;
                        indiceMaiorValor[1] = z;
                    }
                }
            }
        }
        return indiceMaiorValor;
    }

    int calcularSomaElementos(int l, int c) {
        //método que soma os elementos onde i == c (a linha for igual à coluna)

        int soma = 0;
        if (m1 != null && l == c) {
            for (int i = 0; i < l; i++) {
                soma += m1[i][i];
            }
        }
        return soma;
    }


}//class
