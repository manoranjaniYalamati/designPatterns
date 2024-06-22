package org.patterns.template.web;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.patterns.util.Constants.HOME_PAGE_BODY;
import static org.patterns.util.Constants.HOME_PAGE_FOOTER;
import static org.patterns.util.Constants.PRODUCT_PAGE_BODY;
import static org.patterns.util.Constants.PRODUCT_PAGE_FOOTER;
import static org.patterns.util.Constants.WELCOME_MSG;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

@ExtendWith(OutputCaptureExtension.class)
class WebParserTest {

    @Test
    void shouldRenderHomePage(CapturedOutput output) {
        HomePage homePage = new HomePage();

        homePage.loadPage();

        assertEquals(output.getAll(), WELCOME_MSG+"\n"+HOME_PAGE_BODY+"\n"+HOME_PAGE_FOOTER+"\n");
    }

    @Test
    void shouldRenderProductPage(CapturedOutput output) {
        ProductPage productPage = new ProductPage();

        productPage.loadPage();

        assertEquals(output.getAll(), WELCOME_MSG+"\n"+PRODUCT_PAGE_BODY+"\n"+PRODUCT_PAGE_FOOTER+"\n");
    }

}