import java.util.ArrayList;
public class Drawing {
    protected ArrayList<Drawable> draw;
    public DrawingBoard board2;
    public boolean maybe;

    public Drawing(String filePath){
        board2 = new DrawingBoard(filePath);
        draw = new ArrayList<Drawable>();
    }

    public Drawing(){
        DrawingBoard board2 = new DrawingBoard(1000, 1000);
        draw = new ArrayList<Drawable>();
    }

    public void add(Drawable shp){
        draw.add(shp);
    }

    public boolean within(DrawingBoard db) {
        for(int l = 0; l < draw.size(); l++) {
            if (draw.get(l).within(db) == false) {
                return false;
            }
        }
        return true;
    }

    public void drawOn(DrawingBoard db){
        for(int k = 0; k < draw.size(); k++){
            maybe = draw.get(k).within(db);
            if(maybe == true) {
                draw.get(k).drawOn(db);
            } else{
                System.out.print("out of bounds" + k);
            }
        }

    }

    public void show(){
        board2.setVisible(true);
    }

}
