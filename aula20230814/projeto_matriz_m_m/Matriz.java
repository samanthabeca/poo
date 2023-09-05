public class Matriz {
    void desenhar(int tamanho) {

        char[][] matriz = new char[tamanho][tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++)
                if ((i == 0 || i == tamanho -1 || j == 0 || j == tamanho -1) || i == tamanho / 2 || j == tamanho / 2)
                    matriz[i][j] = '*';
                else
                    matriz[i][j] = ' ';
        }

        for (int i = 0; i < tamanho; i++){
            for(int j=0; j < tamanho; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }
    }
}