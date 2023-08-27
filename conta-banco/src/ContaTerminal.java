import java.util.Scanner; //Clase scanner importada

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner
       //Exibir as mensagens para o nosso usuário
       //Obter pelo scanner os valores digitados no terminal
       //Ixibir a mensagem da conta criada

       Conta conta = new Conta();

       Scanner entrada = new Scanner(System.in); //Criar objeto Scanner

       System.out.println("Por favor, digite o número da Agência!");
       conta.setAgencia(entrada.nextLine());

       System.out.println("Digite a conta: ");
       conta.setNumeroConta(entrada.nextInt());

       System.out.println("Digite seu nome: ");
       conta.setNomeCliente(entrada.next());

       System.out.println("Valor para deposito: ");
       conta.setSaldo(entrada.nextDouble());

       conta.imprimir();
           

    }
}
