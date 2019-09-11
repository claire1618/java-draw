public class Rectangle extends Shape{

    public Rectangle(int s1, int s2, int x, int y, int clr){
        side1 = s1;
        side2 = s2;
        xCor = x;
        yCor = y;
        color = clr;
    }

    public void drawOn(DrawingBoard db){
        int img[][] = db.getImageArray();
        for(int j = yCor; j < (yCor + side2); j++){
            for(int k = xCor; k < (xCor + side1); k++){
                img[j][k] = color;
            }
        }

    }
}
