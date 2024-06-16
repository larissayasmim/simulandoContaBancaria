import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: (Após, pressione Enter.)");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: (Após, pressione Enter.)");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência: (Após, pressione Enter.)");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o seu saldo: (Após, pressione Enter.)");
        double saldo = scanner.nextDouble() ; 

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ ",");
        System.out.println("conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.\n");

    }
}
