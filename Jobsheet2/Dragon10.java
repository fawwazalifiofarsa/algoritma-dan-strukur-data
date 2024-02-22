package Jobsheet2;

public class Dragon10 {
    int x, y, width, height;

    public Dragon10(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void moveLeft() {
        if (x < 0 || x > width) {
            detectCollison(x, y);
        } else {
            x -= 1;
        }
    }
    
    void moveRight() {
        if (x < 0 || x > width) {
            detectCollison(x, y);
        } else {
            x += 1;
        }
    }
    
    void moveUp() {
        if (y < 0 || y > height) {
            detectCollison(x, y);
        } else {
            y -= 1;
        }
    }
    
    void moveDown() {
        if (y < 0 || y > height) {
            detectCollison(x, y);
        } else {
            y += 1;
        }
    }
    
    void printPosition() {
        System.out.printf("Position: %s, %s\n", x, y);
    }
    
    void detectCollison(int x, int y) {
        System.out.println("Game Over");
    }
}
