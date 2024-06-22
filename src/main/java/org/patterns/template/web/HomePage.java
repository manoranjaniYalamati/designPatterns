package org.patterns.template.web;

import static org.patterns.util.Constants.HOME_PAGE_BODY;
import static org.patterns.util.Constants.HOME_PAGE_FOOTER;

public class HomePage extends WebParser{
    @Override
    void renderBody() {
        System.out.println(HOME_PAGE_BODY);
    }

    @Override
    void renderFooter() {
        System.out.println(HOME_PAGE_FOOTER);
    }
}
