public class Diamond extends Shape{

    public Diamond(int rad, int x, int y, int clr){
        side1 = rad;
        xCor = x;
        yCor = y;
        color = clr;
    }

    public void drawOn(DrawingBoard db){
        int img[][] = db.getImageArray();
        int h = xCor - side1;
        for(int j = yCor; j < (yCor + side1); j++){
            for(int k = h; k < xCor; k++){
                img[j][k] = color;
            }
            h++;
        }
        h = xCor - side1;
        for(int j = yCor; j > yCor - side1; j--){
            for(int k =  h; k < xCor; k++){
                img[j][k] = color;
            }
            h++;
        }
        h = xCor + side1;
        for(int j = yCor; j < (yCor + side1); j++){
            for(int k = xCor; k < h; k++){
                img[j][k] = color;
            }
            h--;
        }
        h = xCor + side1;
        for(int j = yCor; j > (yCor - side1); j--){
            for(int k = xCor; k < h; k++){
                img[j][k] = color;
            }
            h--;
        }
    }

    public boolean within(DrawingBoard db){
        if((xCor + side1) > db.getWidth()){
            return false;
        } else if ((yCor + side1) > db.getHeight()){
            return false;
        } else {
            return true;
        }
    }
}
