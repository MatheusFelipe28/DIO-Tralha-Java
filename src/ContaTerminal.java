import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da Conta: ");
        int conta = input.nextInt();

        System.out.println("Digite o Numero da Agênmica: ");
        String agencia = input.next();

        System.out.println("Digite Seu Nome: ");
        String nomeCliente = input.next();

        System.out.println("Digite o Saldo da Conta: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. " 
                            + "Sua agência é: " + agencia + " conta: " + conta + "e seu saldo: "
                            + saldo + " já esta disponivél para saque.");

        
        
        
    }
}
