package Fotbal;

import java.util.Random;

public class Minge {
    private int x, y;
    
    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void suteaza() throws Out, Gol, Corner {
        Random rand = new Random();
        int newX = rand.nextInt(101);
        int newY = rand.nextInt(51);
        
        if (newY == 0 || newY == 50) {
            throw new Out();
        } else if ((newX == 0 && newY >= 20 && newY <= 30) ||
                   (newX == 100 && newY >= 20 && newY <= 30)) {
            throw new Gol();
        } else if (newX == 0 || newX == 100) {
            throw new Corner();
        } else {
            x = newX;
            y = newY;
        }
    }
}
