package PackageLegacy;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {  new AdapterLine(new Line()), new AdapterRectangle(new Rectangle()) };
        // A begin and end point from a graphical editor
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (int i = 0; i < shapes.length; ++i){
            shapes[i].draw(x1, y1, x2, y2);
        }
    }
}