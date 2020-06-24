package com.defensa.Hito4.Gui.Listener;

import com.defensa.Hito4.Gui.Panels.dictionatyPanel;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    @Autowired
    private dictionatyPanel dictionatyPanel;
    @Override
    public void actionPerformed(ActionEvent e) {
        //JTextField word = new JTextField();
        JButton currentButton = (JButton) e.getSource();
        JOptionPane.showMessageDialog(null,"Button Pressed -> "+currentButton.getText());
        //currentButton.getText();


    }

}
