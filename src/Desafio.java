import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        // Dados do cliente
        String nome = "Silvio Santos";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500;
        //

        System.out.println("""
                **********************************************
                        \nDados iniciais do cliente:
                """);
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("\n**********************************************");

        int escolha = 0;
        double recebido = 0;
        double transferido = 0;

        String menu = """
                \nOperacões
                
                1- Consultar saldos
                2- Receber Valor
                3- Trasnferir valor
                4- Sair
                
                Digite a opção desejada: 
                """;

        Scanner scanner = new Scanner(System.in);

        while (escolha != 4 ) {
            System.out.println(menu);
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo é de: " + saldoInicial);
            }
            else if (escolha == 2) {
                System.out.println("Digite o valor do recebido: ");
                recebido = scanner.nextDouble();
                saldoInicial += recebido;
                System.out.println("Saldo atualizado: " + saldoInicial);
            }
            else if (escolha == 3) {
                System.out.println("Digite o valor para transferir: ");
                transferido = scanner.nextDouble();
                if (transferido > saldoInicial) {
                    System.out.println("Não há saldo suficiente para transferir");
                }else {
                saldoInicial -= transferido;
                System.out.println("Saldo atualizado: " + saldoInicial);
                }
            }
            else if (escolha == 4) {
                System.out.println("Operações encerradas");
            }
            else {
                System.out.println("Operação inválida, escolha uma das operações validas!");
            }

        }



    }

}
