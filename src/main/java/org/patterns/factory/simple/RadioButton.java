package org.patterns.factory.simple;

import static org.patterns.util.Constants.checkBoxDisplayMessage;
import static org.patterns.util.Constants.radioButtonDisplayMessage;

public class RadioButton extends FormOption {

    @Override
    String display() {
        return radioButtonDisplayMessage;
    }
}
