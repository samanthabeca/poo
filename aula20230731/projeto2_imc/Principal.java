/**
 * Faça um aplicativo que realize o cálculo do IMC. O usuário deve informar nome, altura e peso.
 * O app deve imprimir o valor do IMC e em qual a classificação. 
 * Use o link como referência: https://brasilescola.uol.com.br/educacao-fisica/Indice-massa-corporal-imc.htm
 * 
 * Magreza, menor ou igual a 18,5
 * Peso normal, entre 18,6 e 24,90
 * Sobrepeso, entre 25 e 29,90
 * Obesidade de grau I, entre 30 e 34,9
 * Obesidade de grau II, entre 35 e 39,9
 * Obesidade de grau III, maior ou igual a 40  
 * 
 * Autora: Samantha Beca
 * Versão: 2.0.0
 */


import java.util.Scanner;

class Principal {

    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        String nome;
        double peso, altura, res;
        IMC p1 =  new IMC();

        System.out.print("Informe o nome: ");
        nome = rec.nextLine();

        System.out.print("Informe o peso (em kg): ");
        peso = rec.nextDouble();

        System.out.print("Informe a altura (em cm): ");
        altura = rec.nextDouble();

        p1.inicializar(nome, peso, altura);
        res = p1.calcular(); 
        p1.classificar(res);
        rec.close();
    }
}
