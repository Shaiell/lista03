
/**
 * Classe criada para resolução da lista 03 de exercicios.
 * @author Jean Ribeiro
 * @version 17/03/2019
 */

package lista03;

public class Principal {

	/**
	 * Função para inicialização dos exercicios.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String[] exercicio = { "Peso Ideal", "Baskara", "Pagamento", "Calculadora", "Fatorial", "Numero Perfeito",
				"Triangulo", "Fibonacci", "Numero Primo", "Sequencia 1", "Sequencia 2"};

		boolean repitir = true;

		do {
			int menu = Console.mostrarMenu(exercicio, "lista03", null);
			switch (menu) {

			case 1:
				calcularPesoIdeal();
				break;

			case 2:
				calcularBaskara();
				break;

			case 3:
				calcularPagamento();
				break;

			case 4:
				calcularCalculadora();
				break;

			case 5:
				calcularFatorial();
				break;

			case 6:
				calcularNumeroPerfeito();
				break;

			case 7:
				identificarTriangulo();
				break;

			case 8:
				criarSerieFibonacci();
				break;
				
			case 9:
				identificarNumeroPrimo();
				break;
				
			case 10 :
				criarSequencia1();
				break;
				
			case 11 :
				criarSequencia2();
				break;

			case -1:
				System.out.println("Saindo...");
				repitir = false;
				break;
			}
		} while (repitir == true);

	}

	/**
	 * Criado para calcular o peso ideal de uma pessoa
	 * 
	 */
	private static void calcularPesoIdeal() {
		char sexo = 'a';
		sexo = Console.recuperaCaracter("Informe seu sexo: F para feminino ou M para masculino");
		double altura = Console.recuperaDecimal("Informe a sua altura: ");
		double pesoIdeal = Exercicio.calcularPesoIdeal(sexo, altura);

		System.out.println("O sexo informado é " + sexo + ", a altura informada é " + altura
				+ " mtrs, e o seu peso ideal é " + pesoIdeal + "\n");

	}

	/**
	 * Criado para efetuar o calculo de equações de 2º grau usando a formula de
	 * baskara. ax² + bx + c = 0
	 * 
	 */
	private static void calcularBaskara() {
		double a = Console.recuperaDecimal("Informe o valor de A: ");
		double b = Console.recuperaDecimal("Informe o valor de B: ");
		double c = Console.recuperaDecimal("Informe o valor de C: ");

		double[] resultado = Exercicio.calcularBaskara(a, b, c);

		if (resultado.length == 0) {
			System.out.println("Não é raizes reais para os valores informados");
		} else if (resultado.length == 1) {
			System.out.println("Existe uma raiz real" + resultado[0]);
		} else {
			System.out.println("A raiz 1 é: " + resultado[0]);
			System.out.println("A raiz 2 é: " + resultado[1]);
		}
	}

	/**
	 * Criado para informar o valor de pagamento para a opção desejada
	 * 
	 */
	private static void calcularPagamento() {

		double valor = Console.recuperaDecimal("Informe o Valor da compra: ");
		String[] opcao = { "à vista em dinheiro ou cheque", "à vista no cartão de crédito", "2 vezes", "3 vezes" };
		int menu = Console.mostrarMenu(opcao, "Forma de pagamento", null);
		double resultado = Exercicio.calcularPagamento(valor, menu);

		System.out.printf("%.2f\n", resultado);

	}

	/**
	 * Criado para efetuar contas simpes +,-,/ e *.
	 */
	private static void calcularCalculadora() {
		double numero1 = Console.recuperaDecimal("Informe o primeiro numero da operação: ");
		char operacao = Console.recuperaCaracter("Informe a operação desejada: ");
		double numero2 = Console.recuperaDecimal("Informe o segundo numero da operação: ");

		double resultado = Exercicio.calcularCalculadora(numero1, operacao, numero2);

		System.out.printf("%.2f\n", resultado);
	}

	/**
	 * Criado para efetuar o fatorial de um numero informado.
	 * 
	 */
	private static void calcularFatorial() {
		int numero = Console.recuperaInteiro("Informe o numero a ser fatorado: ");

		int resultado = Exercicio.calcularFatorial(numero);

		System.out.println(resultado);
	}

	/**
	 * Criado para verificar se o numero é perfeito.
	 * 
	 */
	private static void calcularNumeroPerfeito() {
		int numero = Console.recuperaInteiro("Informe o numero : ");

		String resultado = Exercicio.calcularNumeroPerfeito(numero);
		System.out.println(resultado);
	}

	/**
	 * identifica se o triangulo é...
	 * 
	 */
	private static void identificarTriangulo() {
		double x1 = Console.recuperaDecimal("Informe x1");
		double y1 = Console.recuperaDecimal("Informe y1");
		double x2 = Console.recuperaDecimal("Informe x2");
		double y2 = Console.recuperaDecimal("Informe y2");
		double x3 = Console.recuperaDecimal("Informe x3");
		double y3 = Console.recuperaDecimal("Informe y3");

		String resultado = Exercicio.identificarTriangulo(x1, y1, x2, y2, x3, y3);
		System.out.println("Verificação: " + resultado);
	}

	/**
	 * Cria uma sequencia de fibonacci.
	 * 
	 */
	private static void criarSerieFibonacci() {
		int numero = Console.recuperaInteiro("Informe a quantidade de numero da sequencia : ");

		int[] resultado = Exercicio.criarSerieFibonacci(numero);

		for (int i = 0; i < numero; i++) {
			System.out.println(resultado[i]);
		}

	}
	
	/**
	 * Identifica se um numero é primo ou não.
	 * 
	 */
	private static void identificarNumeroPrimo() {
		int numero = Console.recuperaInteiro("Informe o numero a ser verificado: ");
		
		String resultado = Exercicio.identificarNumeroPrimo(numero);
		
		System.out.println(resultado +"\n");
	}
	
	
	/**
	 * Cria uma sequencia de numeros crescentes e repitidos por susas quantidades a partir do numero informado.
	 * 
	 */
	private static void criarSequencia1() {
		int numero =Console.recuperaInteiro("informe o numero desejado");
		
		int [] resultado = Exercicio.criarSequencia1(numero);
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}
	
	/**
	 * Cria uma sequencia de numeros crescentes se subsequentes a partir do numero informado.
	 * 
	 */
	private static void criarSequencia2() {
		int numero =Console.recuperaInteiro("informe o numero desejado");
		
		int [] resultado = Exercicio.criarSequencia2(numero);
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
		}
	}
}
