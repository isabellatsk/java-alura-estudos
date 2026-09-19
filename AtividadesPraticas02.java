public class AtividadesPraticas02 {
    public static void main(String[] args){

        //Calculando a média de duas notas
        double nota1 = 2.5;
        double nota2 = 9.4;
        int mediaInteira = (int) ((nota1 + nota2) / 2);

        String resultado = String.format("A média da primeira nota %.2f e da segunda nota %.2f, é: ", nota1, nota2);
        System.out.println(resultado + mediaInteira);

        double mediaDecimal = (nota1 + nota2) / 2;
        System.out.println(resultado + mediaDecimal);



        //Fazendo um casting (conversão) de double para int
        double numeroDouble = 15.7;
        int numeroEmInteiro = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroEmInteiro);



        //Concatenando variáveis
        char letra = 'N';
        String palavra = "Quer receber atualizações? ";
        System.out.println(palavra + letra);



        //Calculando o valor total (preço * quantidade)
        double precoProduto = 30.40;
        int quantidade = 2;

        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total a ser pago é: " + valorTotal);



        //Convertendo dólar para real
        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;
        double valorEmReais = valorEmDolares * taxaDeConversao;
        System.out.println("O valor em reais é: " + valorEmReais);



        //Calculando preço com desconto
        double precoOriginal = 120.00;
        double percentualDesconto = 5.00;
        double desconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - desconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);

    }
}
