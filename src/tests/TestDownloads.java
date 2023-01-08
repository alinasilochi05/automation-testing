package tests;

import pages.DownloadsPage;

public class TestDownloads extends TestBase{
    DownloadsPage downloadsPage;
    public TestDownloads(){
        this.downloadsPage = new DownloadsPage(chromeDriver);
    }
}
