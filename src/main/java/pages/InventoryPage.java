package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class InventoryPage extends BasePage {

    public InventoryPage(){
        super();
    }

    //TODO fix it. Now it's sensless
    //dodatkowo zrobic warunki na pustą listę produktów
    public void addToCartOrRemoveRandomItem(){
        List<WebElement> itemsList = createInventoryItemsList();
        itemsList.size();
        InventoryItem inventoryItem = new InventoryItem(itemsList.get(new Random().nextInt(0, itemsList.size())));
        inventoryItem.click();
    }

    private List<WebElement> createInventoryItemsList(){
        return getDriver().findElements(By.className("inventory_item"));
    }
}
