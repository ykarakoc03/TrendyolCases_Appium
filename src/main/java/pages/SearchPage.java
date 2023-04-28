package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SearchPage {
    ElementHelper elementHelper;

    By title = By.className("android.widget.TextView");
    By normalButton = By.id("");
    By smallButton = By.id("");
    By switchButton = By.id("");

    public SearchPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public String getTitle() {
        return elementHelper.getText(title);
    }

/////////////////////////



}
