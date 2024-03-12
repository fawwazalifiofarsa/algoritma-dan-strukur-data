package Jobsheet3;

public class Bola {

    public double radius;
    public double phi = 3.14;

    public double hitungLuas() {
        return Math.round((4 * phi * Math.pow(radius, 2)) * 100) / 100.0;
    }

    public double hitungVolume() {
        return Math.round((phi * Math.pow(radius, 3) * 4 / 3) * 100) / 100.0;
    }
}
