public class Pessoa {
    String nome;
    int anoNascimento;
    double peso;
    double altura;

    Pessoa(String nome, int anoNascimento, double peso, double altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.altura = altura;
    }

    int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }

    double calcularImc() {
        return peso / (altura * altura);
    }
}