package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class IssuePage extends BasePage {
    private final String NEW_ISSUE_BUTTON = "//a[contains(@href,'issues/new')]";
    private final String TEMPLATE = "//li[contains(@class,'templateItemContainer')]";

    public IssuePage(WebDriver driver) {
        super(driver);
    }

    public WebElement newIssueButton() {
        waiter.waitForVisibility(By.xpath(NEW_ISSUE_BUTTON));
        return driver.findElement(By.xpath(NEW_ISSUE_BUTTON));
    }

    public List<WebElement> template() {
        return driver.findElements(By.xpath(TEMPLATE));
    }
}
