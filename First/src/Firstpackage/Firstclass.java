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

	/*
	 * public void scrollDown() throws InterruptedException { // scroll down
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("window.scrollBy(0, 170)"); }
	 */

	public void addToCart() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']//span[text()='XSWPL Gorgeous Heavy Beaded Organza Quinceanera Dresses for Sweet 16 Ball Gowns']")).click();
		// selecting size
		Thread.sleep(500);
		Select s = new Select(driver.findElement(By.name("dropdown_selected_size_name")));
		s.selectByIndex(3);
		// selecting color
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id=\"variation_color_name\"]/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

	}

	public static void main(String[] args) throws InterruptedException {

	}

}
