package com.inetbanking.Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import com.inetbanking.BaseClass.BaseClass;

import net.bytebuddy.utility.RandomString;

public class ScreenShots extends BaseClass {

	public static void CaptureScreenshots(String ScreenShotName) {
	
		try {
			TakesScreenshot TS = (TakesScreenshot)driver;
			File Source = TS.getScreenshotAs(OutputType.FILE);
			//String Path = "D:\\IMP\\inetBanking_V2.zip_expanded\\inetBanking_V2\\ScreenShots\\";
			
			String Random = RandomString.make(5);
			//String destination = System.getProperty("user.dir") + "/ScreenShots/" + ScreenShotName + "" +Random+".png";
			String destination = "D:\\IMP\\inetBanking_V2.zip_expanded\\inetBanking_V2\\ScreenShots\\"+ScreenShotName + "" +Random+".png";
			File Target = new File(destination);
			FileUtils.copyFile(Source, Target);
			System.out.println("ScreenShot Taken");
		}
		catch(Exception e){
			System.out.println("Exception While Taking ScreenShots :- "+e.getMessage());
		}
	}
}
