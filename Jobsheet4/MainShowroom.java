package Jobsheet4;

public class MainShowroom {
    public static void main(String[] args) {
        Showroom[] showroom = new Showroom[8];
        showroom[0] = new Showroom("BMW", "M2 Coupe", 2016, 6816, 728);
        showroom[1] = new Showroom("Ford", "Fiesta ST", 2014, 3921, 575);
        showroom[2] = new Showroom("Nissan", "370Z", 2009, 4360, 657);
        showroom[3] = new Showroom("Subaru", "BRZ", 2014, 4058, 609);
        showroom[4] = new Showroom("Subaru", "Impreza WRX STI", 2013, 6255, 703);
        showroom[5] = new Showroom("Toyota", "AE86 Trueno", 1986, 3700, 553);
        showroom[6] = new Showroom("Toyota", "86/GT86", 2014, 4180, 609);
        showroom[7] = new Showroom("Volkswagen", "Golf GTI", 2014, 4180, 631);
        Showroom sr = new Showroom();
        
        System.out.println("Highest Top Acceleration (DC): " + sr.highestTopAccelerationDC(showroom, 0, showroom.length - 1));
        
        System.out.println("Lowest Top Acceleration (DC): " + sr.lowestTopAccelerationDC(showroom, 0, showroom.length - 1));

        System.out.println("Average Top Power (BF): " + sr.averageTopPowerBF(showroom));
  }
}
