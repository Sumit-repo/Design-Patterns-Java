package creationalPatterns.factory.types;

import creationalPatterns.factory.Notification;

public class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending email notification");
    }
}
