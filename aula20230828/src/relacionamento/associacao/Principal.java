package relacionamento.associacao;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 1984);
        Cachorro c1 = new Cachorro("Valter",p1);
        Cachorro c2 = new Cachorro("Totó",p1);
        Cachorro c3 = new Cachorro("Mimi",p1);


        p1.addCachorro(0,c1);
        p1.addCachorro(1,c2);
        p1.addCachorro(2,c3);

        System.out.println(p1);

    }
}
