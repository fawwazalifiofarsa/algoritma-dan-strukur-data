package Jobsheet3;

public class Kerucut {

    public double radius;
    public double sisiMiring;
    public double phi = 3.14;

    public double hitungLuas() {
        return Math.round((phi * radius * (radius + sisiMiring)) * 100) / 100.0;
    }

    public double hitungVolume() {
        return Math.round((phi * (radius * radius) * Math.sqrt(Math.pow(sisiMiring, 2) + Math.pow(radius, 2) * 1 / 3)) * 100) / 100.0;
    }
}
