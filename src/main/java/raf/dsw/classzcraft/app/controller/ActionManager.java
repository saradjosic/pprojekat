package raf.dsw.classzcraft.app.controller;

public class ActionManager{
//mora za svaku akciju da ima polje i instancu, tako svaki put
    private ExitAction exit;
    private NewProjectAction newProjectAction;
    private AboutUs aboutUs;
    public ActionManager (){
        initActions();

    }
    //da nismo inicijalizovali vratio bi null kad koristimo
    private void initActions(){
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
