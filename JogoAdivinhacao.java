import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        // Jogo onde o usuário deve tentar acertar o número sorteado
        Scanner ler = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(101);
        int numeroDigitado = 0;
        int tentativas = 0;

        System.out.println("Você deve tentar adivinhar o número sorteado (0-100), em até 5 tentativas");

        for (tentativas = 0; tentativas < 5; tentativas++){
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = ler.nextInt();


            if (numeroDigitado == numeroSorteado){
                System.out.println("Parabéns, você acertou o número em "+tentativas+" tentativas!");
                break;
            } else{
                if (numeroDigitado > numeroSorteado){
                    System.out.println("O número digitado ("+numeroDigitado+ ") é MAIOR que o número sorteado.");
                } else {
                    System.out.println("O número digitado ("+numeroDigitado+ ") é MENOR que o número sorteado.");
                }
            }
        }


        if (tentativas == 5 && numeroDigitado != numeroSorteado){
            System.out.println("""
              GAME OVER - Suas tentativas acabaram, tente novamente!
              O número sorteado era:  """ + numeroSorteado
            );
        }
    }
}
