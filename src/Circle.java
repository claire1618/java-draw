public class Circle extends Shape{
    private int radius;
    private int xCor;
    private int yCor;

    public Circle(int rad, int x, int y, int clr){
        radius = rad;
        xCor = x;
        yCor = y;
        color = clr;
    }

    public void drawOn(DrawingBoard db){
        int img[][] = db.getImageArray();
        for(int j = yCor; j < yCor + radius; j++){
            for(int k = xCor; k < xCor + radius; k++){

                for (int y = yCor; y < yCor + radius; y++) {
                    int x = xOnLine(y, xCor, yCor, xCor + radius, yCor + radius);
                    img[y][x] = color;
                }

            }
        }
    }

    public boolean within(DrawingBoard db){
        if((xCor + radius) > db.getWidth()){
            return false;
        } else if ((yCor + radius) > db.getHeight()){
            return false;
        } else {
            return true;
        }
    }
}

