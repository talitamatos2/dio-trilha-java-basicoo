import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" O número da agência: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println(" O seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println(" O valor do saldo inicial: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + numeroAgencia + ", conta xxx1 e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
