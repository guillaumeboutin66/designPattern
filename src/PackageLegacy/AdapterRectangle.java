package PackageLegacy;

/**
 * Created by guillaumeboutin on 15/06/2017.
 */
public class AdapterRectangle implements Shape {
    Rectangle rect;

    public AdapterRectangle(Rectangle r) {
        rect = r;
    }

    @Override
    public void draw(int x, int y, int w, int h) {
        //this.draw(Math.min(x, w), Math.min(y, h), Math.abs(w - x), Math.abs(h - y));
        rect.draw(x,y,w,h);
    }
}
