package lab4_angelvasquez_jasonderas;

import java.awt.Color;

public class Valinfo extends Exception {

    private Color c;

    public Valinfo() {
        super();
    }

    public Valinfo(Color c, String string) {
        super(string);
        this.c = c;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Valinfo{" + "c=" + c + '}';
    }

}
