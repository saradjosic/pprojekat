package view;
/*
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainFrame extends JFrame {
private static MainFrame instance;
    private MainFrame(){}


    private void initialize() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        // Podesavamo dimenzije prozora na polovinu dimenzija ekrana
        setSize(screenWidth / 2, screenHeight / 2);
        //Podesavamo naslov
        setTitle("ClassyCrafT");
        //Postavljamo akciju pri zatvaranju prozora
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //postavljamo JFrame na centar ekrana
        setLocationRelativeTo(null);

        //kreiramo jedan panel i dodajemo ga u JFrame
        JPanel panel=new JPanel();
        panel.setBackground(Color.WHITE);
        this.add(panel);
        //kreiramo prvo dugme i dodajemo ga u panel
       // JButton btn=new JButton("JButton 1");
      //  panel.add(btn);


    }

    public static MainFrame getInstance() {
        return instance;
    }

    public static void setInstance(MainFrame instance) {
        MainFrame.instance = instance;
    }
}*/


import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static MainFrame instance;

    //buduca polja za sve komponente view-a na glavnom prozoru

    private MainFrame(){

    }

    private void initialize(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ClassyCrafT");

        MyMenyBar menu = new MyMenyBar();
        setJMenuBar(menu);

        MyToolBar toolBar = new MyToolBar();
        add(toolBar, BorderLayout.NORTH);
    }

    public static MainFrame getInstance()
    {
        if(instance == null)
        {
            instance = new MainFrame();
            instance.initialize();
        }
        return instance;
    }
}