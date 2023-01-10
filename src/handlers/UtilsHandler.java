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
    public String randomeString() {
        String generatedString = RandomStringUtils.randomAlphabetic(8);
        return(generatedString);
    }
    public String getRandomeEmail = randomeString() + "@gmail.com";
}
