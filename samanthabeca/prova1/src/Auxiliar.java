public class Auxiliar {

    public Entrevistado[] criarEntrevistados() {
        Entrevistado[] vetorEntrevistados = new Entrevistado[3];

        Entrevistado p1 = new Entrevistado("Samantha", 30);
        p1.capturarRespostas('a', 'a', 'a', 'b', 'c');

        Entrevistado p2 = new Entrevistado("Márcia", 40);
        p2.capturarRespostas('a', 'b', 'b', 'b', 'c');

        Entrevistado p3 = new Entrevistado("Laura", 50);
        p3.capturarRespostas('a', 'b', 'c', 'c', 'c');

        vetorEntrevistados[0] = p1;
        vetorEntrevistados[1] = p2;
        vetorEntrevistados[2] = p3;

        return vetorEntrevistados;
    }
}