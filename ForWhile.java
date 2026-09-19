import java.util.Scanner;

public class ForWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        //Loop FOR
        double nota = 0;
        double media = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Diga sua avaliação para o filme ");
            nota = leitura.nextDouble();
            media += nota;
        }
        System.out.println("Média de avaliação é: "+ media/3);


        //Loop WHILE
        double notaa = 0;
        double mediaa = 0;
        int totalDeNotass = 0;

        while (notaa != -1){
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
            notaa = leitura.nextDouble();

            if (notaa != -1){
                mediaa += notaa;
                totalDeNotass++;
            }
        }
        System.out.println("Média de avaliação é: "+ mediaa/totalDeNotass);
    }
}
