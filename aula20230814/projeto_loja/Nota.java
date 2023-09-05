public class Nota {
    int num_item, qtde_comprada;
    double valor_unit;
    String descricao_item;

    void inicializar (int num_i, int qtde, double valor, String descricao){
        num_item = num_i;
        qtde_comprada = qtde;
        valor_unit = valor;
        descricao_item = descricao;
    }

    double obterValorNota (){
        double res;

        res = qtde_comprada * valor_unit;
        return res;
    }

    void imprimirDadosNota(){
        System.out.println("Item: " + num_item);
        System.out.println("Descricao: " + descricao_item);
        System.out.println("Qtde comprada: " + qtde_comprada);
        System.out.println("Valor unitário: " + valor_unit);
    }
}
