import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         // Conhecer a classe Scanner (usando Locale.US para garantir o ponto decimal)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Exibir as mensagens ao usuário e obter pela Scanner os valores
        System.out.println("Por favor, digite o número da Agência (Ex: 067-8):");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta (Ex: 1021):");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do Enter após o número inteiro
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o Saldo inicial (Ex: 237.48):");
        double saldo = scanner.nextDouble();
        // Criar o objeto ContaBancaria com os dados fornecidos
        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);
        // Exibir a mensagem da conta criada usando a nossa regra testada
        System.out.println();
        System.out.println(conta.gerarMensagemBoasVindas());
        // Fechar o scanner
        scanner.close();
    }
}
