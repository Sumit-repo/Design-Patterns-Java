package creationalPatterns.factory.types;

import creationalPatterns.factory.Notification;

public class SmsNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS notification");
    }
}
