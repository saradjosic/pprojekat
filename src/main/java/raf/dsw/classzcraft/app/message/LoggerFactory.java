package raf.dsw.classzcraft.app.message;
import raf.dsw.classzcraft.app.core.Logger;
public class LoggerFactory {
    static public Logger createLogger(String type){
        if(type.toUpperCase().equals("CONSOLE"))
            return new ConsoleLogger();
        if(type.toUpperCase().equals("FILE"))
            return new FileLogger();
        return null;//mozda ne treba
    }
}
