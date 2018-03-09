import processing.core.PApplet;

public class MainApp extends PApplet {
    Drawer instance;

    public static void main(String[] args) {
        PApplet.main("MainApp", args);
    }

    public void settings() {
        size(600, 400);
    };

    public void setup() {
        background(10, 10, 10);
        instance = new Drawer(this);
    };

    public void draw() {
        stroke( 140, 90, 76);
        fill(255);
        background(0);
        ellipse(mouseX, mouseY, 100, 75);
        if (mousePressed) {
            instance.newShape();
            instance.changeColor();
        }
    };
}