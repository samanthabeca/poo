package relacionamento.associacao;

import java.util.Arrays;

public class Pessoa {
    private String nome;
    private int ano_nascimento;
    private Cachorro[] c;

    public Pessoa(String nome, int ano_nascimento) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.c = new Cachorro[3];
    }

    public void addCachorro(int pos, Cachorro c){
        this.c[pos] = c;
    }

    public void remCachorro(int pos){
        this.c[pos] = null;
    }

    public String getNome() {
        return nome;
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    public void setC(Cachorro[] c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", ano_nascimento=" + ano_nascimento +
                ", c=" + Arrays.toString(c) +
                '}';
    }
}
