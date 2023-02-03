package practicePrograms;

//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendars {

	public static void main(String[] args) throws Exception{
		//System.setProperty("webdriver.gecko.driver", "D:\\Webdriver executable\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Webdriver executable\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--window-size=750,1440");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		
		driver.findElement(By.id("first_date_picker")).click();
		selectDate(driver, "29/Feb/2024");
		
		driver.findElement(By.id("second_date_picker")).click();
		String targetDate = "29/Feb/2020";
		selectDate(driver, targetDate);
	}
	
	public static void selectDate(WebDriver driver, String targetDate) throws Exception {
		
		Calendar calendar = Calendar.getInstance();
		
		try {
			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
			targetDateFormat.setLenient(false);
			Date formattedTargetDate;
			formattedTargetDate = targetDateFormat.parse(targetDate);
			calendar.setTime(formattedTargetDate);
		} catch (Exception e) {
			System.out.println(e.toString());
			throw new Exception("Invalid date is provided. Please check input date.");
			
		}
		
		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);
		int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
		
		
		String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
		SimpleDateFormat currentDateFormat = new SimpleDateFormat("MMM yyyy");
		//targetDateFormat.setLenient(false);
		Date formattedCurrentDate = currentDateFormat.parse(currentDate);
		calendar.setTime(formattedCurrentDate);
		int currentMonth = calendar.get(Calendar.MONTH);
		int currentYear = calendar.get(Calendar.YEAR);
		
		while(currentMonth < targetMonth || currentYear < targetYear) {
			driver.findElement(By.className("ui-datepicker-next")).click();
			currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			currentDateFormat = new SimpleDateFormat("MMM yyyy");
			//targetDateFormat.setLenient(false);
			formattedCurrentDate = currentDateFormat.parse(currentDate);
			calendar.setTime(formattedCurrentDate);
			currentMonth = calendar.get(Calendar.MONTH);
			currentYear = calendar.get(Calendar.YEAR);
		}
		
		while(currentMonth > targetMonth || currentYear > targetYear) {
			driver.findElement(By.className("ui-datepicker-prev")).click();
			currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			currentDateFormat = new SimpleDateFormat("MMM yyyy");
			//targetDateFormat.setLenient(false);
			formattedCurrentDate = currentDateFormat.parse(currentDate);
			
			calendar.setTime(formattedCurrentDate);
			currentMonth = calendar.get(Calendar.MONTH);
			currentYear = calendar.get(Calendar.YEAR);
		}
		if(currentMonth == targetMonth && currentYear == targetYear) {
			driver.findElement(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetDay+"]")).click();
		}
		
	}

}
