package ContaBanco;
import java.util.Scanner;
public class ContaTerminal {
	public static void main(String[] args) {
		//Declaração do Scanner
		Scanner sc = new Scanner(System.in);
		//Declaração das variáveis
		int numero;
		String agencia, nomeCliente;
		double saldo;
		//Iniciando as variáveis
		System.out.println("Por favor, digite seu nome: ");
		nomeCliente = sc.nextLine();
		System.out.println("Digite o número da sua agência: ");
		agencia = sc.nextLine();
		System.out.println("Digite o número da sua conta: ");
		numero = sc.nextInt();
		System.out.println("Digite o valor que você quer adicionar ao seu saldo: ");
		saldo = sc.nextDouble();
		//Retorno das variáveis
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo R$"+saldo+" já está disponível para saque");
	}
}
