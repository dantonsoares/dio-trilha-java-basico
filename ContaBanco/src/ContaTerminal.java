import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //recebendo as informações do usuário
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = Integer.parseInt(scanner.next());

        System.out.println("Digite o número da agência da sua conta: ");
        String agencia = scanner.next();

        System.out.println("Digite o saldo da sua conta: ");
        double saldo = Double.parseDouble(scanner.next());

        //imprimindo a mensagem na tela
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
