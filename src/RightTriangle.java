public class RightTriangle extends Shape{
    public static final int TOPLEFT = 1;
    public static final int TOPRIGHT = 2;
    public static final int BOTTOMLEFT = 3;
    public static final int BOTTOMRIGHT = 4;
    private int corner;

    public RightTriangle(int x, int y, int s1, int s2, int sd, int clr){
        xCor = x;
        yCor = y;
        side1 = s1;
        side2 = s2;
        corner = sd;
        color = clr;
    }

    public void drawOn(DrawingBoard db){
        int img[][] = db.getImageArray();
        if(corner == TOPLEFT){
            double h = side1;
            for(int j = yCor; j < (yCor + side2); j++){
                for(int k = xCor; k < (h + xCor); k++){
                    img[j][k] = color;
                }
                h--;
            }
        } else if(corner == TOPRIGHT){
            int h = (xCor - side1);
            for(int j = yCor; j < (yCor + side2); j++){
                for(int k = h;  k < xCor; k++){
                    img[j][k] = color;
                }
                h++;
            }
        } else if(corner == BOTTOMLEFT){
            int h = xCor + side1;
            for(int j = yCor; j > (yCor - side2); j--){
                for(int k = xCor; k < h; k++){
                    img[j][k] = color;
                }
                h--;
            }
        } else if(corner == BOTTOMRIGHT){
            int h = xCor - side1;
            for(int j = yCor; j > (yCor - side2); j--){
                for(int k = h; k < xCor; k++){
                    img[j][k] = color;
                }
                h++;
            }
        }

    }

}
