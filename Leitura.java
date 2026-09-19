import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        //Ler dados digitados pelo usuário no teclado
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = ler.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        ler.close();

    }
}