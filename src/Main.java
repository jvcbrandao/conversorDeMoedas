import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException, InterruptedException {
    int opcaoDesejada = 0;

    Scanner leitura = new Scanner(System.in);
    Textos textos = new Textos();
    RequisicaoAPI requisicaoAPI = new RequisicaoAPI();
    GeradorLog gerarLog = new GeradorLog();

    Moedas moedas = requisicaoAPI.conectarAPI();

    Conversao converter = new Conversao();
    textos.decorar();

    while (opcaoDesejada != 7) {
        textos.escolherMoeda();
        opcaoDesejada = leitura.nextInt();
        converter.converter(opcaoDesejada, moedas.getBRL(), moedas.getAUD(), moedas.getARS(), moedas.getUSD());
        gerarLog.gerarLog();
    }
    leitura.close();
}