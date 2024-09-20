import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da agência: ");
        int agencia = sc.nextInt();

        System.out.print("Digite o número da conta: ");
        String numero = sc.next();
        sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
