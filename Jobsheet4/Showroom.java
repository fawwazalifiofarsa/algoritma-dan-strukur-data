package Jobsheet4;

public class Showroom {
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;

    Showroom() {
    }

    Showroom(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public int highestTopAccelerationDC(Showroom[] showroom, int low, int high) {
        if (low == high) {
            return showroom[low].top_acceleration;
        }

        int mid = low + (high - low) / 2;
        int leftHighest = highestTopAccelerationDC(showroom, low, mid);
        int rightHighest = highestTopAccelerationDC(showroom, mid + 1, high);

        return Math.max(leftHighest, rightHighest);
    }

    public int lowestTopAccelerationDC(Showroom[] showroom, int low, int high) {
        if (low == high) {
            return showroom[low].top_acceleration;
        }

        int mid = low + (high - low) / 2;
        int leftLowest = lowestTopAccelerationDC(showroom, low, mid);
        int rightLowest = lowestTopAccelerationDC(showroom, mid + 1, high);

        return Math.min(leftLowest, rightLowest);
    }

    public double averageTopPowerBF(Showroom[] showroom) {
        int totalPower = 0;
        for (Showroom car : showroom) {
            totalPower += car.top_power;
        }
        return (double) totalPower / showroom.length;
    }
}
