package org.patterns.factory.FactoryMethod;

import org.patterns.util.Constants;

public class Tester implements Employee {
    @Override public String doJob() {
        return Constants.testerJobMessage;
    }
}
