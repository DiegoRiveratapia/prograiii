package com.prograiii2020.swing.Service;

import com.prograiii2020.swing.Model.ButtonModel;
import com.prograiii2020.swing.Repository.ButtonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ButtonService implements ButtonServiceInterface {

    private static final String TITLE_BUTTONS = "SAVE;DELETE;CANCEL;LOGIN;LOGOUT;UPDATE";

    @Autowired
    private ButtonRepository buttonRep;


    @Override
    public void saveData() {
        if(buttonRep .count()==0){

            String[] titleButtons = TITLE_BUTTONS.split(";");
            for (String title : titleButtons){
            buttonRep.save(new ButtonModel(title));
            }
        }
    }
    @Override
    public String getRow() {
        ButtonModel bModel = buttonRep.getTitleButton();
        String titleButton = bModel.getTitleButton();
        return titleButton;
    }

    @Override
    public List<ButtonModel> getAllTitleButtons() {
//        List<ButtonModel>allTitles = new ArrayList<ButtonModel>();
//        buttonRep.findAll().forEach(allTitles::add);
//        return allTitles;

        return new ArrayList<ButtonModel>(buttonRep.findAll());
    }


}
