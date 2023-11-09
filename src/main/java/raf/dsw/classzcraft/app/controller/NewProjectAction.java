package raf.dsw.classzcraft.app.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewProjectAction extends AbstractClassyAction{
    public NewProjectAction() {
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("/slike/img.png"));
        putValue(NAME, "New project");
        putValue(SHORT_DESCRIPTION, "New project");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
System.out.println("novi projekat");

    }
}
