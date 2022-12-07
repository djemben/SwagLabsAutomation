package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class InventoryPage extends BasePage {

    private @FindBy(className = "shopping_cart_badge")
    WebElement cartBadge;

    private List<WebElement> itemsAvailable;
    private Integer numberOfSelectedItems = 0;

    public InventoryPage() {
        super();
        itemsAvailable = createInventoryItemsList();
    }

    public void addToCartOrRemoveRandomItem() {
        InventoryItemPage inventoryItemPage = new InventoryItemPage(itemsAvailable.get(new Random().nextInt(0, itemsAvailable.size())));
        inventoryItemPage.click();
    }

    private List<WebElement> createInventoryItemsList() {
        return getDriver().findElements(By.className("inventory_item"));
    }
}
