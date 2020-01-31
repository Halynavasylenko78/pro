package com.it.pages;

import com.it.driver.MyDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    static protected MyDriver driver = MyDriver.getMyDriver();



    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
