import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) { // Entrevistar 3 pessoas para o exemplo
            Pessoa pessoa = Entrevista.obterDados();
            pessoas.add(pessoa);
        }
        System.out.println("===================");
        System.out.printf("Porcentagem de pessoas entre 18 e 35 anos: %.2f%%%n", Relatorio.calcularPorcentagemEntre18e35(pessoas));
        System.out.println("Quantidade de pessoas entrevistadas: " + Relatorio.calcularQuantidadeEntrevistados(pessoas));
        System.out.printf("Porcentagem de pessoas acima de 40 anos: %.2f%%%n", Relatorio.calcularPorcentagemAcima40(pessoas));
        System.out.println("===================");
        System.out.println("Condição IMC:");
        Relatorio.imprimirCondicaoImc(pessoas);
        System.out.println("===================");
        int anoAtual = 2023; // Atualize para o ano atual
        Relatorio.imprimirInfoIdadePeso(pessoas, anoAtual);
        scanner.close();
    }    
}






