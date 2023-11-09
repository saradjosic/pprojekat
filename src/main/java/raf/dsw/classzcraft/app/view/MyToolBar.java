package raf.dsw.classzcraft.app.view;


import raf.dsw.classzcraft.app.controller.ExitAction;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyToolBar extends JToolBar {
    public MyToolBar(){
        super(HORIZONTAL);
        setFloatable(false);

       add(MainFrame.getInstance().getActionManager().getExit());
       add(MainFrame.getInstance().getActionManager().getNewProjectAction());
    }
}