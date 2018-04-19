package gui;

import java.awt.event.ActionListener;

public interface IView {

    public void setButtonWuerfelnText(String text);

    public void setButtonUmdrehenText(String text);

    public void setButtonWuerfelnActionListener(ActionListener actionlistener);

    public void setButtonUmdrehenActionListener(ActionListener actionlistener);

    public void setLabelText(String text);


}
