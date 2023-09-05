public class Relatorio {

    void imprimirDadosEntrevistado(Entrevistado vetEntrevistados[]){

        for(Entrevistado vetor : vetEntrevistados){
            System.out.println(vetor);
        }
    }

    double imprimirMediaidade(Entrevistado vetEntrevistados[]){
        double mediaIdade = 0, soma = 0;

        for (int i = 0; i < vetEntrevistados.length; i++){
            soma += vetEntrevistados[i].getIdade();
        }

        mediaIdade = soma/3;
        return mediaIdade;
    }

}
