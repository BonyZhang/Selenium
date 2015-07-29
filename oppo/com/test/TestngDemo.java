package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

import com.bony.tools.ExcelReport;
import com.service.Configure;
import com.service.Demo;

/*public class TestCase {
	public static void main(String[] args)
	{
		
	}
}*/
public class TestngDemo
{
	private WebDriver driver;
	private ExcelReport excelreport=Configure.excelreport;
	private Demo oppocom=new Demo();
	private boolean flag=false;
	private String num;
	//在所有方法执行之前执行：打开浏览器驱动
	@BeforeClass
	public void init_driver()
	{
		System.out.println("打开Chrome浏览器");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
		driver=new ChromeDriver();
		//er.report("运行时间","用例内容", "测试结果");
	}
	//在所有方法执行之后执行：关闭浏览器驱动
	@AfterClass
	public void Exit_driver()
	{
		System.out.println("关闭Chrome浏览器");
		System.out.println("--------------------");
		driver.quit();
	}
	//在每个方法执行之前执行：去到www.oppo.com页面
	@BeforeMethod
	public void init_www()
	{
		System.out.println("--------------------");
		System.out.println("test之前执行：");
		driver.get("http://www.oppo.com/cn/");
		
	}
	//在每个方法执行之后执行：打印----------
	@AfterMethod
	public void print_()
	{
		System.out.println("test之后执行：");
		excelreport.report(0,excelreport.timeSecond(),num,flag+"");
		flag=false;
	}
	
	@Test
	public void Testoppo_com01()
	{
		num="首页：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com01(driver);
		assertEquals(true,flag);
		
	}
	@Test
	public void Testoppo_com02()
	{
		num="产品页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com02(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com03()
	{
		num="品牌页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com03(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com04()
	{
		num="在线商城页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com04(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com05()
	{
		num="体验店页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com05(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com06()
	{
		num="服务页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com06(driver);
		assertEquals(true,flag);
	}
	
	@Test
	public void Testoppo_com03_01()
	{
		num="品牌-关于OPPO页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com03_01(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com03_02()
	{
		num="品牌-OPPO历史：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com03_02(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com03_03()
	{
		num="品牌-OPPO风采页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com03_03(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com03_04()
	{
		num="品牌-官方新闻页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com03_04(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com03_05()
	{
		num="品牌-我们的视频页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com03_05(driver);
		assertEquals(true,flag);
	}
	

	@Test
	public void Testoppo_com04_01()
	{
		num="在线商场-手机列表页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com04_01(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com04_02()
	{
		num="在线商场-配件列表页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com04_02(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com04_03()throws Exception
	{
		num="在线商场-购物指南页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com04_03(driver);
		assertEquals(true,flag);
	}
	@Test
	public void Testoppo_com04_04()
	{
		num="在线商场-积分服务页面：社区+ColorOS+云服务+手机助手链接检查";
		flag = oppocom.oppo_com04_04(driver);
		assertEquals(true,flag);
	}
	
}
