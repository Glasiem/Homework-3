package com.glasiem.converter;

public class Converter {

    private double usd, eur;

    public Converter(double usd, double eur) {
        this.usd = usd;
        this.eur = eur;
    }

    public double usdtohrn(double usd){
        return usd / this.usd;
    }

    public double eurtohrn(double eur){
        return eur / this.eur;
    }

    public double hrntousd(double hrn){
        return hrn * this.usd;
    }

    public double hrntoeur(double hrn){
        return hrn * this.eur;
    }
}
