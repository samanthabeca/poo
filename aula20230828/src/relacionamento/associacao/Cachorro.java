package relacionamento.associacao;

public class Cachorro {
    private String nome;
    private Pessoa p;

    public Cachorro(String nome, Pessoa p) {
        this.nome = nome;
        this.p = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", p=" + p.getNome() +
                '}';
    }
}
