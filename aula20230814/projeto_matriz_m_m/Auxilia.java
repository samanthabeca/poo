import java.util.Scanner;

public class Auxilia {
    int obterNumero() {
        char controlador = 'S';
        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        while (controlador == 'S'){
            System.out.print("Digite um número ímpar: ");
            numero = scanner.nextInt();
            if (numero % 2 != 0) { // verifica se o número é ímpar
                controlador = 'N';    
            }  
        }
        scanner.close();
        return numero;   
    }
}
