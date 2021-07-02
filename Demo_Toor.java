package DemoToor_website;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_Toor 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sai\\Desktop\\Selenium jar\\geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		//Find A Flight
		
		w.findElement(By.name("userName")).sendKeys("test");
		w.findElement(By.name("password")).sendKeys("test");
		w.findElement(By.name("submit")).click();
		
		System.out.println(w.findElement(By.xpath("//tbody//tr//td//h3")).getText());
		System.out.println(w.findElement(By.xpath("//b[contains(text(),'Thank you for Loggin.')]")).getText());
		
		//Sign-Off
		
		w.findElement(By.linkText("SIGN-OFF")).click();
		
		//Sign-On
		
		w.findElement(By.linkText("SIGN-ON")).click();
		w.findElement(By.name("userName")).sendKeys("test");
		w.findElement(By.name("password")).sendKeys("test");
		w.findElement(By.name("submit")).click();
		w.navigate().back();
		w.navigate().back();
		
		//Register
		
		w.findElement(By.linkText("REGISTER")).click();
		w.findElement(By.name("firstName")).sendKeys("Shivangi");
		w.findElement(By.name("lastName")).sendKeys("Tribhuvan");
		w.findElement(By.name("phone")).sendKeys("9092000340");
		w.findElement(By.id("userName")).sendKeys("shivangi@gmail.com");
		
		w.findElement(By.name("address1")).sendKeys("Niwara Nagari");
		w.findElement(By.name("city")).sendKeys("Pune");
		w.findElement(By.name("state")).sendKeys("Maharashtra");
		w.findElement(By.name("postalCode")).sendKeys("12345");
		
        Select s=new Select(w.findElement(By.name("country")));
		
		s.selectByVisibleText("AUSTRIA");

		w.findElement(By.id("email")).sendKeys("admin");
		w.findElement(By.name("password")).sendKeys("admin12");
		w.findElement(By.name("confirmPassword")).sendKeys("admin12");
		w.findElement(By.name("submit")).click();
		
		String Text=w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		System.out.println(Text);
		
		//Support
		
		w.findElement(By.linkText("SUPPORT")).click();
		w.findElement(By.xpath("//tbody/tr[4]/td[1]/a[1]/img[1]")).click();
		
		//Contact
		
		w.findElement(By.linkText("CONTACT")).click();
		w.findElement(By.tagName("img")).click();
		
		//Home
		w.findElement(By.linkText("Home")).click();
		w.navigate().back();
		
		//Flight
		w.findElement(By.linkText("Flights")).click();
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/b[1]/font[1]/input[1]")).click();
		w.findElement(By.xpath("//tbody/tr[2]/td[2]/b[1]/font[1]/input[2]")).click();
		
		Select s1=new Select(w.findElement(By.name("passCount")));
		s1.selectByIndex(1);
		
		Select s2=new Select(w.findElement(By.name("fromPort")));
		s2.selectByIndex(2);
		
		Select s3=new Select(w.findElement(By.name("fromMonth")));
		s3.selectByIndex(1);
		
		Select s4=new Select(w.findElement(By.name("fromDay")));
		s4.selectByIndex(1);
		
		Select s5=new Select(w.findElement(By.name("toPort")));
		s5.selectByIndex(3);
		
		Select s6=new Select(w.findElement(By.name("toMonth")));
		s6.selectByIndex(4);
		
		Select s7=new Select(w.findElement(By.name("toDay")));
		s7.selectByIndex(4);
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")).click();;
		

        w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();;
		
		
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();;
		
		Select s8=new Select(w.findElement(By.name("airline")));
		s8.selectByIndex(0);
		
		w.findElement(By.name("findFlights")).click();
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img")).click();
		w.navigate().back();
			
		//Hotels
		w.findElement(By.linkText("Hotels")).click();
		w.navigate().back();
		
		//Car Rentals
		w.findElement(By.linkText("Car Rentals")).click();
		w.navigate().back();
		
		//Cruises
		w.findElement(By.linkText("Cruises")).click();
		w.navigate().back();
		
		//Destinations
		w.findElement(By.linkText("Destinations")).click();
		w.navigate().back();
		
		//Vacations
		w.findElement(By.linkText("Vacations")).click();
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		w.navigate().back();
		
		//Selenium
		
		w.findElement(By.linkText("Selenium")).click();
		w.findElement(By.linkText("Radio & Checkbox Demo")).click();
		w.findElement(By.id("vfb-7-1")).click();
		w.findElement(By.id("vfb-6-0")).click();
		w.findElement(By.id("vfb-6-2")).click();
		w.navigate().back();
		
		w.findElement(By.linkText("Selenium")).click();
		w.findElement(By.linkText("Table Demo")).click();
		w.navigate().back();
		
		w.findElement(By.linkText("Selenium")).click();
		w.findElement(By.linkText("Accessing Link")).click();
		w.findElement(By.linkText("click here")).click();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		w.findElement(By.linkText("Selenium")).click();
		w.findElement(By.linkText("Ajax Demo")).click();
		w.findElement(By.id("yes")).click();
		w.findElement(By.id("buttoncheck")).click();
		w.findElement(By.xpath("/html/body/div[2]/form/p[2]/input[1]")).click();
		w.navigate().back();
		
		w.findElement(By.linkText("Selenium")).click();
		w.findElement(By.linkText("Yahoo")).click();
		w.navigate().back();
		
		//Selenium Drag and Drop
		
		w.findElement(By.linkText("Selenium")).click();
		w.findElement(By.linkText("Drag and Drop Action")).click();
		
		Thread.sleep(2000);
		
		WebElement Drag=w.findElement(By.partialLinkText("BANK"));
		WebElement Drop=w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/h3[1]"));
		
		WebElement Drag1=w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		WebElement Drop1=w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/h3[1]"));
		
		WebElement Drag2=w.findElement(By.partialLinkText("SALES"));
		WebElement Drop2=w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/h3[1]"));
		
		WebElement Drag3=w.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
		WebElement Drop3=w.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/h3[1]"));
		
		Actions a=new Actions(w);
		a.dragAndDrop(Drag, Drop).build().perform();
		a.dragAndDrop(Drag1, Drop1).build().perform();
		a.dragAndDrop(Drag2, Drop2).build().perform();
		a.dragAndDrop(Drag3, Drop3).build().perform();
		
		w.navigate().back();
		
		//Insurance Project
		
		w.findElement(By.linkText("Insurance Project")).click();
		w.findElement(By.linkText("Register")).click();
		
		Thread.sleep(2000);
		
		Select s9=new Select(w.findElement(By.name("title")));
		s9.selectByValue("Miss");
		
		w.findElement(By.name("firstname")).sendKeys("Amruta");
		w.findElement(By.name("lastname")).sendKeys("Tribhuvan");
		w.findElement(By.name("phone")).sendKeys("9094207057");
		
		Select s10=new Select(w.findElement(By.name("year")));
		s10.selectByIndex(60);
		
		Select s11=new Select(w.findElement(By.name("month")));
		s11.selectByIndex(7);
		
		Select s12=new Select(w.findElement(By.name("date")));
		s12.selectByIndex(0);
		
		w.findElement(By.id("licencetype_t")).click();
		
		Select s13=new Select(w.findElement(By.name("licenceperiod")));
		s13.selectByIndex(1);
		
		Select s14=new Select(w.findElement(By.name("occupation")));
		s14.selectByIndex(11);
		
		w.findElement(By.name("street")).sendKeys("Niwara Nagari");
		w.findElement(By.name("city")).sendKeys("Aurangabad");
		w.findElement(By.name("county")).sendKeys("India");
		w.findElement(By.name("post_code")).sendKeys("423701");
		w.findElement(By.name("email")).sendKeys("amruta@gmail.com");
		w.findElement(By.name("password")).sendKeys("@1234");
		w.findElement(By.name("c_password")).sendKeys("@1234");
		w.findElement(By.name("submit")).click();
		
		w.findElement(By.id("email")).sendKeys("amruta@gmail.com");
		w.findElement(By.id("password")).sendKeys("@1234");
		w.findElement(By.name("submit")).click();
		w.findElement(By.xpath("//body/div[3]/form[1]/input[1]")).click();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		Thread.sleep(2000);
		
		//Agile Project
		
		w.findElement(By.linkText("Agile Project")).click();
		w.findElement(By.name("uid")).sendKeys("1303");
		w.findElement(By.name("password")).sendKeys("Guru99");
		w.findElement(By.name("btnLogin")).click();
		w.findElement(By.linkText("Log out")).click();
		
		Alert A=w.switchTo().alert();
		System.out.println(A.getText());
		A.accept();
		
		Thread.sleep(2000);
		
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//Bank Project
		
		w.findElement(By.linkText("Bank Project")).click();
		w.findElement(By.name("uid")).sendKeys("1303");
		w.findElement(By.name("password")).sendKeys("Guru99");
		w.findElement(By.name("btnLogin")).click();
		
		w.navigate().back();
		w.findElement(By.linkText("here")).click();
		w.findElement(By.name("emailid")).sendKeys("amruta@gmail.com");
		w.findElement(By.name("btnLogin")).click();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//Security Project
		
		w.findElement(By.linkText("Security Project")).click();
		w.findElement(By.name("uid")).sendKeys("1303");
		w.findElement(By.name("password")).sendKeys("Guru99");
		w.findElement(By.name("btnLogin")).click();
		
		w.findElement(By.linkText("Balance Enquiry")).click();
		w.findElement(By.name("accountno")).click();
		w.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/select/option[2]")).click();
		w.findElement(By.name("AccSubmit")).click();
		w.findElement(By.linkText("Home")).click();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//Telecom Project
		
		w.findElement(By.linkText("Telecom Project")).click();
		w.findElement(By.linkText("Add Customer")).click();
		w.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		w.findElement(By.id("fname")).sendKeys("Shivangi");
		w.findElement(By.id("lname")).sendKeys("Tribhuvan");
		w.findElement(By.name("emailid")).sendKeys("shivangi@gmail.com");
		w.findElement(By.name("addr")).sendKeys("Pune");
		w.findElement(By.name("telephoneno")).sendKeys("9800568923");
		w.findElement(By.name("submit")).click();
		
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//Payment Gateway Project
		
		w.findElement(By.linkText("Payment Gateway Project")).click();
		w.findElement(By.linkText("Cart")).click();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//New Tours
		
		w.findElement(By.linkText("New Tours")).click();
		
		//SEO
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		w.findElement(By.linkText("Page-1")).click();
		w.navigate().back();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		w.findElement(By.linkText("Page-2")).click();
		w.navigate().back();
		
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		w.findElement(By.linkText("Page-3")).click();
		w.navigate().back();
		
		System.out.println("End of Page");
		w.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
