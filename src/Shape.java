public abstract class Shape implements Drawable{
    protected int xCor;
    protected int yCor;
    protected int side1;
    protected int side2;
    protected int color;
    protected int xEnd;
    protected int yEnd;

    public int getXCor(){
        return xCor;
    }
    public int getYCor(){
        return yCor;
    }
    public void setXCor(int x){
        xCor = x;
    }
    public void setYCor(int y){
        yCor = y;
    }

    public abstract void drawOn(DrawingBoard db);
    public boolean within(DrawingBoard db){
        if((xCor + side1) > db.getWidth() || xCor < 0){
            return false;
        } else if ((yCor + side2) > db.getHeight() || yCor < 0){
            return false;
        } else {
            return true;
        }
    }
    public static int xOnLine(int y, int x1, int y1, int x2, int y2){
        if(y2 == y1){
            return x1;
        }
        double m = ((double)(x2 - x1))/(y2 - y1);

        int x = (int)(x1 + m*(y - y1) + 0.5);
        return x;
    }

}
