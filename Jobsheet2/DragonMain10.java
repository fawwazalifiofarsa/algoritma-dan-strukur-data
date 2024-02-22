package Jobsheet2;

public class DragonMain10 {
    public static void main(String[] args) {
        Dragon10 dragonFawwaz = new Dragon10(4, 5, 6, 6);
        dragonFawwaz.printPosition();
        dragonFawwaz.moveDown();
        dragonFawwaz.moveLeft();
        dragonFawwaz.moveLeft();
        dragonFawwaz.printPosition();
        dragonFawwaz.moveDown();
        dragonFawwaz.moveUp();
        dragonFawwaz.moveRight();
        dragonFawwaz.printPosition();
    }
}
