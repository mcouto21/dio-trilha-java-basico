import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
	/**
	 * @param args
	 * @throws Exception
	 * @throws InputMismatchException
	 * @throws ParametrosInvalidosException
	 * 
	 * Dados esperados:
	 * - Integer parametroUm
	 * - Integer parametroDois
	 * 
	 * @done Utilizar a classe Scanner
	 * @done Exibir mensagens pedindo os dados de entrada
	 * @done Armazenar os dados recebidos
	 * @done Chama função para fazer a contagem dos dois parâmetros informados (diferença entre eles)
	 * @done Criada classe ParametrosInvalidosException para capturar e tratar excessão
	 * @done Extra: Adicionado tratamento para InputMismatchException
	 * 
	 */
	public static void main(String[] args) throws InputMismatchException {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		try {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = scanner.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = scanner.nextInt();
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		} catch (InputMismatchException e_input) {
			System.out.println("Entrada de dados informada com tipo inválido!\nPor favor, informe os parâmetros com números.");
		} catch (Exception e) {
			System.out.println("Ocorreu algum erro inesperado com a aplicação!");
		}
		scanner.close();
	}
	/**
	 * 
	 * @param parametroUm
	 * @param parametroDois
	 * @throws ParametrosInvalidosException
	 * 
	 * @done Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
	 * @done Se não lançar excessão, cria uma variável contagem com a diferença entre os parâmetros 
	 * @done Realiza o for() para imprimir os números com base na variável contagem
	 * 
	 */
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm)
		{
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.printf("Imprimindo o número %d\n", i);
		}
	}
}