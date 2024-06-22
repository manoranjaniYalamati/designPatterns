package org.patterns.factory.simple;

import static org.patterns.util.Constants.checkBoxDisplayMessage;
import static org.patterns.util.Constants.textboxDisplayMessage;

public class TextBox extends FormOption {

    @Override
    String display() {
        return textboxDisplayMessage;
    }
}
