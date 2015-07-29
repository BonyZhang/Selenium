package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.bony.tools.ExcelReport;
import com.service.*;

public class TestAccount {
	private WebDriver driver;
	private Account account=new Account();
	private ExcelReport excelreport=Configure.excelreport;
	private boolean flag=false;
	private String num;
	public String chromefilepath=Configure.CHROMEFILEPATH;
	public String www=Configure.WWW;
	@BeforeClass
	public void init_driver(){	//在所有方法执行之前执行：打开浏览器驱动
		excelreport.report(0,"运行时间","用例内容", "测试结果");
		System.out.print("打开Chrome浏览器");
		System.out.println("--------------------");
		System.setProperty("webdriver.chrome.driver", chromefilepath);
		driver=new ChromeDriver();
	}
	@AfterClass
	public void Exit_driver(){	//在所有方法执行之后执行：关闭浏览器驱动
		System.out.print("关闭Chrome浏览器");
		System.out.println("--------------------");
		driver.quit();
	}
	@BeforeMethod
	public void init_www(){		//在每个方法执行之前执行：去到www.oppo.com页面
		System.out.print("test之前执行：");
		System.out.println("--------------------");
		driver.get(www);
	}
	@AfterMethod
	public void print_(){		//在每个方法执行之后执行：打印----------
		System.out.print("test之后执行：");
		excelreport.report(0,excelreport.timeSecond(),num,flag+"");
		flag=false;
		System.out.println("--------------------");
	}
	
	
	@Test
	public void TestQQSignin()
	{
		num="第三方腾讯账号登录";
		account.QQSignin(driver,"770284941","love??025");
		assertEquals(false,flag);
	}
	@Test
	public void TestSinaSignin()
	{
		num="第三方新浪账号号登录";
		account.SinaSignin(driver,"13650089145","123456qwe");
		assertEquals(false,flag);
	}

	@Test
	public void TestOppoSignin()
	{
		num="OPPO账号登录";
		account.OppoSignin(driver,"13650089145","123qwe");
		assertEquals(false,flag);
	}
	@Test
	public void TestTaobaoSignin()
	{
		num="第三方支付宝账号登录";
		account.TaobaoSignin(driver);
		assertEquals(false,flag);
	}
	@Test
	public void TestRetrievePassword()
	{
		num="找回密码";
		account.RetrievePassword(driver,"13650089145");
		assertEquals(false,flag);
	}
}
