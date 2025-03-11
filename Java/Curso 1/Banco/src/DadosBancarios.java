import java.util.Scanner;

public class DadosBancarios {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao sistema de dados bancários!");

        System.out.print("Digite o seu Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu Saldo: ");
        float saldo = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Conta Corrente ou Polpança?");
        String conta = scanner.nextLine();
       

        System.out.println(nome + saldo + conta);

        scanner.close();
    }
}
