package org.patterns.factory.FactoryMethod;

import static org.patterns.util.Constants.accountantJobMessage;

public class Accountant implements Employee {
    @Override public String doJob() {
        return accountantJobMessage;
    }
}
