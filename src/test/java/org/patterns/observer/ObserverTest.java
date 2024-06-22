package org.patterns.observer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ObserverTest {

    @Test
    void shouldAddObservers() {
        LinkedInAppNotification linkedInAppNotification = new LinkedInAppNotification();
        Observer followerObserver = new Follower();
        Observer connectionObserver = new ConnectionUser();
        linkedInAppNotification.addObserver(followerObserver);
        linkedInAppNotification.addObserver(connectionObserver);

        Assertions.assertEquals(2, linkedInAppNotification.observers.size());
        Assertions.assertInstanceOf(Follower.class, linkedInAppNotification.observers.get(0));
        Assertions.assertInstanceOf(ConnectionUser.class, linkedInAppNotification.observers.get(1));
    }

    @Test
    void shouldRemoveObservers() {
        LinkedInAppNotification linkedInAppNotification = new LinkedInAppNotification();
        Observer followerObserver = new Follower();
        Observer connectionObserver = new ConnectionUser();
        linkedInAppNotification.addObserver(followerObserver);
        linkedInAppNotification.addObserver(connectionObserver);
        linkedInAppNotification.removeObserver(followerObserver);

        Assertions.assertEquals(1, linkedInAppNotification.observers.size());
        Assertions.assertInstanceOf(ConnectionUser.class, linkedInAppNotification.observers.get(0));
    }

    @Test
    void shouldNotifyObservers() {
        Observer mockFollower = mock(Follower.class);
        Observer mockConnectionUser = mock(ConnectionUser.class);
        LinkedInAppNotification linkedInAppNotification = new LinkedInAppNotification();
        linkedInAppNotification.addObserver(mockFollower);
        linkedInAppNotification.addObserver(mockConnectionUser);
        linkedInAppNotification.notifyObservers();

        Assertions.assertEquals(2, linkedInAppNotification.observers.size());
        Assertions.assertInstanceOf(Follower.class, linkedInAppNotification.observers.get(0));
        Assertions.assertInstanceOf(ConnectionUser.class, linkedInAppNotification.observers.get(1));
        verify(mockFollower).update();
        verify(mockConnectionUser).update();
    }
}
