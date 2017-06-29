package PackageLegacy;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class AdapterLine  implements Shape {

    Line line;

    public AdapterLine(Line l) {
        line = l;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        //this.draw(x1, y1, x2, y2);
        line.draw(x1, y1, x2, y2);
    }
}