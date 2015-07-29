package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.bony.tools.*;
import com.service.*;

public class TestBuy {
	
	private WebDriver driver;
	private ExcelReport excelreport=Configure.excelreport;
	public String www=Configure.WWW;
	public String time=Configure.time;
	private Account account=new Account();
	private MobilePhoneList mobilephone=new MobilePhoneList();
	private Buy buy=new Buy();
	public static String chromefilepath=Configure.CHROMEFILEPATH;
	private boolean flag=false;
	private String num;

	private String oppouser=Configure.OPPO_USER01;
	private String oppopasword=Configure.OPPO_PASSWORD;
	
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
	public void test_Signin()
	{
		num="oppo账号登录";
		account.OppoSignin(driver,oppouser,oppopasword);
	}
	@Test
	public void test_tomobile()
	{
		num="去到手机列表页面";
		flag=mobilephone.toMobilePhoneList(driver,excelreport);
		//flag&=mobilephone.ScreeningList(driver,excelreport);
	}
	@Test//(invocationCount = 10, threadPoolSize = 9) 
	public void test_buy()
	{
		num="手机列表筛选";
		for(int i=1;i<10;i++)
		flag=buy.BuyMobile(driver,excelreport);
	}
	
	
}
