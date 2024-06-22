package org.patterns.observer;

public class ConnectionUser implements Observer{

    @Override
    public void update() {
        sendPushNotificationToConnectionUser();
    }

    public static void sendPushNotificationToConnectionUser() {
        System.out.println( "Push notification has been sent to connection");
    }
}
