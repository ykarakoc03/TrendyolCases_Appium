package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultPage {
    ElementHelper elementHelper;


    By filterIcon = By.xpath("//*[@resource-id='trendyol.com:id/layout_search_filter']/android.widget.ImageView");
    By filterButton = By.id("trendyol.com:id/textViewFilter");
    By orderButton = By.id("trendyol.com:id/layout_search_order");
    By secondProduct = By.id("trendyol.com:id/productCardViewRightProduct");

    public ResultPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkFilterIcon() {
         elementHelper.checkElement(filterIcon);
    }

      public void clickFilterButton() {
         elementHelper.click(filterButton);
    }

 public void clickOrderButton() {
         elementHelper.click(orderButton);
    }

    public void clickSecondProduct() {
        elementHelper.click(secondProduct);
    }


}
