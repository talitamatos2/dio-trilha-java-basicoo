import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" O número da agência: ");
        int numeroAgencia = sc.nextInt();
        sc.nextLine(); 

        System.out.println(" O seu nome completo: ");
        String nome = sc.next();

        System.out.println(" O valor do saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + numeroAgencia + ", conta xxx1 e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
