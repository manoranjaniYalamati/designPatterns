package org.patterns.factory.simple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.patterns.util.Constants;

class FormOptionFactoryTest {

    @Test
    void shouldCreateRadioButtonAndDisplayWhenRadioButtonTypeIsProvided() {
        FormOptionFactory formOptionFactory = new FormOptionFactory();
        FormOption radioButton = formOptionFactory.create("radioButton");
        assertTrue(radioButton instanceof RadioButton);
        assertEquals(Constants.radioButtonDisplayMessage, radioButton.display());
    }

    @Test
    void shouldCreateCheckBoxAndDisplayWhenCheckBoxTypeIsProvided() {
        FormOptionFactory formOptionFactory = new FormOptionFactory();
        FormOption checkBox = formOptionFactory.create("checkbox");
        assertTrue(checkBox instanceof Checkbox);
        assertEquals(Constants.checkBoxDisplayMessage, checkBox.display());
    }

}