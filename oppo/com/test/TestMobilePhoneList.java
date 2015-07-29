package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.bony.tools.*;
import com.service.*;

public class TestMobilePhoneList {
	
	private WebDriver driver;
	private ExcelReport excelreport=Configure.excelreport;
	public String www=Configure.WWW;
	public String time=Configure.time;
	private MobilePhoneList mobilephone=new MobilePhoneList();
	public static String chromefilepath=Configure.CHROMEFILEPATH;
	private boolean flag=false;
	private String num;

	/**所有测试执行前*/
	@BeforeClass
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", chromefilepath);
		driver=new ChromeDriver();
		excelreport.report(0,"", "", "TestMobilePhoneList");
		excelreport.report(0,"时间", "内容", "结果");
		driver.get(www);
		
	}
	/**所有测试执行后*/
	@AfterClass
	public void exit()
	{
		driver.quit();
	}
	/**每次测试执行前*/
	@BeforeMethod
	public void init_test()
	{
	}
	/**每次测试执行后*/
	@AfterMethod
	public void exit_test()
	{
		excelreport.report(0,time,num,flag+"");
	}
	
	@Test//(invocationCount = 10, threadPoolSize = 9) 
	public void test_toMobilePhoneList()
	{
		num="去到手机列表页面";
		flag&=mobilephone.toMobilePhoneList(driver,excelreport);
		//flag&=mobilephone.ScreeningList(driver,excelreport);
	}
	@Test//(invocationCount = 10, threadPoolSize = 9) 
	public void test_ScreeningList()
	{
		num="手机列表筛选";
		flag=mobilephone.ScreeningList(driver,excelreport);
	}
	
	
}
