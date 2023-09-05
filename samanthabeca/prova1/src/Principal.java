public class Principal {
    public static void main(String[] args) {
        Entrevistado vetor[];

        Auxiliar a1 = new Auxiliar();

        vetor = a1.criarEntrevistados();

        Relatorio r1 =  new Relatorio();

        r1.imprimirDadosEntrevistado(vetor);
        double media = r1.imprimirMediaidade(vetor);
        System.out.println(media);

    }
}