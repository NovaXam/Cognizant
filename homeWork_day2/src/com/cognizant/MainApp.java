package com.cognizant;

import processing.core.PApplet;

public class MainApp extends PApplet {
     public static void main(String [] args) {
         try{
             PApplet.main("MainApp");

         } catch (Exception e) {
             e.getMessage();
         }
     }

    Drawer instance;
     public void setup() {
         background(255);
         instance = new Drawer(this);
     };

     public void setting() {
        size(500, 400);
     };

     public void draw() {
         stroke(74);
         fill(124);
         ellipse(250, 200, 100, 75);
         instance.newShape();
     };
}
