package io.codeforall.gamejam.dokidokibootcamp.scenes;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

import java.awt.*;

public class NameText {

    Text name;

    public NameText(String message) {
        this.name = new Text(480, 720, message, Font.MONOSPACED, Font.ITALIC, 30);
        name.setColor(Color.BLACK);
        name.draw();

    }

    public Text getName() {
        return name;
    }

    public void setName(String s) {
        name.draw();
        name.setText(s);
    }

    /*public static String SlowPrint(String s) {
        for (int i=0; i<s.length();i++) {
            char c = s.charAt(i);



        }
    } */

}
