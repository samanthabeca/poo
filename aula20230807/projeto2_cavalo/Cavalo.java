public class Cavalo {
    String nome, cor, raca;
    double peso, valor;
    int idade;

    void inicializar (String n, int i, double p, String c){
        nome = n;
        idade = i;
        peso = p;
        cor = c;
    }

    void descobrirRaca(){
        if (cor == "marrom")
            raca = "manga-larga";
        else if (cor == "preta")
            raca =  "arabe";
        else if (cor == "azulao")
            raca =  "azulao";
        else
            raca =  "indefinido";
    }

    void valorRaca(){
        if (raca == "manga-larga")
            valor = 18000.00;
        else if (raca == "arabe")
            valor = 25000.00;
        else if (raca == "azulao")
            valor = 1000000.00;
        else
            valor = 5000.00;
    }

    void mostrarEstado(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Raça: " + raca);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: " + valor);
    }
}
