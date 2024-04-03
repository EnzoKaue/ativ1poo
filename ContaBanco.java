import java.util.Scanner;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBanco() {
    }

    public void inserirDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da agencia: ");
        this.agencia = scanner.nextLine();

        System.out.print("Digite o numero da conta: ");
        this.numero = scanner.nextInt(); 
        scanner.nextLine(); 

        System.out.print("Digite seu nome: ");
        this.nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        this.saldo = scanner.nextDouble();
    }

    public void exibirMensagem() {
        String mensagem = "Ola " + nomeCliente + ", sua agencia é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " reais";

        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.inserirDados();
        conta.exibirMensagem();
    }
}