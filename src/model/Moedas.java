package model;

public class Moedas{

    private double BRL;
    private double USD;
    private double ARS;
    private double AUD;

    public Moedas(double BRL, double USD, double ARS, double AUD) {
        this.BRL=BRL;
        this.USD=USD;
        this.ARS=ARS;
        this.AUD=AUD;
    }

    public double getBRL() {
        return this.BRL;
    }

    public double getAUD() {
        return AUD;
    }

    public double getARS() {
        return ARS;
    }

    public double getUSD() {
        return USD;
    }

}
