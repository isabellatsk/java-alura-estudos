import java.util.Scanner;

public class EstudosAnotacoesSintaxe {
    public static void main(String[] args){
        System.out.println("JVM (Java Virtual Machine) - é a Máquina Virtual do Java responsável por executar o bytecode");
        System.out.println("JRE (Java Runtime Environment) - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa.");

        System.out.println(
                """
                        1. Arquivo .java → Escreve o código
                        2. javac compila .java e gera .class (bytecode) → Compila o código
                        3. java executa o .class usando a JVM →  Executa o programa
                        4. JVM traduz bytecode para código de máquina → processador entende e executa
                        """
        );


        //CONVENÇÃO DE CÓDIGO
        // Escrever nome de classes : MinhaClasse
        // Escrever nome de métodos : meuMetodo()
        // Escrver nomde de constantes : MINHA_CONSTANTE
        // Escrever nome de variável : minhaVariavel



        //Operadores aritméticos
        int a = 10 + 5;
        int b = 10 - 5;
        int c = 10 * 5;
        int d = 10 / 5;
        int e = 10 % 3;
        System.out.println(a);


        //Operadores de atribuição
        int valor2 =  10;
        valor2 += 15;  //valor = valor + 15
        System.out.println(valor2);



        //Operadores relacionais
        int a1 = 10;
        int b1 = 5;
        int c1 = 30;

        boolean igual = (b1 == a1); //*false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b1 != c1); //*true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b1 > a1); //*false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b1 <= c1); //*true*, pois o valor de b é menor que o valor de c.
        System.out.println(igual);



        //Operadores lógicos
        boolean a2 = true;
        boolean b2 = false;
        if (a2 && b2) {// Este código não será executado, já que a é verdadeiro e b é falso.
        }
        boolean a3 = true;
        boolean b3 = false;
        if (a3 || b3) {// Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
            System.out.println("Foi executado. ");
        }
        boolean a4 = true;
        if (!a4) {// Este código não será executado, já que a é verdadeiro.
        }



        //Operadores de incremento
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // 5
        System.out.println(resultado); // 6

        int num2 = 5;
        int resultado2 = num2++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num2); // 5
        System.out.println(resultado2); // 6



        //Formatar textos com format()
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor);
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        // Com Text Block
        String nomee = "João";
        int aulas = 4;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nomee, aulas);
        System.out.println(mensagem);



        //Comparar duas Strings
        // utilizar == só verifica se os objs são iguais, não o conteúdo
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }



        //Casting - converter tipos de dados
        // é preciso fazer de forma manual quando a conversão é explícita

        // Casting implícito
        int x1 = 10;
        double y1 = x1; // porque o int(menor bytes)  cabe em double(maior bytes)

        // Casting explícito
        double x2 = 10.5;
        int y2 = (int) x2; // double(maior) não cabe em int(menor)



        //Condicionais
        boolean sol = false;
        String clima = "bom";

        if (sol || clima.equals("bom")) {
            System.out.println("Vamos sair");
        } else {
            System.out.println("Ficamos em casa");
        }

        //Switch case
        int dia = 3;
        String nomeDia = switch (dia) {
            case 1 -> "domingo";
            case 2 -> "segunda-feira";
            case 3 -> "terça-feira";
            case 4 -> "quarta-feira";
            case 5 -> "quinta-feira";
            case 6 -> "sexta-feira";
            case 7 -> "sábado";
            default -> "Dia inválido";
        };
        System.out.println("O dia " + dia + " é " + nomeDia);



        // Leitura
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        String seuNome = ler.nextLine();
        System.out.println("Seu nome é "+seuNome);



        //Loop For
        int soma = 0;
        for (int i = 1; i <= 3; i++) {
            int idadee = 10 * i; // 10, 20, 30
            soma += idadee;
        }
        System.out.println("Média das idades: " + soma / 3);

        //Loop While
        int numm = 1;
        while (numm <= 3) {
            System.out.println("Repetição número: " + numm);
            numm++;
        }
    }
}
