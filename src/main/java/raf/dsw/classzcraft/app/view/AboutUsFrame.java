package raf.dsw.classzcraft.app.view;



import javax.swing.*;
import java.awt.*;

public class AboutUsFrame extends JFrame{
    public AboutUsFrame(){
        initialize();
    }
    private void initialize(){
        //prozor
        setTitle("AboutUs");
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        //ispod se nalazi kod za prikazivanje slike i imena
        JPanel vbox=new JPanel();
        vbox.setLayout(new BoxLayout(vbox,BoxLayout.Y_AXIS));

        //pavle
        JPanel hbox1=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel paja=new JLabel(MainFrame.getInstance().getActionManager().getAboutUs().loadPicture("/slike/img_1.png",200,200));
        hbox1.add(paja);
        hbox1.add(new JLabel("Pavle Milic RI 187/22"));

        //sara
        JPanel hbox2=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel saki=new JLabel(MainFrame.getInstance().getActionManager().getAboutUs().loadPicture("/slike/img_2.png",200,200));
        hbox1.add(saki);
        hbox1.add(new JLabel("Sara Djosic RN 71/22"));

        //spajanje
        vbox.add(hbox1);
        vbox.add(hbox2);
        add(vbox);
        setVisible(true);
    }


}
