package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InventoryItem extends BasePage{
    private final static String ITEM_NAME_CLASSNAME = "inventory_item_name";
    private final static String ITEM_ADD_OR_REMOVE_BUTTON_XPATH = "//div[contains(@class,'pricebar')]/button";
    private final static String ITEM_PRICE_CLASSNAME = "inventory_item_price";
    String itemName;
    WebElement addOrRemoveButton;
    Float itemPrice;

    public InventoryItem(WebElement webElement){
        this.itemName = getItemName(webElement);
        this.addOrRemoveButton = webElement.findElement(By.xpath(ITEM_ADD_OR_REMOVE_BUTTON_XPATH));
        this.itemPrice = getItemPrice(webElement);
    }

    public String getItemName(){
        return this.itemName;
    }

    public Float getItemPrice(){
        return this.itemPrice;
    }

    public void click(){
        this.addOrRemoveButton.click();
    }

    private String getItemName(WebElement webElement){
        return webElement.findElement(By.className(ITEM_NAME_CLASSNAME)).getText();
    }

    private Float getItemPrice(WebElement webElement){
        return Float.valueOf(webElement.findElement(By.className(ITEM_PRICE_CLASSNAME)).getText().replace("$",""));
    }
}