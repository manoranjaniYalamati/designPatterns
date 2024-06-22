package org.patterns.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.patterns.util.Constants;

class CommandTest {

    @Test
    void shouldOnLight() {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        RemoteControlWithUndo remoteControlWithUndo= new RemoteControlWithUndo(lightOnCommand);

        String commandResult = remoteControlWithUndo.onOrOffbuttonWasPressed();

        Assertions.assertEquals(Constants.lightOnMessage, commandResult);
    }

    @Test
    void shouldUndoLightOn() {
        Light light = new Light();
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo(lightOffCommand);

        remoteControlWithUndo.onOrOffbuttonWasPressed();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControlWithUndo = new RemoteControlWithUndo(lightOnCommand);
        remoteControlWithUndo.onOrOffbuttonWasPressed();

        String commandResult = remoteControlWithUndo.undoButtonPressed();

        Assertions.assertEquals(Constants.lightOffMessage, commandResult);
    }

    @Test
    void shouldOnCeilingFanAtMediumSpeed() {
        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        RemoteControlWithUndo remoteControlWithUndo =
            new RemoteControlWithUndo(ceilingFanMediumCommand);

        String commandResult = remoteControlWithUndo.onOrOffbuttonWasPressed();

        Assertions.assertEquals(Constants.MEDIUM, commandResult);
    }

    @Test
    void shouldUndoCeilingFanSpeedToHigh() {
        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        RemoteControlWithUndo remoteControlWithUndo =
            new RemoteControlWithUndo(ceilingFanHighCommand);

        remoteControlWithUndo.onOrOffbuttonWasPressed();

        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        remoteControlWithUndo = new RemoteControlWithUndo(ceilingFanOffCommand);

        remoteControlWithUndo.onOrOffbuttonWasPressed();
        String commandResult = remoteControlWithUndo.undoButtonPressed();

        Assertions.assertEquals(Constants.HIGH, commandResult);
    }

    @Test
    void shouldNotDoAnythingByDefaultIfNoCommandIsPresent() {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Assertions.assertNull(remoteControlWithUndo.onOrOffbuttonWasPressed());
        Assertions.assertNull(remoteControlWithUndo.undoButtonPressed());
    }

}