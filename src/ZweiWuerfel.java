
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ZweiWuerfel extends JFrame {

    // Attribute fuer Layout
    private JButton buttonWuerfeln;
    private JButton buttonUmdrehen;
    private JLabel label;

    // Sonstige Attribute
    private int zahl1;
    private int zahl2;
    private Random random;

    // Konstruktor
    public ZweiWuerfel() {
        // Zufallsgenerator
        random = new Random();

        // Layout und sonstige Fenstereigenschaften
        label = new JLabel("");
        label.setHorizontalAlignment(JLabel.CENTER);
        buttonWuerfeln = new JButton("Würfeln");
        buttonUmdrehen = new JButton("Umdrehen");

        add(buttonWuerfeln, BorderLayout.NORTH);
        add(label);
        add(buttonUmdrehen, BorderLayout.SOUTH);

        setSize(320, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // erstes mal wuerfeln und ausgeben        
        zahl1 = random.nextInt(6) + 1;
        zahl2 = random.nextInt(6) + 1;
        label.setText("<html><body><ul>"
                + "<li>Würfel 1: " + zahl1 + "</li>"
                + "<li>Würfel 2:  " + zahl2 + "</li>"
                + "<li>Augensumme: " + (zahl1 + zahl2) + "</li>"
                + "</ul></body></html>");

        // Events
        buttonWuerfeln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zahl1 = random.nextInt(6) + 1;
                zahl2 = random.nextInt(6) + 1;
                label.setText("<html><body><ul>"
                        + "<li>Würfel 1: " + zahl1 + "</li>"
                        + "<li>Würfel 2:  " + zahl2 + "</li>"
                        + "<li>Augensumme: " + (zahl1 + zahl2) + "</li>"
                        + "</ul></body></html>");
            }
        });
        buttonUmdrehen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zahl1 = 7 - zahl1;
                zahl2 = 7 - zahl2;
                label.setText("<html><body><ul>"
                        + "<li>Würfel 1: " + zahl1 + "</li>"
                        + "<li>Würfel 2:  " + zahl2 + "</li>"
                        + "<li>Augensumme: " + (zahl1 + zahl2) + "</li>"
                        + "</ul></body></html>");
            }
        });
    }
    
    // Main
   // public static void main(String[] args) {
        // new ZweiWuerfel();
   // }
}
