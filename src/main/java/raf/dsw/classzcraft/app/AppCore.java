package raf.dsw.classzcraft.app;

import raf.dsw.classzcraft.app.core.ApplicationFramework;

public class AppCore {
    public static void main(String[] args) {
        ApplicationFramework appCore = ApplicationFramework.getInstance();
        appCore.initialize();
    }
}