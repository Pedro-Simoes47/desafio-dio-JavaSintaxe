package dio.desafio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o numero da agencia: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        int conta = sc.nextInt();
        System.out.println("Informe o valor do seu saldo inicial: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque", nome,agencia,conta,saldo);

    }
}
