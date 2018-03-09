import processing.core.PApplet;

/**
 * Created by student on 3/7/18.
 */
public class MainApp extends PApplet {
    public static void main(String [] args) {
        PApplet.main("MainApp", args);
    };

    public void settings() {
        size(800, 600);
    };

    public void setup() {
        background(0);
    };

    public void draw() {
        stroke(255);

        fill(mouseX, mouseY, mouseY);
        if (mousePressed) {
//            background(0);
            line(mouseX, mouseY, pmouseX, pmouseY);
        };
    };
}
