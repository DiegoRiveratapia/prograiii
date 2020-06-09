package com.defensa.Hito4.Gui.Util;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

@Component
public class Util {
//    public static final ImageIcon SUCCESS_IMAGE = new ImageIcon(getResourcePath("Images/success.jpg"));
//    public static final ImageIcon FAILED_IMAGE = new ImageIcon(getResourcePath("Images/failed.jpg"));
    public static final Font FONT_TEXT_Button = new Font("Arial",Font.BOLD,28);
    public static final Font FONT_TEXT = new Font("Arial",Font.BOLD,15);

    private static URL getResourcePath(String nameImage) {
        return Util.class.getClassLoader().getResource(nameImage);
    }
    public Util(){}
}
