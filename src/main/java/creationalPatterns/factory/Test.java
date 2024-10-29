package creationalPatterns.factory;

public class Test {
    public static void main(String[] args) {
        /*
         * The NotificationFactory class is responsible for creating the Notification object.
         */
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.send();
    }
}
