package com.inetbanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfiguration {

	Properties pro; // Create Object for properties class

	public ReadConfiguration() {

		File src = new File(
				"D:\\IMP\\inetBanking_V2.zip_expanded\\inetBanking_V2\\Configuration\\Configuration.properties");

		try {
			FileInputStream RF = new FileInputStream(src);
			pro = new Properties();
			pro.load(RF);
		} catch (Exception e) {
			System.out.println("Exception is :- " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("BaseURL");
		return url;
	}

	public String getUserName() {
		String uname = pro.getProperty("Username");
		return uname;
	}

	public String getPassword() {
		String pass = pro.getProperty("Password");
		return pass;
	}

	public String getChromeBrower() {
		String chromepath = pro.getProperty("ChromePath");
		return chromepath;
	}
}
