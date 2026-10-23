public class ContaBancariaTest {
    public static void main(String[] args) {
        // Cenário de teste
        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        // Execução (esperamos que a classe ContaBancaria exista com esses atributos)
        ContaBancaria conta = new ContaBancaria(numero, agencia, nomeCliente, saldo);

        String mensagemEsperada = "Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, "
                + "sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.";

        String mensagemObtida = conta.gerarMensagemBoasVindas();

        // Validação (Assert)
        if (mensagemEsperada.equals(mensagemObtida)) {
            System.out.println("🟢 TESTE PASSOU: Mensagem gerada com sucesso!");
        } else {
            System.err.println("🔴 TESTE FALHOU!");
            System.err.println("Esperado: " + mensagemEsperada);
            System.err.println("Obtido:   " + mensagemObtida);
            System.exit(1);
        }
    }
}
