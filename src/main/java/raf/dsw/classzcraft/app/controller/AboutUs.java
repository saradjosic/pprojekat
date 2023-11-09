package raf.dsw.classzcraft.app.controller;

import raf.dsw.classzcraft.app.view.AboutUsFrame;

import java.awt.event.ActionEvent;

public class AboutUs extends AbstractClassyAction{
public AboutUs(){
    putValue(NAME,"About us");
    putValue(SHORT_DESCRIPTION,"About us");
}
@Override
    public void actionPerformed(ActionEvent e){
    AboutUsFrame aboutUsFrame=new AboutUsFrame();
}
}
