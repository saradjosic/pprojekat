package raf.dsw.classzcraft.app.core;

import raf.dsw.classzcraft.app.message.Message;
import raf.dsw.classzcraft.app.observer.ISubscriber;

public interface Logger extends ISubscriber {
    public void writeMessage(Message message);
}
