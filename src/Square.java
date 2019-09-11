public class Square extends Shape{

    public Square(int sidelngth, int x, int y, int clr){
        side1 = sidelngth;
        side2 = sidelngth;
        xCor = x;
        yCor = y;
        color = clr;
    }

    public void drawOn(DrawingBoard db){
        int img[][] = db.getImageArray();
        for(int j = yCor; j < (yCor + side1); j++){
            for(int k = xCor; k < (xCor + side2); k++){
                img[j][k] = color;
            }
        }

    }
}
