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
   //country code drop down click
    driver.findElement(By.xpath("//div[@id='dial_code_box']//option[@value='91']")).click();
   //clear and enter phone number 
    driver.findElement(By.xpath("//input[@id='phone_number']")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("7893126861");
  //state drop down click
    Thread.sleep(5000);
     driver.findElement(By.xpath("//select[@id='region']//option[@value='4017']")).click();
    // city drop down click
    Thread.sleep(5000);
     driver.findElement(By.xpath("//select[@id='city']//option[@value='57658']")).click();
     //experience drop down click
     Thread.sleep(5000);
     driver.findElement(By.xpath("//select[@id='experience']//option[@value='20-25']")).click();
     //leadership drop down click
     Thread.sleep(5000);
     driver.findElement(By.xpath("//select[@id='leadership']//option[@value='10-15']")).click();
  //clear and enter company name field
    driver.findElement(By.xpath("//input[@id='company_name']")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("Divershefy Clubs");
    //clear and enter title field
    driver.findElement(By.xpath("//input[@id='job_title']")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("Test Engineer");
    //clear and enter sector field
    driver.findElement(By.xpath("//input[@id='sector']")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@id='sector']")).sendKeys("IT,Tester");
    //clear and enter profile description field
    driver.findElement(By.xpath("//textarea[@id='profile_description']")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//textarea[@id='profile_description']")).sendKeys("Iam a good Software Engineer");
    //clear and enter career achievement field
    driver.findElement(By.xpath("//textarea[@id='career_achievement']")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//textarea[@id='career_achievement']")).sendKeys("Software Engineer certificate");
    //clear and enter exper_in field
    driver.findElement(By.xpath("//textarea[@id='expert_in']")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//textarea[@id='expert_in']")).sendKeys("Coding");
    //click step1 Next button
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@onclick='validate_step1()']")).click();
    //----------------------------------Edit profile step1 End-----------------------------------------------------------------
    
    Thread.sleep(10000);
    driver.findElement(By.xpath("//a[@onclick='validate_step2()']")).click();
	}

}
