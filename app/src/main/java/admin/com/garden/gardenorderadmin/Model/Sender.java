package admin.com.garden.gardenorderadmin.Model;

/**
 * Created by Faggot on 11/26/2017.
 */

public class Sender {
    public String to;
    public Notification  notification;

    public Sender(String to, Notification notification) {
        this.to = to;
        this.notification = notification;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }
}
