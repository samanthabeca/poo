class IMC {
	String nome;
	double altura, peso;

	void inicializar(String n, double a, double p){
		nome = n;
		altura = p;
		peso = a;
}
	double calcular(){
		double c_altura = altura / 100; //convertendo altura de cm para metros;
		double res = peso / (c_altura * c_altura);
        System.out.println("=========== IMC ==========");
        System.out.printf("O IMC de " + nome + " é: %.1f\n", res);
    	return res; 
    }
	

	void classificar(double res){
		System.out.println("\n===== Classificação ======");
		if(res < 18.6)

			System.out.println("Magreza - menor ou igual a 18,5"); 

		else if (res >= 18.6 && res <= 24.9)

			System.out.println("Peso Normal - entre 18,6 e 24,9");

		else if (res > 24.9 && res <= 29.9)

			System.out.println("Sobrepeso - entre 25 e 29,90");

		else if (res > 29.9 && res <= 34.9)

			System.out.println("Obesidade de grau I - entre 30 e 34,9");

		else if (res > 34.9 && res <= 39.9)

			System.out.println("Obesidade de grau II - entre 35 e 39,9");

		else

			System.out.println("Obesidade de grau III - maior ou igual a 40");
	}
}
