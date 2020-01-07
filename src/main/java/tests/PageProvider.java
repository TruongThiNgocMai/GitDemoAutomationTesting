package tests;

import org.openqa.selenium.support.PageFactory;
import pages.AddSongPage;
import runner.TestRunner;

public class PageProvider {
    private static AddSongPage addSongPage;

    public static AddSongPage getAddSongTest() {
        if (addSongPage == null) {
            addSongPage = PageFactory.initElements(TestRunner.driver, AddSongPage.class);
        }
        return addSongPage;
    }
}
