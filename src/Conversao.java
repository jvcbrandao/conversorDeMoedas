import java.io.IOException;
import java.util.Scanner;

public class Conversao extends RequisicaoAPI{
    Scanner scanner = new Scanner(System.in);

    private double BRL;
    private double USD;
    private double ARS;
    private double AUD;

    public Conversao() {
    }

    public void converter(int opcaoDesejada, double BRL, double AUD, double ARS, double USD) throws IOException, InterruptedException {

        if(opcaoDesejada==1){
            System.out.println("Quantos Reais você deseja converter? ");
            double valor = scanner.nextDouble();
            double resultado = valor/BRL;
            System.out.println("O valor " + valor + " Reais (BRL) em Dólares Americanos (USD) é de " + String.format("%.3f", resultado));
            System.out.println();
        }

        else if(opcaoDesejada==2){
            System.out.println("Quantos Dólares Americanos você deseja converter? ");
            double valor = scanner.nextDouble();
            double resultado = BRL*valor;
            System.out.println("O valor " + valor + " em Dólares Americanos (USD) em Reais (BRL) é de " + String.format("%.3f", resultado));
            System.out.println();

        }

        else if(opcaoDesejada==3){
            System.out.println("Quantos Reais você deseja converter? ");
            double valor = scanner.nextDouble();
            double resultado = (valor*ARS)/BRL;
            System.out.println("O valor " + valor + " em Reais (BRL) em Pesos Argentinos (ARS) é de " + String.format("%.3f", resultado));
            System.out.println();

        }

        else if(opcaoDesejada==4){
            System.out.println("Quantos Pesos Argentinos você deseja converter? ");
            double valor = scanner.nextDouble();
            double resultado = (valor*BRL)/ARS;
            System.out.println("O valor " + valor + " em Pesos Argentinos (ARS) em Reais (BRL) é de " + String.format("%.3f", resultado));
            System.out.println();
        }

        else if(opcaoDesejada==5){
            System.out.println("Quantos Reais você deseja converter? ");
            double valor = scanner.nextDouble();
            double resultado = (valor*AUD)/BRL;
            System.out.println("O valor " + valor + " em Reais (BRL) em Dólares Australianos (AUD) é de " + String.format("%.3f", resultado));
            System.out.println();

        }

        else if(opcaoDesejada==6){
            System.out.println("Quantos Dólares Australianos você deseja converter? ");
            double valor = scanner.nextDouble();
            double resultado = (valor*BRL)/AUD;
            System.out.println("O valor " + valor + " em Dólares Australianos (AUD) em Reais (BRL) é de " + String.format("%.3f", resultado));
            System.out.println();
        }
    }
}
