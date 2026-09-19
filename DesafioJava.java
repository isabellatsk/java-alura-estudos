import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            String nome = "João Oliveira";
            String tipoDeConta = "Corrente";
            double saldo = 2500;

            int opcao = 0;
            int SAIR = 4;

            String exibirDados = """
                    **************************************
                    Dados iniciais do cliente: 
                    
                    Nome:           %s
                    Tipo de conta:  %s
                    Saldo inicial:  R$ %.2f
                    **************************************
                    """.formatted(nome, tipoDeConta, saldo);
            System.out.println(exibirDados);

            String menu = """
                        1. Consultar saldos
                        2. Receber valor
                        3. Transferir valor
                        4. Sair
                        Digite a opção desejada:
                        """;

            while (opcao != SAIR){
                System.out.println(menu);
                opcao = ler.nextInt();

                switch (opcao){
                    case 1:
                        System.out.printf("O saldo atual é de R$ %.2f\n",saldo);
                        break;
                    case 2:
                        System.out.println("Informe o valor a receber: ");
                        double recebendo = ler.nextDouble();

                        saldo += recebendo;
                        System.out.printf("Saldo atualizado R$ %.2f\n",saldo);
                        break;
                    case 3:
                        System.out.println("Informe o valor que deseja transferir: ");
                        double transferir = ler.nextDouble();

                        if (transferir <= saldo && transferir > 0){
                            saldo -= transferir;
                            System.out.printf("Saldo atualizado R$ %.2f\n",saldo);
                        } else if (transferir <=0){
                            System.out.println("Não é possível transferir este valor.");
                        } else{
                            System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        }
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
            ler.close();
    }
}
