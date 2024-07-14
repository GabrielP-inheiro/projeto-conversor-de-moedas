package br.com.alura.ConversorDeMoeda.model;

public class Cambio {
    private String fromCurrency;
    private String toCurrency;
    private double rate;

    public Cambio(CambioDTO cambio) {
        this.fromCurrency = cambio.base_code();
        this.toCurrency = cambio.target_code();
        this.rate = cambio.conversion_result();
    }


    public Cambio(String fromCurrency, String toCurrency, double rate) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public double getRate() {
        return rate;
    }
}

