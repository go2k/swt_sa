package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame implements IView {

    // Attribute fuer Layout
    private JButton buttonWuerfeln;
    private JButton buttonUmdrehen;
    private JLabel label;

    public View() {

        // Layout und sonstige Fenstereigenschaften
        label = new JLabel("");
        label.setHorizontalAlignment(JLabel.CENTER);
        buttonWuerfeln = new JButton();
        buttonUmdrehen = new JButton();

        add(buttonWuerfeln, BorderLayout.NORTH);
        add(label);
        add(buttonUmdrehen, BorderLayout.SOUTH);

        setSize(320, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void setButtonWuerfelnText(String text) {
        buttonWuerfeln.setText(text);
    }

    @Override
    public void setButtonUmdrehenText(String text) {
        buttonUmdrehen.setText(text);
    }

    @Override
    public void setButtonWuerfelnActionListener(ActionListener actionlistener) {
        buttonWuerfeln.addActionListener(actionlistener);
    }

    @Override
    public void setButtonUmdrehenActionListener(ActionListener actionlistener) {
        buttonUmdrehen.addActionListener(actionlistener);
    }

    @Override
    public void setLabelText(String text) {
        label.setText(text);
    }
}
