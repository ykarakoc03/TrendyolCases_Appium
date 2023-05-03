package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FilterPage {
    ElementHelper elementHelper;


    By filterItem = By.id("");
    By listProduct = By.id("");

    public FilterPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }
    public void checkFilterItem() {
         elementHelper.getText(filterItem);
    }

     public void clickFilterItem(String button) {
         elementHelper.clickElementWithText(filterItem,button);
    }

      public void clickListProduct() {
         elementHelper.click(listProduct);
    }


    public String getListProduct() {
        return elementHelper.getText(listProduct);
    }

/////////////////////////



}
