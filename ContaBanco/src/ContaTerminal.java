import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("\nOlá usuário! Você está na área de criação de contas em nosso banco.\nPara iniciar, insira o seu nome: ");
        String NomeCliente = scanner.next();

        System.out.println("Preciso também do seu sobrenome, pode me informar? ");
        String SobrenomeCliente = scanner.next();
        
        System.out.println("Em qual Agência sua conta será criada?");
        String AgenciaConta = scanner.next();

        System.out.println("Tem algum número de preferência para sua conta?");
        int NumeroConta = scanner.nextInt();
        
        System.out.println("Qual será o valor de depósito inicial?");
        double SaldoConta = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("\nDeu tudo certo! " + NomeCliente + " " + SobrenomeCliente + " obrigado por confiar em nosso banco. Vou te passar o resumo sobre sua conta:");
        System.out.println("\n    Agência: " + AgenciaConta);
        System.out.println("    Número da conta: " + NumeroConta);
        System.out.println("    Saldo: R$" + SaldoConta);
        System.out.println("\nO valor depositado já está disponível para saque.\nSeja bem-vindo!\n");        
    }
}
