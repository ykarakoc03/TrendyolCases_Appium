package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class BasketPage {
    ElementHelper elementHelper;

    By title = By.className("");
    By producName = By.id("");
    By deleteButton = By.id("");
    By deletePopupButton = By.id("");

    public BasketPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkTitle() {
         elementHelper.checkElement(title);
    }

    public String getProductName() {
        return elementHelper.getText(producName);
    }

    public void clickDeleteButton() {
        elementHelper.checkElement(deleteButton);
    }

 public void clickPopupDeleteButton() {
        elementHelper.checkElement(deletePopupButton);
    }

    public String getEmptyMessage() {
        return elementHelper.getText(emptyButton);
    }

}
