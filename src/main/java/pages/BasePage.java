package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void PageBase(WebDriver driver){

    }
    public void type(WebElement element, String text){
        if(text!=null){
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }
    public void pause(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }



}
