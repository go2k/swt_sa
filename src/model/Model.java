package model;

import java.util.Observable;
import java.util.Random;

public class Model extends Observable implements IModel {

    private Random random;
    private String text;
    private int wuerfel1;
    private int wuerfel2;


    public Model() {
        // Zufallsgenerator
        random = new Random();
    }

    @Override
    public void wuerfeln() {

        wuerfel1 = random.nextInt(6) + 1;
        wuerfel2 = random.nextInt(6) + 1;
        setText();
    }

    @Override
    public String getText() {
        return text;
    }


    @Override
    public void umdreheneWuerfel() {
        wuerfel1 = 7 - wuerfel1;
        wuerfel2 = 7 - wuerfel2;
        setText();
    }

    @Override
    public String getButtonWuerfelnText() {
        return "Würfeln";
    }

    @Override
    public String getButtonUmdrehenText() {
        return "Umdrehen";

    }

    private void setText() {
        text = "<html><body><ul>"
                + "<li>Würfel 1: " + wuerfel1 + "</li>"
                + "<li>Würfel 2:  " + wuerfel2 + "</li>"
                + "<li>Augensumme: " + (wuerfel1 + wuerfel2) + "</li>"
                + "</ul></body></html>";
        this.setChanged();
        this.notifyObservers();
    }

}
