package raf.dsw.classzcraft.app.core;

import raf.dsw.classzcraft.app.view.MainFrame;


public class ApplicationFramework{
    private static ApplicationFramework instance;
    //buduca polja za model celog projekta
    private ApplicationFramework(){

    }
    public void initialize (){
        MainFrame.getInstance().setVisible(true);
    }
    public static ApplicationFramework getInstance(){
        if(instance==null){
            instance=new ApplicationFramework();
        }
        return instance;
    }


}
