package raf.dsw.classzcraft.app.view;


import raf.dsw.classzcraft.app.controller.ExitAction;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyToolBar extends JToolBar {
    public MyToolBar(){
        super(HORIZONTAL);
        setFloatable(false);

       add(MainFrame.getInstance().getActionManager().getExit()); //samo se dodaje tako lagano
       add(MainFrame.getInstance().getActionManager().getNewProjectAction());
       //add je to JToolBar-a
        //moze i this.add ali ne potrebe jer je to tu
    }
}