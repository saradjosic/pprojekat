package raf.dsw.classzcraft.app.controller;

public class ActionManager{
//ovde kada se doda nova akcija je potrebno dodati polje te akcije i kreirati njenu instancu
    private ExitAction exit;
    private NewProjectAction newProjectAction;
    private AboutUs aboutUs;
    public ActionManager (){
        exit=new ExitAction();
        newProjectAction=new NewProjectAction();
        aboutUs=new AboutUs();
    }

    public ExitAction getExit() {
        return exit;
    }

    public void setExit(ExitAction exit) {
        this.exit = exit;
    }

    public NewProjectAction getNewProjectAction() {
        return newProjectAction;
    }

    public void setNewProjectAction(NewProjectAction newProjectAction) {
        this.newProjectAction = newProjectAction;
    }

    public AboutUs getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(AboutUs aboutUs) {
        this.aboutUs = aboutUs;
    }
}
