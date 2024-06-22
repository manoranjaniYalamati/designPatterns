package org.patterns.factory.simple;

import static org.patterns.util.Constants.checkBoxDisplayMessage;

public class Checkbox extends FormOption{
    @Override
    String display() {
        return checkBoxDisplayMessage;
    }
}
