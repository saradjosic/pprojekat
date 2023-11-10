package raf.dsw.classzcraft.app.message;

import raf.dsw.classzcraft.app.core.Logger;

public class ConsoleLogger implements Logger {
    @Override
    public void update (Object notification){
        if(notification==null)
            return;
        writeMessage((Message)notification);
    }
    @Override
    public void writeMessage(Message message){
        if(message!=null)
            System.out.println("["+message.getType()+"]["+message.getTimeStamp()+" ]"+message.getMessage());

    }
}
