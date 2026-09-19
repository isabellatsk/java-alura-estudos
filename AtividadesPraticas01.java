public class AtividadesPraticas01 {
    public static void main(String[] args){

        //Exibindo duas mensagens no console
        System.out.println("Olá, Isabella!");
        System.out.println("Tudo bem?");

        //Cálculo de uma soma
        System.out.println(10 + 5);

        //Cálculo de uma subtração
        System.out.println(10-5);

        //Conversao de temperatura
        double temperaturaCelsius = 30.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura %.2f Celsius é equivalente a %.2f fahrenheit",temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensagem);

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira);
    }
}
