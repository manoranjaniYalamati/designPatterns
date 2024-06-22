package org.patterns.factory.FactoryMethod;

public class AccountingDepartment extends Department{
    @Override public Employee createEmployee(String type) {
        switch (type) {
            case "accountant" -> {
                return new Accountant();
            }
            case "auditor" -> {
                return new Auditor();
            }
            default -> {
                return null;
            }
        }
    }
}
