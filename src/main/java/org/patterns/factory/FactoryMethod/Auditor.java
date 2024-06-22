package org.patterns.factory.FactoryMethod;

import static org.patterns.util.Constants.accountantJobMessage;
import static org.patterns.util.Constants.auditorJobMessage;

public class Auditor implements Employee {

    @Override public String doJob() {
        return auditorJobMessage;
    }
}
