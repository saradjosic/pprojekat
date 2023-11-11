
package raf.dsw.classzcraft.app.view;


import raf.dsw.classzcraft.app.controller.ActionManager;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static MainFrame instance;
    //buduca polja za sve komponente view-a na glavnom prozoru
    //mora da ima polje actionManagera da bi moglo da se pristupi u ToolBaru i tako to
    private ActionManager actionManager;


    private MainFrame(){

    }
///sdsff
    private void initialize(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ClassyCrafT");

        actionManager=new ActionManager();

        MyMenyBar menu = new MyMenyBar();
        setJMenuBar(menu);

        MyToolBar toolBar = new MyToolBar();
        add(toolBar, BorderLayout.NORTH);


        //panel za stablo
        JPanel desktop=new JPanel();
        desktop.setBackground(Color.WHITE);
        JPanel levo=new JPanel();
        levo.setBackground(Color.WHITE);

        JSplitPane splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,levo,desktop);
        getContentPane().add(splitPane,BorderLayout.CENTER);
        splitPane.setDividerLocation(250);
        splitPane.setOneTouchExpandable(true);
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

    //public static void setInstance(MainFrame instance) {
    //    MainFrame.instance = instance;
   // }

    public static void setInstance(MainFrame instance) {
        MainFrame.instance = instance;
    }

    public ActionManager getActionManager() {
        return actionManager;
    }

    public void setActionManager(ActionManager actionManager) {
        this.actionManager = actionManager;
    }

}