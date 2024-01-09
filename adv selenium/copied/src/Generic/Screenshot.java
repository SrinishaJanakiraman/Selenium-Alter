package Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Baseclass
{
	public static void screen(WebDriver driver) throws IOException
	{

	String photos="./photos/";
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File(photos+"jpeg");
	FileHandler.copy(src, dst);
	}

}