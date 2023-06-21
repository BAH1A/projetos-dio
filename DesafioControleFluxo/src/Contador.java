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
		}
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois){
			System.out.println("O segundo número deve ser maior que o primeiro número.");
		}
		
		int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i = i + 1) {
				
            	System.out.println("Imprimindo o número " + i);
        	}
	}
}