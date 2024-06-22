package org.patterns.factory.simple;

public class FormOptionFactory {

    public FormOption create(String type) {
        switch (type) {
            case "dropdown" -> {
                return new Dropdown();
            }
            case "checkbox" -> {
                return new Checkbox();
            }
            case "radioButton" -> {
                return new RadioButton();
            }
            case "textBox" -> {
                return new TextBox();
            }
            default -> {
                return null;
            }
        }
    }
}
