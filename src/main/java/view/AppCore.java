package view;


import core.ApplicationFramework;
/*
public class AppCore{

    public static void main(String[] args) {


                   MainFrame frame1 = new MainFrame();
                    frame1.setVisible(true);

    }
}
*/public class AppCore {
    public static void main(String[] args) {
        ApplicationFramework appCore = ApplicationFramework.getInstance();
        appCore.initialize();
    }
}