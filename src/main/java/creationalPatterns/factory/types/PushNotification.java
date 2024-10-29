package creationalPatterns.factory.types;

import creationalPatterns.factory.Notification;

public class PushNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Sending push notification");
    }
}
