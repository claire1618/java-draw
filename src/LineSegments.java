public class LineSegments extends Shape{

    public LineSegments(int x, int y, int xe, int ye, int clr){
        if(y < ye){
            yCor = y;
            yEnd = ye;
            xCor = x;
            xEnd = xe;
        } else {
            yCor = ye;
            yEnd = y;
            xCor = xe;
            xEnd = x;
        }
        color = clr;
    }

    public void drawOn(DrawingBoard db){
        int img[][] = db.getImageArray();
        for (int y = yCor; y < yEnd; y++) {
            int x = xOnLine(y, xCor, yCor, xEnd, yEnd);
            img[y][x] = color;
        }
    }


    public boolean within(DrawingBoard db){
        if(xCor > db.getWidth() || xCor < 0){
            return false;
        } else if (yCor > db.getHeight() || yCor < 0){
            return false;
        } else if(xEnd > db.getWidth() || xEnd < 0){
            return false;
        } else if(yEnd > db.getWidth() || yEnd < 0){
            return false;
        } else{
            return true;
        }
    }

}
