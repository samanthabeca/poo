/**
 * Faça uma calculadora utilizando os conceitos de POO.
 * 
 * Autora: Samantha Beca
 */

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        Scanner sc = new Scanner(System.in);
        char opc;
        double n1, n2;
        String menu = "======= CALCULADORA =======\n" + 
                        "1-Somar\n" + 
                        "2-Subtrair\n" +
                        "3-Multiplicar\n" + 
                        "4-Dividir\n" + 
                        "S-Sair\n" +
                        "===========================";

        char resp='S';
        while (resp == 'S'){
            System.out.println(menu);   
            System.out.print("Opção: ");
            opc = sc.next().charAt(0);
            if (opc == 'S' || opc == 's'){
                resp = 'N';
                continue;
            } else if (opc >= '1' && opc <= '4'){
                System.out.print("Digite o primeiro valor: ");
                n1 = sc.nextDouble();
                System.out.print("Digite o segundo valor: ");
                n2 = sc.nextDouble();
                c1.inicializar(n1, n2);
                switch(opc) {
                    case '1':       
                        System.out.printf("Soma: %.2f\n", c1.somar());
                        break;
                    case '2':
                        System.out.printf("Subtração: %.2f\n", c1.subtrair());
                        break;
                    case '3':
                        System.out.printf("Multiplicação: %.2f\n", c1.multiplicar());
                        break;
                    case '4':
                        System.out.printf("Divisão: %.2f\n", c1.dividir());
                        break;
                }
            } else {
                System.out.println("Opcao inválida");
                System.out.println("===========================");        
            }
        }
        sc.close();
        System.out.println("Aplicação encerrada.");
    }
}