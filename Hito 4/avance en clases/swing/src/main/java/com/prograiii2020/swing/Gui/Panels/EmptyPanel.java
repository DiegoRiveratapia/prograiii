package com.prograiii2020.swing.Gui.Panels;

import com.prograiii2020.swing.Repository.ButtonRepository;
import com.prograiii2020.swing.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class EmptyPanel extends JPanel {
    public  EmptyPanel(){
        this.setPreferredSize(new Dimension(500,100));
        this.setBackground(Color.GREEN);
        this.setLayout(new GridLayout(2,1));
        //this.setVisible(true);
    }

}
