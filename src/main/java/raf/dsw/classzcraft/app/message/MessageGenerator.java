package raf.dsw.classzcraft.app.message;

import raf.dsw.classzcraft.app.core.IMessage;
import raf.dsw.classzcraft.app.observer.IPublisher;
import raf.dsw.classzcraft.app.observer.ISubscriber;

import java.util.List;
import java.util.ArrayList;

public class MessageGenerator implements IMessage, IPublisher{
    public List<ISubscriber> subscribers;


    @Override
    public void generisanje(Message poruka){
        notifySubscribers(poruka);
    }

    @Override

    public void addSubscriber(ISubscriber isubscriber){
        if(subscribers==null)
            subscribers=new ArrayList<>();
            if(subscribers.contains(isubscriber))
                return;
            if(isubscriber!=null)
                subscribers.add(isubscriber);
    }




    @Override
    public void removeSubscriber(ISubscriber sub) {

    }

    @Override
    public void notifySubscribers(Object notification) {
        if(notification==null || this.subscribers==null ) //|| this.subsribers.isEmpty()
            return;
        for(ISubscriber sub:subscribers){
            sub.update(notification);
        }
    }
}
