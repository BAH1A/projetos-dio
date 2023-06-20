import java.util.Locale;
import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
	
		try {
			contar(parametroUm, parametroDois);
		}
		catch (ParametrosInvalidosException exception) {
			 System.out.println("O segundo número deve ser maior que o primeiro número.");
		}
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois);
		
		int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i = i + 1) {

            	System.out.println("Imprimindo o número " + i);
        	}
	}
}

/*https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo */
/**
 * 	Criar um projeto que faça uma contagem.
 * 	O terminal vai passar 2 números e que será jogados em 2 variáveis.
 * 	Com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no 
 * 	console (System.out.print) dos números incrementados, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
 * 	Caso a variável 1 > 2 deve cair na excessão customisada informando "O segundo parâmetro deve ser maior que o 
 * 	primeiro"
 */