package gui;

import model.Model;

import javax.management.modelmbean.ModelMBeanOperationInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Presenter implements Observer {

    private View view;
    private Model model;


    public Presenter() {
        view = new View();
        view.setButtonUmdrehenText("Umdrehen");
        view.setButtonWuerfelnText("Würfeln");
        implementMethods();
        model = new Model();
        model.addObserver(this);
        model.wuerfeln();
    }

    private void implementMethods() {
        view.setButtonUmdrehenActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                umdrehen();
            }
        });
        view.setButtonWuerfelnActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wuerfeln();
            }
        });
    }

    private void wuerfeln() {
        model.wuerfeln();
    }

    private void umdrehen() {
        model.umdreheneWuerfel();
    }

    @Override
    public void update(Observable o, Object arg) {
        view.setLabelText(model.getText());
    }
}
