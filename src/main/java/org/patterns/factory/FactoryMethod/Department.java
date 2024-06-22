package org.patterns.factory.FactoryMethod;

public abstract class Department {

    public abstract Employee createEmployee(String type);

    public void fireEmployee() {
        System.out.println("Fired");
    }
}
