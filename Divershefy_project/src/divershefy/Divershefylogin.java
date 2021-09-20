package divershefy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Divershefylogin {

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
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shireen@geekbull.in");
    driver.findElement(By.id("password")).sendKeys("DC@16abcd");
    //click login
    driver.findElement(By.xpath("//button[@type='submit']")).click();
   
      //-----------------Login function completed------------------------------------------//
   //page refresh 
    Thread.sleep(5000);
    driver.navigate().refresh();
    
    //click to SME section
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@class='active']")).click();
    Thread.sleep(5000);
    
    //click Club member button
    driver.findElement(By.xpath("//a[@class='sme-view-profile-text-color' and@href='http://staging.divershefy.club/individual/search']")).click();
    Thread.sleep(5000);
    driver.navigate().back();
    //click My circle button
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@class='sme-view-profile-text-color' and@href='http://staging.divershefy.club/individual/circles']")).click();
    Thread.sleep(5000);
    driver.navigate().back();
    //click SEE all button
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@id='sme-see-all-btn']")).click();
   
   //click pencil icon
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/a/i")).click();
   Thread.sleep(5000);
   //Upload image
   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/div[2]/div[1]/div/form/div/div[1]/div[1]/div/div/input")).sendKeys("C:\\Users\\admin\\Desktop\\Image_on bugs\\logo.PNG");
   
   //clear data for text box
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/div[2]/div[1]/div/form/div/div[2]/div[1]/input[2]")).clear();
  
   //Enter new data for test box
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/div[2]/div[1]/div/form/div/div[2]/div[1]/input[2]")).sendKeys("Test groups");
   
   //click submit
   Thread.sleep(5000);
   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div/div[2]/div[3]/a")).click();
   
   //refresh the page
   Thread.sleep(5000);
   driver.navigate().refresh();
   
   //navigate to SME and refresh page
   Thread.sleep(5000);
   driver.navigate().back();
    driver.navigate().refresh();
//   
//   
//   //create SME group
//   driver.findElement(By.xpath("//a[@id='sme-group-button']")).click();
//   //create SME section and Send inputs to that page
//   //Upload image
//   driver.findElement(By.xpath("//input[@id='create_group_file']")).sendKeys("C:\\Users\\admin\\Desktop\\Image_on bugs\\logo.PNG");
//   //Send inputs to the text boxes
//   driver.findElement(By.xpath("//input[@id='input_text']")).sendKeys("Honda");
//   driver.findElement(By.id("text_area")).sendKeys("It is a  company ");
//   driver.findElement(By.id("add_expertise_input")).sendKeys("Develop");
//   
//   //click the + icon
//   driver.findElement(By.id("btnGroupAddon")).click();
//   
//   Thread.sleep(5000);
//   driver.findElement(By.id("create_group_form_button")).click();
   
     //click search SME
     driver.findElement(By.xpath("//div[@class='sme-mt20']//a[@class='sme-button-group btn']")).click();
     driver.navigate().refresh();
     //filter group name 
     driver.findElement(By.id("group_name_filter")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//select[@id='group_name_filter']//option[@value='41']")).click();
     //reset all
     Thread.sleep(5000);
     driver.findElement(By.xpath("//a[@href='http://staging.divershefy.club/individual/sme-group-search']")).click();
   //click to SME section
     Thread.sleep(5000);
     driver.findElement(By.xpath("//a[@class='active']")).click();    
     
     Thread.sleep(5000);
     driver.findElement(By.xpath("//div[@class='sme-pl16 col s12 m9']//div[@class='sme-your-group']//a[@href='http://staging.divershefy.club/individual/sme-group/7DZyny7E34']")).click();
     driver.navigate().back();
	}

}
