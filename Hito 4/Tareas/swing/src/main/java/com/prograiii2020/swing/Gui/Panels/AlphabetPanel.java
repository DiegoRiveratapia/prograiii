package com.prograiii2020.swing.Gui.Panels;

import com.prograiii2020.swing.Model.AlphabetModel;
import com.prograiii2020.swing.Model.ButtonModel;
import com.prograiii2020.swing.Repository.AlphabetRepository;
import com.prograiii2020.swing.Service.AlphabetService;
import com.prograiii2020.swing.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.List;

@Component
public class AlphabetPanel extends JPanel {
    @Autowired
    private ButtonService buttonService;
    @Autowired
    private AlphabetService alphabetService;
    @Autowired
    private AlphabetRepository alphabetRepository;

    public AlphabetPanel(){
        this.setPreferredSize(new Dimension(600,400));
        this.setBackground(Color.BLUE);
        this.setLayout(new GridLayout(3,0));
    }
    @PostConstruct
    public void createButtonsLetters(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        List<AlphabetModel> allLetters = alphabetService.getAllLettersFirst();

        allLetters.forEach(alphabetModel ->{

           String[] letterButtons =  alphabetModel.getLetter().split(",");
                for (String letters : letterButtons) {
                    if(letterButtons.length == 10){
                        JButton button = new JButton(letters);
                        button.setPreferredSize(new Dimension(50, 40));
                        mainPanel.add(button);
                    }
                    else
                        {
                            break;
                        }
            }
        });
        this.add(mainPanel);
    }
}
