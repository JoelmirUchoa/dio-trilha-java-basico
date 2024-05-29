import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         //TODO:Conhecer e importar a classw Scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         //Exibir as mensagens para o usuário
            System.out.println("Por favor, digite o número da Agência!");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

            System.out.println("Digite os dígitos da Agência!");
            String agencia = scanner.next();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

            System.out.println("Por favor, digite seu Nome!");
            String nome = scanner.nextLine();

            System.out.println("E o saldo em conta!");
            double saldo = scanner.nextDouble();

         //Exibir a mensagem da conta criada
         System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

          // Fechar o scanner
        scanner.close(); //Fechar o Scanner é uma boa prática 
    }
}
