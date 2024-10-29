package creationalPatterns.factory;

import creationalPatterns.factory.types.EmailNotification;
import creationalPatterns.factory.types.PushNotification;
import creationalPatterns.factory.types.SmsNotification;

/**
 * NotificationFactory is a factory class that creates Notification objects.
 * We can now add as many new types of notifications as we want without changing the NotificationFactory class.
 */
public class NotificationFactory {

    /**
     * createNotification is a factory method that creates a Notification object based on the type of notification.
     * @param type is the type of notification to be created.
     * @return Notification object based on the type of notification.
     */
    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        } else if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }
        return null;
    }
}
