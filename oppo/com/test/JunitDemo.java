package com.test;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.service.Demo;


public class JunitDemo
{
	private static WebDriver driver;
	private static Demo tests;
	//在所有方法执行之前执行：打开浏览器驱动
	@BeforeClass
	public static void init_driver()
	{
		System.out.println("打开Chrome浏览器");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver=new ChromeDriver();
		tests=new Demo();
	}
	//在所有方法执行之后执行：关闭浏览器驱动
	@AfterClass
	public static void Exit_driver()
	{
		System.out.println("关闭Chrome浏览器");
		System.out.println("--------------------");
		driver.quit();
	}
	//在每个方法执行之前执行：去到www.oppo.com页面
	@Before
	public void init_www()
	{
		System.out.println("--------------------");
		System.out.println("去到www.oppo.com");
		driver.get("http://www.oppo.com/cn/");
	}
	//在每个方法执行之后执行：打印----------
	@After
	public void print_()
	{
		System.out.println("--------------------");
	}
	
	@Test
	public void Testoppo_com()
	{
		boolean flag=tests.oppo_com01(driver);
		assertEquals(true,flag);
	}
	
}
