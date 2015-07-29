package com.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.bony.tools.ExcelReport;
 

public class Main {
	private static WebDriver chromedriver;
	private static WebDriver iedriver;
	private static WebDriver firefoxdriver;
	private static ExcelReport excelreport=Configure.excelreport;
	private static String chromefilepath=Configure.CHROMEFILEPATH;
	private static String www=Configure.WWW;
	//private static ElementTool tool=new ElementTool();
	public static void main(String[] arg)
	{

		//linkdemo();
		shoppingdemo();
		
	}
	
	public static void shoppingdemo()
	{
		boolean flag=false;
		MobilePhoneList shop=new MobilePhoneList();
		System.setProperty("webdriver.chrome.driver",chromefilepath);
		chromedriver=new ChromeDriver();
		chromedriver.get(www);
		
		
		flag&=shop.toMobilePhoneList(chromedriver,excelreport);
		//flag&=shop.ErgodicPhone(chromedriver,excelreport);
		flag&=shop.ScreeningList(chromedriver,excelreport);
		//chromedriver.getTitle();
		//chromedriver.quit();
		System.out.println(flag);
	}
	
	
	public static void linkdemo()
	{
		Link tests=new Link();
		System.out.println("函数调试---------------------");
		System.setProperty("webdriver.chrome.driver",chromefilepath);
		for(int i=1;i<=1;i++)
		{
			chromedriver=new ChromeDriver();
			chromedriver.get(www);
			if(tests.oppo_com04_01(chromedriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_02(chromedriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_03(chromedriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_04(chromedriver))System.out.println("1");else System.out.println("2");
			chromedriver.quit();
			System.out.println("-------------------"+i+"次试运行完成---------------------");
		}
		for(int i=1;i<=1;i++)
		{
			iedriver=new InternetExplorerDriver();
			iedriver.get(www);
			if(tests.oppo_com04_01(iedriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_02(iedriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_03(iedriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_04(iedriver))System.out.println("1");else System.out.println("2");
			iedriver.quit();
			System.out.println("-------------------"+i+"次试运行完成---------------------");
		}
		for(int i=1;i<=1;i++)
		{
			firefoxdriver=new FirefoxDriver();
			firefoxdriver.get(www);
			if(tests.oppo_com04_01(firefoxdriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_02(firefoxdriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_03(firefoxdriver))System.out.println("1");else System.out.println("2");
			if(tests.oppo_com04_04(firefoxdriver))System.out.println("1");else System.out.println("2");
			firefoxdriver.quit();
			System.out.println("-------------------"+i+"次试运行完成---------------------");
		}
		
	}
}
