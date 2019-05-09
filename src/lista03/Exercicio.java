/**
 * Classe para executar os exercicios da lista 01.
 * 
 * @author Jean Ribeiro
 * @version 17/03/19
 */

package lista03;

public class Exercicio {

	/**
	 * Representa o primeiro fator constante da equação de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_1 = 62.1;
	/**
	 * Representa o segundo fator constante da equação de peso ideal para mulheres.
	 */
	public static final double FATOR_FEMININO_2 = 44.7;
	/**
	 * Representa o primeiro fator constante da equação de peso ideal para homens.
	 */
	public static final double FATOR_MASCULIO_1 = 72.7;
	/**
	 * Representa o segundo fator constante da equação de peso ideal para homens.
	 */
	public static final double FATOR_MASCULIO_2 = 58;
	/**
	 * Representa a forma de pagamento à vista em dinheiro ou cheque, recebe 10% de
	 * desconto .
	 */
	public static final int A_VISTA_OU_DINHEIRO_OU_CHEQUE = 1;
	/**
	 * Representa a forma de pagamento à vista no cartão de crédito, recebe 5% de
	 * desconto
	 * 
	 */
	public static final int A_VISTA_NO_CARTAO_DE_CREDITO = 2;
	/**
	 * Representa a forma de pagamento em 2 vezes, preço normal da etiqueta sem
	 * juros.
	 */
	public static final int DUAS_VEZES = 3;
	/**
	 * Representa a forma de pagamento em 3 vezes, preço normal da etiqueta mais
	 * juros de 10%.
	 */
	public static final int TRES_VEZES = 4;

	/**
	 * Calculo para calcular o peso ideal de uma pessoa.
	 * 
	 * @param sexo   determinar a conta a ser utilizada.
	 * @param altura pertecente ao calculo a ser executado.
	 * @return retorna o resultado
	 */
	public static double calcularPesoIdeal(char sexo, double altura) {

		// if(sexo.equalsIgnoreCase("F")) para verificar se uma string é igual a um
		// valor digitado maiusculo ou menusculo.
		if (sexo == 'F' || sexo == 'f') {
			return (FATOR_FEMININO_1 * altura) - FATOR_FEMININO_2;
		} else {
			return (FATOR_MASCULIO_1 * altura) - FATOR_MASCULIO_2;
		}

	}

	/**
	 * Criado para efetuar o carlulo a ser pago dependendo da forma de pagamento e
	 * valor do produto.
	 * 
	 * @param valor utilizado para o calculo.
	 */
	public static double calcularPagamento(double valor, int menu) {

		double resultado = 0;

		switch (menu) {

		case A_VISTA_OU_DINHEIRO_OU_CHEQUE:
			resultado = valor * 0.90;
			break;

		case A_VISTA_NO_CARTAO_DE_CREDITO:
			resultado = valor * 0.95;
			break;

		case DUAS_VEZES:
			resultado = valor;
			break;

		case TRES_VEZES:
			resultado = valor * 1.1;
			break;

		}

		return resultado;
	}

	/**
	 * Criado para fazer operações simples de uma calculadora +,-,/ e *
	 * 
	 * @param numero1  primeiro numero informado para operação
	 * @param operacao operador desejado na operação.
	 * @param numero2  segundo numero informado para operação
	 * @return retorna o resultado
	 */
	public static double calcularCalculadora(double numero1, char operacao, double numero2) {

		double total = 0;
		switch (operacao) {
		case '+':
			total = numero1 + numero2;
			break;

		case '-':
			total = numero1 - numero2;
			break;

		case '*':
			total = numero1 * numero2;
			break;

		case '/':
			if (numero2 == 0) {
				System.out.println("Não é Possivel dividir por Zero");
				Principal.main(null);
			} else {
				total = numero1 / numero2;
			}
			break;

		}

		return total;
	}

	/**
	 * Calcula uma equação do 2º grau pela formula de baskara. delta = (b * b) - (4
	 * * a * c) e x1 = (-b + Math.sqrt(delta)) / 2 * a ou x1 = (-b -
	 * Math.sqrt(delta)) / 2 * a
	 * 
	 * @param a dados para executar a formula.
	 * @param b dados para executar a formula.
	 * @param c dados para executar a formula.
	 * @return retorna o resultado.
	 */
//	public static String calcularBaskara(double a, double b, double c) {
//
//		String retorno = null;
//		double delta = 0;
//		double x1 = 0;
//		double x2 = 0;
//
//		if (a == 0) {
//			System.out.println("Estes valores não formam uma equação de segundo grau ");
//			Principal.main(null);
//		} else {
//			delta = (b * b) - (4 * a * c);
//			if (delta < 0) {
//				retorno = ("Não existe raiz real");
//			} else {
//				if (delta > 0) {
//
//					x1 = (-b + Math.sqrt(delta)) / 2 * a;
//					x2 = (-b - Math.sqrt(delta)) / 2 * a;
//					retorno = ("As duas Raizes são diferentes x1= " + x1 + " ,x2= " + x2);
//				} else {
//					x1 = (-b + Math.sqrt(delta)) / 2 * a;
//					retorno = ("As duas Raizes são iguai x1= " + x1 + " ,x2= " + x1);
//				}
//			}
//		}
//
//		return retorno;
//	}

	/**
	 * Calcula o fatoramento de um numero indicado
	 * 
	 * @param numero a ser fatorado
	 * @return retorna o resultado.
	 */
	public static int calcularFatorial(int numero) {
		int resultado = 1;
		int a = 1;

		for (int i = 0; i < numero; i++) {
			resultado = a * resultado;
			a = a + 1;
		}
		return resultado;
	}

	/**
	 * Criado para identificar se o numero informado é um numero perfeito
	 * 
	 * @param numero informado para verificação.
	 * @return retorno se é ou não um numero perfeito.
	 */
	public static String calcularNumeroPerfeito(int numero) {

		int resultado = 0;
		int[] perfeito = new int[numero];
		int x = 0;

		for (int i = 2; i < numero + 1; i++) {
			if (numero % i == 0) {

				perfeito[x] = numero / i;
				x = x + 1;

			}
		}

		for (int i = 0; i < x; i++) {
			resultado = resultado + perfeito[i];
		}

		if (resultado == numero) {
			return ("Numero perfeito");
		} else {
			return ("Não é um numero perfeiro");
		}

	}

	/**
	 * Calcula uma equação do 2º grau pela formula de baskara. delta = (b * b) - (4
	 * * a * c) e x1 = (-b + Math.sqrt(delta)) / 2 * a ou x1 = (-b -
	 * Math.sqrt(delta)) / 2 * a
	 * 
	 * @param a dados para executar a formula.
	 * @param b dados para executar a formula.
	 * @param c dados para executar a formula.
	 * @return retorna o resultado.
	 */
	public static double[] calcularBaskara(double a, double b, double c) {

		double delta = (b * b) - (4 * a * c);

		if (delta < 0) {
			double[] raizes = {};
			return raizes;
		}

		if (delta == 0) {

			double raiz = (-b + Math.sqrt(delta)) / 2 * a;
			double[] raizes = { raiz };
			return raizes;
		}
		double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
		double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
		double[] raizes = { raiz1, raiz2 };
		return raizes;

	}

	/**
	 * Faz a identificação de ujm triangulo dado tres pontos no plano
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @return
	 */
	public static String identificarTriangulo(double x1, double y1, double x2, double y2, double x3, double y3) {

		String resultado = "";

		double p12 = calcularDistanciaEntrePontos(x1, y1, x2, y2);
		double p23 = calcularDistanciaEntrePontos(x2, y2, x3, y3);
		double p13 = calcularDistanciaEntrePontos(x1, y1, x3, y3);

		boolean condicao1 = (p12 + p23) > p13;
		boolean condicao2 = (p12 + p13) > p23;
		boolean condicao3 = (p13 + p23) > p12;

		if (condicao1 && condicao2 && condicao3) {
			// é um triangulo.verificar de qual tipo.
			// verificação de equilatero.
			if (p12 == p23 && p12 == p13) {
				resultado = "Equilátero";
			} else if (p12 != p23 && p12 != p13 && p23 != p13) {
				resultado = "Escaleno";
			} else {
				resultado = "Isóceles";
			}

		} else {
			resultado = "Não forma Triangulo";
		}

		return resultado;
	}

	/**
	 * Realiza o calculo de distancia entre dois pontos conforme pitagoras.
	 * 
	 * @param x1 cordenada x do ponto 1
	 * @param y1 cordenada y do ponto 1
	 * @param x2 cordenada x do ponto 2
	 * @param y2 cordenada y do ponto 2
	 * @return a distancia entre os pontos.
	 */
	public static double calcularDistanciaEntrePontos(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	/**
	 * Realiza uma sequencia de fibonacci com a quantidade de elementos solicitados.
	 * 
	 * @param numero a quantidade de elementos da serie.
	 * @return retorna a serie de fibonacci.
	 */
	public static int[] criarSerieFibonacci(int numero) {

		int[] elemento = new int[numero];

		for (int i = 0; i < numero; i++) {
			if (i == 0 || i == 1) {
				elemento[i] = 1;
			} else {
				elemento[i] = elemento[i - 1] + elemento[i - 2];
			}
		}

		return elemento;
	}

	/**
	 * Realiza o colculo para informe se o numero informado é um numero primo ou
	 * não.
	 * 
	 * @param numero informado pelo usuario.
	 * @return retorna se é um numero primo ou não.
	 */
	public static String identificarNumeroPrimo(int numero) {

		boolean primo = true;

		String resultado;

		if (numero <= 1) {

			primo = false;

		} else {
			for (int i = 2; i < numero; i++) {

				if (numero % i == 0) {

					primo = false;
					break;
				}

			}
		}

		if (primo) {
			resultado = "O numero informado é um numero primo.";
		} else {
			resultado = "O numero informado não é um numero primo.";
		}

		return resultado;
	}

	/**
	 * cria a sequencia de numeros.
	 * 
	 * @param numero numero de numeros da sequencia.
	 * @return retorna a sequencia.
	 */
	public static int[] criarSequencia1(int numero) {

		int resultados[] = new int[0];

		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < i + 1; j++) {
				int sequencia = i + 1;
				resultados = adcionarVetor(sequencia, resultados);
			}

		}

		return resultados;

	}

	/**
	 * Faz com que o vertor cresça adcionando um numero nele
	 * 
	 * @param k          numero a ser adicionado
	 * @param resultados vetor que cresce
	 * @return retorna o vetor novo.
	 */
	public static int[] adcionarVetor(int sequencia, int[] resultados) {

		int[] aux = new int[resultados.length + 1];
		// for para a copia
		for (int i = 0; i < resultados.length; i++) {
			aux[i] = resultados[i];
		}
		// adiciona o avaliado
		aux[aux.length - 1] = sequencia;

		return aux;
	}

	/**
	 * cria a sequencia de numeros.
	 * 
	 * @param numero numero de numeros da sequencia.
	 * @return retorna a sequencia.
	 */
	public static int[] criarSequencia2(int numero) {

		int resultados[] = new int[0];

		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < i + 1; j++) {
				resultados = adcionarVetor1(j, resultados);
			}

		}

		return resultados;

	}
	
	/**
	 * Faz com que o vertor cresça adcionando um numero nele
	 * 
	 * @param k          numero a ser adicionado
	 * @param resultados vetor que cresce
	 * @return retorna o vetor novo.
	 */
	public static int[] adcionarVetor1(int sequencia, int[] resultados) {

		int[] aux = new int[resultados.length + 1];
		// for para a copia
		for (int i = 0; i < resultados.length; i++) {
			
			aux[i] = resultados[i];
		}
		// adiciona o avaliado
		aux[aux.length - 1] = sequencia+1;

		return aux;
	}
}
