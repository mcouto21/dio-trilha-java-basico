import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	/**
	 * @param args
	 * @throws Exception
	 * @throws InputMismatchException
	 * 
	 * Dados esperados:
	 * - String  Nome Cliente
	 * - Integer Número Agência
	 * - Integer Número Conta
	 * - Double  Saldo (999.99)
	 * 
	 * @implNote Scanner(System.in).next() quebra em whitespace. Para evitar isso, usa-se nextLine()
	 * 
	 * @done Utilizar a classe Scanner
	 * @done Exibir mensagens pedindo os dados de entrada
	 * @done Armazenar os dadis recebidos
	 * @done Exibir uma mensagem com todos os dados informados
	 * @done Extra: Adicionado tratamento para InputMismatchException 
	 * @done Extra: Adicionada tratativa sobre nomeCliente, usando função do Scanner para aceitar entrada de nomes que contenham espaço
	 * @done Extra: Adicionado tratativa sobre nomeCliente, validando se a entrada é vazia, usando loop do/while para garantir ue alguma informação seja informada
	 * 
	 */
	public static void main(String[] args) throws Exception {
		String mensagem = "Olá, %s, obrigado por criar uma conta em nosso banco, sua Agência é %d, conta %d e seu saldo %.2f já está disponível para saque";
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		try {
			String nomeCliente = "";
			do {
				System.out.println("Por favor, digite o seu Nome.");
				nomeCliente = scanner.nextLine().trim();
			} while(nomeCliente == "");
			System.out.println("Por favor, digite o número da Agência.");
			Integer agenciaCliente = scanner.nextInt();
			System.out.println("Por favor, digite o número da Conta.");
			Integer contaCliente = scanner.nextInt();
			System.out.println("Por favor, digite o seu Saldo.");
			Double saldoCliente = scanner.nextDouble();
			System.out.printf(mensagem, nomeCliente, agenciaCliente, contaCliente, saldoCliente);
		} catch (InputMismatchException e_input) {
			// System.out.println("Entrada de dados informada com tipo inválido!");
			System.out.println("Entrada de dados informada com tipo inválido!\nPor favor, informe a Agência e Conta com números e o Saldo com ponto como separador de decimal.");
		} catch (Exception e) {
			System.out.println("Ocorreu algum erro inesperado com a aplicação!");
		}
		scanner.close();
	}
}