import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {


    public static void main(String[] args) {
        //importando objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite sua agência");
        String agência = scanner.next();

        System.out.println("Por favor digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo");
        Double saldo = scanner.nextDouble();

        System.out.println("Seu numero da conta: " + numero);
        System.out.println("Seu numero da agência: " + agência);
        System.out.println("Olá " + nomeCliente + " Seu saldo total é: " + saldo);
}



}