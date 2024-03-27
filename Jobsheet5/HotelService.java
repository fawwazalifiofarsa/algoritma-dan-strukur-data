package Jobsheet5;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idx;

    void tambah(Hotel h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll() {
        for (Hotel h : rooms) {
            h.tampil();
            System.out.println("-------------------------------");
        }
    }

    void bubbleSort(char input) {
        switch (input) {
            case '1':
                // Bubble sort ascending berdasarkan harga
                for (int i = 0; i < rooms.length - 1; i++) {
                    for (int j = 1; j < rooms.length - i; j++) {
                        if (rooms[j].harga < rooms[j - 1].harga) {
                            Hotel tmp = rooms[j];
                            rooms[j] = rooms[j - 1];
                            rooms[j - 1] = tmp;
                        }
                    }
                }
                break;
            case '2':
                // Bubble sort descending berdasarkan bintang
                for (int i = 0; i < rooms.length - 1; i++) {
                    for (int j = 1; j < rooms.length - i; j++) {
                        if (rooms[j].bintang > rooms[j - 1].bintang) {
                            Hotel tmp = rooms[j];
                            rooms[j] = rooms[j - 1];
                            rooms[j - 1] = tmp;
                        }
                    }
                }
                break;
            default:
                System.out.println("Input tidak valid!!");
                break;
        }
    }

    void selectionSort(char input) {
        switch (input) {
            case '1':
                for (int i = 0; i < rooms.length - 1; i++) {
                    int idxMin = i;
                    for (int j = i + 1; j < rooms.length; j++) {
                        if (rooms[j].harga < rooms[idxMin].harga) {
                            idxMin = j;
                        }
                    }
                    Hotel tmp = rooms[idxMin];
                    rooms[idxMin] = rooms[i];
                    rooms[i] = tmp;
                }
                break;
            case '2':    
                for (int i = 0; i < rooms.length - 1; i++) {
                    int idxMin = i;
                    for (int j = i + 1; j < rooms.length; j++) {
                        if (rooms[j].bintang > rooms[idxMin].bintang) {
                            idxMin = j;
                        }
                    }
                    Hotel tmp = rooms[idxMin];
                    rooms[idxMin] = rooms[i];
                    rooms[i] = tmp;
                }
                break;
            default:
                System.out.println("Input tidak valid!!");
                break;
        }
    }
}
