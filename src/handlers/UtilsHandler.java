package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class UtilsHandler {
    WebDriver chromeDriver;


    public String getStringWithLength(int length) {
        return "a".repeat(length);
    }


}
