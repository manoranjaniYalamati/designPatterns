package org.patterns.factory.FactoryMethod;

import static org.patterns.util.Constants.coderJobMessage;

public class Coder implements Employee {


    @Override
    public String doJob() {
        return coderJobMessage;
    }
}
