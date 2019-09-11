import java.util.* ;
public class ShapeGroup implements Drawable{
    protected ArrayList<Drawable> group;
    protected int xCor;
    protected int yCor;
    private int strY;
    private int strX;

    public ShapeGroup(){
        group = new ArrayList<Drawable>();
    }

    public void move(int nwy, int nwx, DrawingBoard db, int oneOrTwo){
        for(int k = 0; k < group.size(); k++) {
            if (group.get(k).getXCor() < group.get(k + 1).getXCor()) {
                xCor = group.get(k).getXCor();
            } else {
                xCor = group.get(k + 1).getYCor();
            }
            if (group.get(k).getYCor() < group.get(k + 1).getYCor()) {
                xCor = group.get(k).getYCor();
            } else {
                xCor = group.get(k + 1).getYCor();
            }
        }

        if(oneOrTwo == 1){
            xCor = xCor - nwx;
            yCor = yCor - nwy;
            for(int k = 0; k < group.size(); k++){
                strX = group.get(k).getXCor();
                strY = group.get(k).getYCor();
                group.get(k).setXCor(strX - nwx);
                group.get(k).setYCor(strY - nwy);
            }
        } else {
            xCor = xCor + nwx;
            yCor = yCor + nwy;
            for(int k = 0; k < group.size(); k++){
                strX = group.get(k).getXCor();
                strY = group.get(k).getYCor();
                group.get(k).setXCor(strX + nwx);
                group.get(k).setYCor(strY + nwy);
            }
        }
    }

    public void add(Drawable shp){
        group.add(shp);
    }

    public void drawOn(DrawingBoard db){
        for(int k = 0; k < group.size(); k++){
           group.get(k).drawOn(db);
        }
    }


    public boolean within(DrawingBoard db) {
        for(int l = 0; l < group.size(); l++) {
            if (group.get(l).within(db) == false) {
                return false;
            }
        }
        return true;
    }


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

}
