public class Calculadora {

    double n1, n2;

    void inicializar (double num1, double num2){
        n1 = num1;
        n2 = num2;
    }

    double somar(){
        return n1 + n2;
    }

    double subtrair(){
        return n1 - n2;
    }

    double multiplicar(){
        return n1 * n2; 
    }
    
    double dividir(){
        return n1 / n2;
    }

}//class