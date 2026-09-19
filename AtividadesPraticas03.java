import java.util.Scanner;

public class AtividadesPraticas03 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Descobrindo se um número é positivo ou negativo
        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero > 0){
            System.out.println("O número "+numero+" é positivo!");
        } else if (numero < 0){
            System.out.println("O número "+numero+" é negativo!");
        } else{
            System.out.println("O número "+numero+" é neutro!");
        }



        //Comparação de dois números
        System.out.println("Digite o primeiro número para comparar: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo número para comparar: ");
        int num2 = leitor.nextInt();

        if (num1 == num2){
            System.out.println("Os números são iguais");
        } else{
            if(num1 > num2){
                System.out.println("Os números são diferentes. "+num1+" é maior que "+num2);
            } else{
                System.out.println("Os números são diferentes. "+num2+" é maior que "+num1);
            }
        }



        //Menu de opções para calcular área
        int opcao = 0;

        while(opcao != 3){
            System.out.println("""
                Escolha uma das opções abaixo:
                1. Calcular área de um quadrado
                2. Calcular área de um círculo
                3. Sair
                """);
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = leitor.nextDouble();
                    double areaDoQuadrado = lado * lado;
                    System.out.println("A área do quadrado é "+areaDoQuadrado);
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    System.out.println("Digite o raio do círculo: ");
                    double raio = leitor.nextDouble();
                    double pi = Math.PI;
                    double areaDoCirculo = (raio * raio) * pi;
                    System.out.println(String.format("A área do circulo é %.2f", areaDoCirculo));
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Digite uma das opções corretamente.");
                    System.out.println("-----------------------------");
                    break;
            }
        }



        //Tabuada de um número
        System.out.println("Digite um número: ");
        int numTabuada = leitor.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(numTabuada+" X "+i+" = "+ numTabuada * i);
        }



        //Descobrir se um número é impar ou par
        System.out.println("Digite um número inteiro: ");
        int numInteiro = leitor.nextInt();

        int divisaoResto = numInteiro % 2;
        if(divisaoResto == 0){
            System.out.println("Número par");
        } else{
            System.out.println("Número impar");
        }



        //Calcular o fatorial de um número
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);


    }
}
