import java.util.Arrays;

public class Entrevistado {
    private String nome;
    private int idade;
    private char respostas[];

    public Entrevistado(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Entrevistado() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char[] getRespostas() {
        return respostas;
    }

    public void setRespostas(char[] respostas) {
        this.respostas = respostas;
    }

    @Override
    public String toString() {
        return "Entrevistado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", respostas=" + Arrays.toString(respostas) +
                '}';
    }

    public void capturarRespostas(char um, char dois, char tres, char quatro, char cinco){
        respostas = new char[5];

        respostas[0] = um;
        respostas[1] = dois;
        respostas[2] = tres;
        respostas[3] = quatro;
        respostas[4] = cinco;
    }

    public double calcularValor(){ //Método para computar a pontuação da entrevista
        double valor = 0;
        int contA = 0, contB = 0, contC = 0;

        for (int i = 0; i < 5; i++)
            if (respostas[i] == 'a')
                contA++;
            else if (respostas[i] == 'b')
                contB++;
            else
                contC++;
        valor = (contA * 10) + (contB * 15) + (contC * 20);
        return valor;
    }

    public int contarA(){
        int respostasA = 0;

        for (int i = 0; i < 5; i ++)
            if (respostas[i] == 'a')
                respostasA++;
        return respostasA;
    }
}
