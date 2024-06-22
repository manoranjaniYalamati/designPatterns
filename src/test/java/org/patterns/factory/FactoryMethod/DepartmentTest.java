package org.patterns.factory.FactoryMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.patterns.util.Constants;

class DepartmentTest {

    @Test
    void shouldCreateCoderInItDepartmentIfCoderTypeIsProvidedToItDepartmentFactory() {
        ItDepartment itDepartment = new ItDepartment();
        Employee coder = itDepartment.createEmployee("coder");

        assertTrue(coder instanceof Coder);
        assertEquals(Constants.coderJobMessage, coder.doJob());
    }

    @Test
    void shouldCreateAuditorInAccountingDepartmentIfAuditorTypeIsProvidedToAccountingDepartmentFactory() {
        AccountingDepartment accountingDepartment = new AccountingDepartment();
        Employee auditor = accountingDepartment.createEmployee("auditor");

        assertTrue(auditor instanceof Auditor);
        assertEquals(Constants.auditorJobMessage, auditor.doJob());
    }

}