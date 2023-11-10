package raf.dsw.classzcraft.app.message;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    String message;
    MessageType type;
    String timeStamp;
    DateTimeFormatter date=DateTimeFormatter.ofPattern("dd.MM.yyyy.HH:mm");
    LocalDateTime time=LocalDateTime.now();
    public Message(String message,MessageType type, String timeStamp){
        this.message=message;
        this.type=type;
        this.timeStamp=date.format(time);

    }
    //System.out.println().Message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public DateTimeFormatter getDate() {
        return date;
    }

    public void setDate(DateTimeFormatter date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
