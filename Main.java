public class Main{
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+ anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDeFilme = 8.1;

        double media = (9.8 + 6.3 +8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);


        // Conversão de tipos
        int classificacao; // Declarou que vai ser int
        classificacao = (int) (media / 2); // É a media / 2, mas como ela é double pra passar pra int é assim
        System.out.println(classificacao);
    }
}