import java.util.ArrayList;

public class Relatorio {
    static double calcularPorcentagemEntre18e35(ArrayList<Pessoa> pessoas) {
        int count = 0;
        for (Pessoa pessoa : pessoas) {
            int idade = pessoa.calcularIdade(2023); // Supondo o ano atual como 2023
            if (idade >= 18 && idade <= 35) {
                count++;
            }
        }
        return (double) count / pessoas.size() * 100;
    }

    static int calcularQuantidadeEntrevistados(ArrayList<Pessoa> pessoas) {
        return pessoas.size();
    }

    static double calcularPorcentagemAcima40(ArrayList<Pessoa> pessoas) {
        int count = 0;
        for (Pessoa pessoa : pessoas) {
            int idade = pessoa.calcularIdade(2023);
            if (idade > 40) {
                count++;
            }
        }
        return (double) count / pessoas.size() * 100;
    }

    static void imprimirCondicaoImc(ArrayList<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            double imc = pessoa.calcularImc();
            if (imc < 18.5) {
                System.out.println(pessoa.nome + " está abaixo do peso.");
            } else if (imc < 24.9) {
                System.out.println(pessoa.nome + " está dentro do peso.");
            } else if (imc < 29.9) {
                System.out.println(pessoa.nome + " está com sobrepeso.");
            } else {
                System.out.println(pessoa.nome + " está obeso.");
            }
        }
    }

    static void imprimirInfoIdadePeso(ArrayList<Pessoa> pessoas, int anoAtual) {
        int totalIdades = 0;
        int countDentroDoPeso = 0;

        for (Pessoa pessoa : pessoas) {
            totalIdades += pessoa.calcularIdade(anoAtual);
            double imc = pessoa.calcularImc();
            if (imc >= 18.5 && imc < 24.9) {
                countDentroDoPeso++;
            }
        }

        double mediaIdades = (double) totalIdades / pessoas.size();
        System.out.println("Quantidade de pessoas dentro do peso: " + countDentroDoPeso);
        System.out.printf("Média das idades: %.2f%n", mediaIdades);
    }
}