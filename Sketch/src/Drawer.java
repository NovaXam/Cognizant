import processing.core.PApplet;
/**
 * Created by student on 3/7/18.
 */


public class Drawer {
    PApplet p;
    public Drawer(PApplet p) {
        this.p = p;
    };

    public void newShape() {
        p.stroke(34);
        p.fill(255);
        p.rect(p.mouseX, p.mouseY, 100, 150 );
    };

    public void changeColor() {
        p.fill(255, 100, 50);
    }
};

