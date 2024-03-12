package Jobsheet3;

public class Segitiga {
    public double alas;
    public double tinggi;
    
    public Segitiga(double a, double t) {
        this.alas = a;
        this.tinggi = t;
    }

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public double hitungKeliling() {
        return Math.round((Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)) + alas + tinggi) * 100) / 100.0;
    }
}
