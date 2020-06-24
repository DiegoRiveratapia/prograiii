package com.defensa.Hito4.Gui.Panels;

import com.defensa.Hito4.Gui.Listener.ButtonListener;
import com.defensa.Hito4.Gui.Util.Util;
import com.defensa.Hito4.Model.AlphabetModel;
import com.defensa.Hito4.Service.AlphabetService;
import com.defensa.Hito4.Service.diccionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

@Component
public class dictionatyPanel  extends JPanel {
    @Autowired
    private AlphabetService alphabetService;

    @Autowired
    private diccionarioService diccionarioService;

    JLabel label = new JLabel();
    JTextField word = new JTextField();
    JLabel label2 = new JLabel();
    JTextField lenguage = new JTextField();
    JLabel label3 = new JLabel();
    JTextField result = new JTextField();

    public dictionatyPanel(){
        System.setProperty("butBackColor","#C1ECF1");
        System.setProperty("panelcolo","#EEEEEE");
        System.setProperty("textColor","#0B0BF6");
        this.setPreferredSize(new Dimension(750,400));
        this.setBackground(Color.getColor("panelcolo"));
        this.setLayout(new GridLayout(5,0));
    }
    @PostConstruct
    public void createButtonsLetters(){
        java.util.List<AlphabetModel> firstRow = alphabetService.getAllLettersFirst();
        this.add(this.createPanelButton(firstRow.get(0).getLetter().split(",")));

        java.util.List<AlphabetModel> secondRow = alphabetService.getAllLettersSecond();
        String[] titleAlphabet1 = secondRow.get(0).getLetter().split(",");
        JPanel panelA_L = this.createPanelButton(titleAlphabet1);
        this.add(panelA_L);

        List<AlphabetModel> threeRow = alphabetService.getAllLettersThree();
        String[] titleAlphabet2 = threeRow.get(0).getLetter().split(",");
        JPanel panelZ_M = this.createPanelButton(titleAlphabet2);
        this.add(panelZ_M);

        JPanel label1 = this.createLabels();
        this.add(label1);
        JPanel Pbuttons = this.createPanelPrincipalButton();
        this.add(Pbuttons);
    }
    public JPanel createPanelButton(String[] titleAlphabet){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        //ButtonListener listener = new ButtonListener();

        for (String title : titleAlphabet) {
            JButton button = new JButton(title);
            button.setPreferredSize(new Dimension(55, 55));
           // button.addActionListener(listener);
            button.setBackground(Color.getColor("butBackColor"));
            button.setForeground(Color.getColor("textColor"));
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setFont(Util.FONT_TEXT_Button);
            mainPanel.add(button);
        }

        return mainPanel;
    }
    public JPanel createLabels(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

//        label.setBounds(5, 39, 120, 23);
        label.setPreferredSize(new Dimension(53,30));
        label.setFont(Util.FONT_TEXT);
        label.setText("WORD:");
        mainPanel.add(label);


        word.setPreferredSize(new Dimension(140,30));
        word.setFont(Util.FONT_TEXT);
        mainPanel.add(word);


//      label.setBounds(5, 39, 120, 23);
        label2.setPreferredSize(new Dimension(90,30));
        label2.setFont(Util.FONT_TEXT);
        label2.setText("LANGUAGE:");
        mainPanel.add(label2);


        lenguage.setPreferredSize(new Dimension(140,30));
        lenguage.setFont(Util.FONT_TEXT);
        mainPanel.add(lenguage);

//      label.setBounds(5, 39, 120, 23);
        label3.setPreferredSize(new Dimension(65,30));
        label3.setFont(Util.FONT_TEXT);
        label3.setText("RESULT:");
        mainPanel.add(label3);


        result.setPreferredSize(new Dimension(140,30));
        result.setFont(Util.FONT_TEXT);
        mainPanel.add(result);

        return mainPanel;
    }

    public JPanel createPanelPrincipalButton(){
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        ButtonListener listener = new ButtonListener();
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(150, 55));
        //button.addActionListener(listener);
        button.setText("TRANSLATE");
        button.setBackground(Color.getColor("butBackColor"));
        button.setForeground(Color.getColor("textColor"));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setFont(Util.FONT_TEXT);
        mainPanel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton button2 = (JButton) actionEvent.getSource();
                String w = word.getText();
                String l = lenguage.getText();

                String t = diccionarioService.traducir(w,l);

                result.setText(t);

            }
        });

        JButton button2 = new JButton();
        button2.setText("CLEAN");
        button2.setPreferredSize(new Dimension(150, 55));
        button2.setBackground(Color.GRAY);
        button2.setForeground(Color.getColor("textColor"));
        button2.setBorder(BorderFactory.createEmptyBorder());
        button2.setFont(Util.FONT_TEXT);
        mainPanel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton button1 = (JButton) actionEvent.getSource();
                String clear = "";
                word.setText(clear);
                lenguage.setText(clear);
                result.setText(clear);
            }
        });

        return mainPanel;
    }
}
