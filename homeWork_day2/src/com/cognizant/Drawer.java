package com.cognizant;

import processing.core.PApplet;
/**
 * Created by student on 3/6/18.
 */
public class Drawer {
    PApplet p;
    public Drawer(PApplet p) {
        this.p = p;
    };

    public void newShape() {
        p.stroke(34);
        p.fill(200);
        p.rect(100, 230, 45, 67);
    };
};
