package raf.dsw.classzcraft.app.view;

import raf.dsw.classzcraft.app.controller.ExitAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MyMenyBar extends JMenuBar {

    public MyMenyBar(){
        //file meni

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);//alt f
        fileMenu.add(MainFrame.getInstance().getActionManager().getExit()); //dodavanje akcije exit
        fileMenu.add(MainFrame.getInstance().getActionManager().getNewProjectAction()); //dodavanje akcije newproject
        add(fileMenu); //dodavanje file menija u menubar
        //fileMenu2.add(ea);


        //edit meni

        JMenu fileMenu2 = new JMenu("Edit");//edit meni
        fileMenu2.setMnemonic(KeyEvent.VK_E);//alt e
        fileMenu2.add(MainFrame.getInstance().getActionManager().getAboutUs()); //dodavanje akcije aboutus
        add(fileMenu2); //dodavanje edit menija u menubar
    }

}