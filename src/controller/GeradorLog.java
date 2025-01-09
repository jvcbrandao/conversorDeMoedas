package controller;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorLog {

    public void gerarLog() {
        try (FileWriter log = new FileWriter("log.txt")) {
            log.write("O arquivo foi  sem nenhum erro!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }
}
