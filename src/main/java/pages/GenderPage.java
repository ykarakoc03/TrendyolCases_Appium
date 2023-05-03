package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class GenderPage {
    ElementHelper elementHelper;

    By gender = By.className("android.widget.Button");


    public GenderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkGenderButton(String genderText) {
        elementHelper.checkElementWithText(gender,genderText);
    }

 public void clickGenderBUtton(String genderText) {
        elementHelper.clickElementWithText(gender,genderText);
    }




}
