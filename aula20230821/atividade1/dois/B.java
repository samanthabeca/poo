package poo.aula20230821.atividade1.dois;

public class B {
    private static int cont;

    public B(){
        cont++;
    }//construtor

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        B.cont = cont;
    }
}
