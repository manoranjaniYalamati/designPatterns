package org.patterns.template.web;

import static org.patterns.util.Constants.HOME_PAGE_BODY;
import static org.patterns.util.Constants.HOME_PAGE_FOOTER;
import static org.patterns.util.Constants.PRODUCT_PAGE_BODY;
import static org.patterns.util.Constants.PRODUCT_PAGE_FOOTER;

public class ProductPage extends WebParser{
    @Override
    void renderBody() {
        System.out.println(PRODUCT_PAGE_BODY);
    }

    @Override
    void renderFooter() {
        System.out.println(PRODUCT_PAGE_FOOTER);
    }
}
