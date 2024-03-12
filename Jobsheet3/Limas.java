package Jobsheet3;

public class Limas {

    public double tinggi;
    public double sisi;

    public double hitungLuas() {
        return Math.round(Math.pow(sisi, 2) + 2 * (sisi * Math.sqrt(Math.pow(sisi, 2) + Math.pow(tinggi, 2))) * 100) / 100.0;
    }

    public double hitungVolume() {
        return Math.round((Math.pow(sisi, 2) * tinggi * 1 / 3) * 100) / 100.0;
    }
}
