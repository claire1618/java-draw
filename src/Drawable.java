public interface Drawable {

    int PINK = 0xf08080;
    int DARKRED = 0x800000;
    int RED = 0xff0000;
    int ORANGE = 0xff8C00;
    int YELLOW = 0xffff00;
    int LIME = 0x7cfC00;
    int GREEN = 0x008000;
    int TEAL = 0x7fffd4;
    int BLUE = 0x0000ff;
    int LIGHTPURPLE = 0x8a2be2;
    int PURPLE = 0x9400d3;
    int BROWN = 0x8b4513;
    int WHITE = 0xffffff;
    int BLACK = 0x000000;


    // Draws the object on DrawingBoard db
    void drawOn(DrawingBoard db);

    // Returns true if the object falls entirely within DrawingBoard db
    boolean within(DrawingBoard db);
    int getXCor();
    int getYCor();
    void setXCor(int x);
    void setYCor(int y);
}
