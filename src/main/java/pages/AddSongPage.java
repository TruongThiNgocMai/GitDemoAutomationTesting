package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddSongPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id=\"search\"]")
    WebElement inputSearch;

    @FindBy(xpath = "//*[@id=\"search-icon-legacy\"]")
    WebElement searchBtn;

    public void setInformation(String inputSearchSong) throws InterruptedException {
//        this.inputSearch.clear();
        Thread.sleep(2000);
        this.inputSearch.sendKeys(inputSearchSong);
        Thread.sleep(3000);
    }

    public void clickSearchBtn() throws InterruptedException {
        Thread.sleep(2000);
        searchBtn.click();
    }
}
