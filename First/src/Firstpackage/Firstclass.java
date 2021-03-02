package Firstpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstclass {
	WebDriver driver;

	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/STUTI/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

	}

	public void search() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Dress");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();

	}

	public void changecurrency() {

		driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']")).click();
		driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]")).click();
		driver.findElement(By.id("icp-sc-dropdown_2")).click();
		driver.findElement(By.id("icp-btn-save")).click();
	}

	public void sorting() {

		// drop down
		Select s = new Select(driver.findElement(By.id("s-result-sort-select")));
		s.selectByIndex(3);
	}

	public void scrollDown() throws InterruptedException {
		// scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 170)");
		// scroll up
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, -150)");
	}

	public void filter() {
		// checkbox
		driver.findElement(By.xpath("//li[@id='p_n_feature_three_browse-bin/12457477011']/following-sibling::li[2]")).click();

	}

	public void addToCart() throws InterruptedException {
		driver.findElement(
				By.xpath("//*[@id=\"search\"]/div/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/span/a/div/img")).click();
		// selecting size
		Thread.sleep(500);
		Select s = new Select(driver.findElement(By.name("dropdown_selected_size_name")));
		s.selectByIndex(3);
		// selecting color
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id=\"variation_color_name\"]/ul/li[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	}

	public static void main(String[] args) throws InterruptedException {

	}

}
