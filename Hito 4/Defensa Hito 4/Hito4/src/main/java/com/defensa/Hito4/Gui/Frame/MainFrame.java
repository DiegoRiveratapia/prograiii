package com.defensa.Hito4.Gui.Frame;


import com.defensa.Hito4.Gui.Panels.dictionatyPanel;
import com.defensa.Hito4.Gui.Util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {

    @Autowired
    private dictionatyPanel dictionatyPanel;


    public MainFrame(){
        this.setTitle("Defensa Hito4 Progra III");
        this.setBounds(300, 200, 700,500);
        this.setBackground(Color.gray);
        this.setLayout(new GridLayout(1,0));
        this.setResizable(false);

    }
    @PostConstruct
    public void crateMainFrame(){
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout());

        addPanels(container);

        this.add(container);
        this.setVisible(true);
    }
    public void addPanels(JPanel container){
        container.add(dictionatyPanel);
//        container.add(panelImages);
//        container.add(emptyPanel);
    }
}
