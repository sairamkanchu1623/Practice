package divershefy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditProfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver",
				 "D:\\prasannakumar\\Prasanna_webdriver\\chromedriver.exe");  
		 
     // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
     //Maximize the browser  
    driver.manage().window().maximize();  
       // Launch Web site  
    driver.get("http://staging.divershefy.club/");  
    
     //click login button
    driver.findElement(By.xpath("//a[@class='login']")).click();
    
    //send inputs 
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testuser@mailinator.com");
    driver.findElement(By.id("password")).sendKeys("Welcome#3");
    //click login
    driver.findElement(By.xpath("//button[@type='submit']")).click();
   
    //-----------------Login function completed------------------------------------------//
   //page refresh 
    Thread.sleep(5000);
    driver.navigate().refresh();
   //-----------------------------------------Edit profile Step1---------------------------------
  //click edit button
    driver.findElement(By.xpath("//a[@type='button']")).click();
    Thread.sleep(5000);


    //click step1 Next button
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@onclick='validate_step1()']")).click();
    //----------------------------------Edit profile step1 End-----------------------------------------------------------------
    Thread.sleep(5000);
    driver.findElement(By.xpath("//ul[@id=\"select-options-9436fad2-a8c5-e35f-2755-1ffb40e99442\"]//child::li[1]")).click();
    
    
    Thread.sleep(5000);
    driver.findElement(By.xpath("//ul[@id=\"select-options-9436fad2-a8c5-e35f-2755-1ffb40e99442\"]//child::li[1]")).click();
    
    Thread.sleep(10000);
    driver.findElement(By.xpath("//a[@onclick='validate_step2()']")).click();
	}

}
