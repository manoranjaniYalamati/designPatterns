package org.patterns.template.web;

import static org.patterns.util.Constants.WELCOME_MSG;

abstract class WebParser {

    public final void loadPage() {
        renderHeader();
        renderBody();
        renderFooter();
    }

    abstract void renderBody();
    abstract void renderFooter();

    private void renderHeader() {
        System.out.println(WELCOME_MSG);
    }
}
