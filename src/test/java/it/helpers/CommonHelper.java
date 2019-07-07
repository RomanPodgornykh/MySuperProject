package it.helpers;

import it.pages.BasePage;

public class CommonHelper extends BasePage {
    public void stopApp(){
        driver.quit();
    }
}
