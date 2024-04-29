import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá! Bem vindo(a) ao nosso banco! Vamos começar a criar sua conta bancária.");
        System.out.println("Por favor, digite o número de sua conta. (Ex: 1234)");
        int numero = scan.nextInt();

        scan.nextLine();

        System.out.println("Ótimo! Agora, digite o número de sua agência. (Ex: 123-4)");
        String agencia = scan.nextLine();

        System.out.println("Não poderia esquecer no seu nome e sobrenome, né? xD.");
        String nomeCliente = scan.nextLine();

        System.out.println("E por fim, digite o seu saldo. (Ex: 123.4)");
        Double saldo = scan.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        scan.close();
    }
}
