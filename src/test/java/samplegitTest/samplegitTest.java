package samplegitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class samplegitTest {
	@Test
	public void loginTest() throws IOException
	{
		WebDriver wb = new FirefoxDriver();
		wb.get("https://www.google.com/");
		File f = ((TakesScreenshot)wb).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File ("D:\\SeleniumWorkspace\\samplegit\\SampleScreenShot"));
	}

}
