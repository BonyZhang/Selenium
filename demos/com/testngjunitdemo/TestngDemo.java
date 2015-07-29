package com.testngjunitdemo;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*public class TestCase {
	public static void main(String[] args)
	{
		
	}
}*/
public class TestngDemo
{
	private WebDriver driver;
	private OppoCom java_demo=new OppoCom();
	private OppoCom.Test_clik tc;
	//在所有方法执行之前执行：打开浏览器驱动
	@BeforeClass
	public void init_driver()
	{
		System.out.println("打开Chrome浏览器");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver=new ChromeDriver();
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
		tc = java_demo.new Test_clik();
		
	}
	//在每个方法执行之后执行：打印----------
	@AfterMethod
	public void print_()
	{
		System.out.println("test之后执行：");
		System.out.println("--------------------");
	}
	
	@Test
	public void testoppo_com01()
	{
		boolean a=tc.oppo_com01();
		assertEquals(true,a);
	}
	@Test
	public void testoppo_com02()
	{
		int a=tc.oppo_com02();
		//int a=1;
		assertEquals(1,a);
	}
	@Test
	public void testoppo_com03()
	{
		String a=tc.oppo_com03();
		//int a=1;
		assertEquals("no",a);
	}
	
}
