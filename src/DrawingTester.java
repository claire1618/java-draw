//Made by Claire Nicholas
//Reviewed by Helen Ross, 1/29/19

public class DrawingTester {
    public static void main(String[] args) {
/*
        Square sqr1 = new Square(80, 400, 400, Drawable.TEAL);
        boolean maybe1 = sqr1.within(board1);
        if(maybe1 == true){
            sqr1.drawOn(board1);
        }

        Rectangle rec1 = new Rectangle(100, 200, 40, 100, Drawable.ORANGE);
        boolean maybe4 = rec1.within(board1);
        if(maybe4 == true){
            rec1.drawOn(board1);
        }

       RightTriangle rt = new RightTriangle(350, 400, 40, 60, 4, Drawable.BLUE);
        boolean maybe2 = rt.within(board1);
        if(maybe2 == true){
            rt.drawOn(board1);
        }

        LineSegments ln1 = new LineSegments(200, 400, 600, 500, Drawable.LIGHTPURPLE);
        boolean maybe3 = ln1.within(board1);
        if(maybe3 == true){
            ln1.drawOn(board1);
        }

        Diamond dia1 = new Diamond(40, 500, 600, Drawable.GREEN);
        boolean maybe5 = dia1.within(board1);
        if(maybe5 == true){
            dia1.drawOn(board1);
        }

*/
        Drawing draw1 = new Drawing("/Users/clairenicholas/Desktop/stupid.jpg");

        ShapeGroup grp1 = new ShapeGroup();
        grp1.add(new Diamond(50, 50, 50, Drawable.LIME));
        grp1.add(new Rectangle(40, 70, 40, 40, Drawable.YELLOW));
        grp1.add(new Diamond(50, 50, 50, Drawable.GREEN));
        grp1.add(new Square(60, 30, 30, Drawable.TEAL));

        ShapeGroup grp2 = new ShapeGroup();
        grp2.add(new RightTriangle(400, 400, 40, 50, RightTriangle.BOTTOMLEFT, Drawable.PINK));
        grp2.add(new RightTriangle(400, 400, 40, 50, RightTriangle.BOTTOMRIGHT, Drawable.PINK));
        grp2.add(new Square(60, 370, 400, Drawable.DARKRED));
        grp2.add(new Square(15, 380, 410, Drawable.BLACK));
        grp2.add(new Square(15, 405, 410, Drawable.BLACK));
        grp2.add(new Square(10, 408, 413, Drawable.WHITE));
        grp2.add(new Square(10, 383, 413, Drawable.WHITE));
        grp2.add(new LineSegments(387, 410, 387, 425, Drawable.BLACK));
        grp2.add(new LineSegments(413, 410, 413, 425, Drawable.BLACK));
        grp2.add(new LineSegments(380, 417, 395, 417, Drawable.BLACK));
        grp2.add(new LineSegments(405, 417, 420, 417, Drawable.BLACK));


        ShapeGroup grp3 = new ShapeGroup();
        grp3.add(new Circle(40, 300, 300, Drawable.TEAL));



        grp1.add(grp2);
        draw1.add(grp3);
        draw1.drawOn(draw1.board2);

        draw1.show();

    }
}
