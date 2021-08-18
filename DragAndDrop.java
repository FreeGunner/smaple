package MavenAssignment.MavenAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDrop
{
    WebDriver driver;
    String url="https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop";
    @BeforeClass
    public void before()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get(url);
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	
    }
    @Test
    public void test() throws InterruptedException
    {
//    	System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText());
//    	Thread.sleep(3000);
//    	WebElement fe=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
//    	Thread.sleep(3000);
//    	WebElement te=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
//    	Thread.sleep(3000);
    	Actions action=new Actions(driver);
    	Thread.sleep(3000);
    	action.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"drag1\"]")),driver.findElement(By.xpath("//*[@id=\"div1\"]"))).perform();
    	Thread.sleep(3000);
//    	String s="Dropped!";
//    	String s1=driver.findElement(By.xpath("")).getText();
//    	Assert.assertEquals(s,s1);
    	System.out.println("Dragged successfully");
    	
    }
    @AfterClass
    public void after()
    {
    	//driver.close();
    }
}