import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor,digite o seu nome: ");
            String nome = scanner.next();
        
        System.out.println("Por favor,digite o número da sua agência: ");
            String numeroAgencia = scanner.next();

        System.out.println("Por favor,digite o número da sua conta: ");
             String numeroConta = scanner.next();

        System.out.println("Por favor,digite o seu saldo: ");
            double saldo= scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome + " ,obrigado(a) por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
    
}
