package org.patterns.observer;

public class Follower implements Observer{
    @Override
    public void update() {
        sendPushNotificationToFollower();
    }

    public static void sendPushNotificationToFollower() {
        System.out.println( "Push notification has been  to follower");
    }
}
