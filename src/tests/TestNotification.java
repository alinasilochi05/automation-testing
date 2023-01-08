package tests;

import pages.NotificationPage;

public class TestNotification extends TestBase{
    NotificationPage notificationPage;
    public TestNotification(){
        super();
        this.notificationPage = new NotificationPage(chromeDriver);
    }
}
