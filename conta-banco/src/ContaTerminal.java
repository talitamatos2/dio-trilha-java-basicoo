import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroAgencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        numeroAgencia = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o valor do saldo inicial: ");
        saldo = scanner.nextDouble();

        scanner.close();

        String mensagemBoasVindas = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + numeroAgencia + ", conta 0001 e seu saldo R$ " + saldo + " já está disponível para saque.";

        System.out.println(mensagemBoasVindas);
    }
}
