package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.lang3.RandomStringUtils;



public class UtilsHandler {
    WebDriver chromeDriver;


    public String getStringWithLength(int length) {
        return "a".repeat(length);
    }
    public String randomeString(int length) {
        return RandomStringUtils.randomAlphabetic(length);

    }
    public String getRandomeEmail = randomeString(6) + "@gmail.com";
    public String getRandomNumber(int length){
        return RandomStringUtils.randomNumeric(length);
    }
    public String getAlphaNumericValue(int length){
        return RandomStringUtils.randomAlphanumeric(length);
    }
}
