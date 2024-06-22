package org.patterns.factory.FactoryMethod;

public class ItDepartment extends Department{
    @Override
    public Employee createEmployee(String type) {
        switch (type) {
            case "coder" -> {
                return new Coder();
            }
            case "tester" -> {
                return new Tester();
            }
            default -> {
                return null;
            }
        }
    }
}
