import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Bruno Paese";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        double receber;
        double transferir;
        int tipo = 0;

        Scanner operacao = new Scanner(System.in);

        System.out.println(String.format("""
                ***********************
                Dados iniciais do cliente:
                                    
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                ***********************""", nome, tipoConta, saldo));

        while (tipo != 4){
            System.out.println("""
                            
                    Operações:
                    
                    1 - Consultar saldo
                    2 - Transferir valor
                    3 - Receber valor
                    4 - Sair
                    
                    Digite a opção desejada: """);

            tipo = operacao.nextInt();

            switch (tipo) {
                case 1:
                    System.out.println("O saldo atualizado: R$ " + saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor que deseja transferir: ");
                    transferir = operacao.nextDouble();
                    if (transferir <= saldo){
                        saldo -= transferir;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    }
                    break;

                case 3:
                    System.out.println("Informe o valor a receber: ");
                    receber = operacao.nextDouble();
                    saldo += receber;
                    System.out.println("Saldo atualizado R$ " + saldo);
                break;

                case 4:
                    continue;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
