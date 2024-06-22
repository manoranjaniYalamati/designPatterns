package org.patterns.factory.simple;

import static org.patterns.util.Constants.checkBoxDisplayMessage;
import static org.patterns.util.Constants.dropdownDisplayMessage;

public class Dropdown extends FormOption {

    @Override
    String display() {
        return dropdownDisplayMessage;
    }
}
