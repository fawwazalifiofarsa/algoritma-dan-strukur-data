package Jobsheet4;

public class Sum {
    int elemen;
    double keuntungan[][], total;

    Sum(int perusahaan, int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[perusahaan][elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        total = 0;
        for (int j = 0; j < elemen; j++) {
            total = total + arr[j];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }
        else if (l < r) {
            int mid = (l+r)/2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum + arr[mid] + rsum;
        }
        return 0;
    }
}
