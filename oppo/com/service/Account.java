package com.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.bony.tools.ElementTool;

public class Account {
    //第三方支付宝账号登录
    public void TaobaoSignin(WebDriver driver){
		ElementTool elementtool=new ElementTool();
		System.out.println("去登录页面");//登录
		elementtool.get_Element(driver,"partialLinkText","登录").click();
		System.out.println("扫码登录");//微博登录
		elementtool.get_Element(driver,"xpath","/html/body/main/div/div/div[2]/div[2]/div[2]/a[3]/span").click();
		elementtool.ms(1000);
		elementtool.get_Element(driver,"id","J-qrcode-target").click();
		while(elementtool.isElementExsit(driver, "id", "J-qrcode"));
		elementtool.delay_element(driver, "id", "cap_input" ,"xpath","/html/body/div[2]/div[3]/a");
		while(!(elementtool.isElementExsit(driver,"partialLinkText","退出")));
		driver.findElement(By.partialLinkText("退出")).click();
	}
	//第三方腾讯账号登录
    public void QQSignin(WebDriver driver,String QQ_user,String QQ_password){
		ElementTool elementtool=new ElementTool();
		String strMainHandler = driver.getWindowHandle();
		System.out.println("去登录页面。。。");//登录
		elementtool.get_Element(driver,"partialLinkText","登录").click();
		System.out.println("腾讯登录");//QQ登录
		elementtool.get_Element(driver,"xpath","/html/body/main/div/div/div[2]/div[2]/div[2]/a[2]/span").click();
		System.out.println("判断浏览器是否腾讯账号");//浏览器是否腾讯账号
		driver.switchTo().frame("ptlogin_iframe");
		if(elementtool.isElementExsit(driver,"id","switcher_plogin"))
		{		
			elementtool.get_Element(driver, "id", "switcher_plogin").click();
			System.out.println("需要输入腾讯账号密码");//需要输入腾讯账号密码
			elementtool.get_Element(driver,"id","u").sendKeys(QQ_user);
			elementtool.get_Element(driver,"id","p").sendKeys(QQ_password);
			elementtool.get_Element(driver, "id", "login_button").click();
			elementtool.ms(2000);
			while(elementtool.isElementExsit(driver, "id", "login_button"))
				elementtool.get_Element(driver, "id", "login_button").click();
			System.out.println("是否存在图片验证码");//是否存在图片验证码
			elementtool.delay_element(driver, "name","captcha","xpath","//*[@id='captchaForm']/div/div[2]/div[2]/div[1]/div/button");
		}
		driver.switchTo().window(strMainHandler);
		elementtool.delay_element(driver, "id", "cap_input" ,"xpath","/html/body/div[2]/div[3]/a");
		while(!(elementtool.isElementExsit(driver,"partialLinkText","退出")));
		driver.findElement(By.partialLinkText("退出")).click();	
	}
	//第三方新浪账号登录
    public void SinaSignin(WebDriver driver,String SINA_user,String SINA_password){
		ElementTool elementtool=new ElementTool();
		System.out.println("去登录页面。。。");//登录
		elementtool.get_Element(driver,"partialLinkText","登录").click();
		System.out.println("微博登录");//微博登录
		elementtool.get_Element(driver,"xpath","/html/body/main/div/div/div[2]/div[2]/div[2]/a[1]").click();
		System.out.println("判断浏览器是否新浪账号");//浏览器是否新浪账号
		if(elementtool.isElementExsit(driver,"xpath","//*[@id='outer']/div/div[2]/form/div/div[2]/div/p/a[1]"))
			elementtool.get_Element(driver,"xpath","//*[@id='outer']/div/div[2]/form/div/div[2]/div/p/a[1]").click();
		
		if(elementtool.isElementExsit(driver,"xpath","//*[@id='outer']/div/div[2]/form/div/div[2]/div/p/a[1]"))
			{
				System.out.println("需要输入新浪账号密码");//需要输入新浪账号密码
				elementtool.get_Element(driver,"id","userId").sendKeys(SINA_user);
				elementtool.get_Element(driver,"id","passwd").sendKeys(SINA_password);
				System.out.println("是否存在图片验证码");//是否存在图片验证码
				elementtool.delay_element(driver, "xpath", "//*[@id='outer']/div/div[2]/form/div/div[1]/div[1]/p[3]/input" ,"xpath","//*[@id='outer']/div/div[2]/form/div/div[2]/div/p/a[1]");
			}
		elementtool.delay_element(driver, "name","captcha","xpath","//*[@id='captchaForm']/div/div[2]/div[2]/div[1]/div/button");
		while(!(elementtool.isElementExsit(driver,"partialLinkText","退出")));
		driver.findElement(By.partialLinkText("退出")).click();	
	}
	//oppo账号登录
    public void OppoSignin(WebDriver driver,String OPPO_user,String OPPO_password){
		ElementTool elementtool=new ElementTool();
		System.out.println("点击登录页面链接");//点击登录页面链接
		driver.findElement(By.partialLinkText("登录")).click();
		System.out.println("输入账号、密码...");//输入账号、密码
		driver.findElement(By.name("username")).sendKeys(OPPO_user);
		driver.findElement(By.name("password")).sendKeys(OPPO_password);
		System.out.println("正在判断是否有图片验证码...");//判断是否有图片验证码
		elementtool.delay_element(driver, "name","captcha","id","loginBtn");
		elementtool.get_Element(driver, "id", "loginBtn").click();
		while(!(elementtool.isElementExsit(driver,"partialLinkText","图片验证码")));
		if(elementtool.isElementExsit(driver,"partialLinkText","图片验证码"))elementtool.delay_element(driver, "name","captcha","id","loginBtn");
		System.out.println("登录成功！");	
		while(!(elementtool.isElementExsit(driver,"partialLinkText","退出")));
		driver.findElement(By.partialLinkText("退出")).click();	
	}
	//oppo账号找回密码
    public void RetrievePassword(WebDriver driver,String OPPO_user){
		ElementTool elementtool=new ElementTool();
		System.out.println("点击登录页面链接");//点击登录页面链接
		driver.findElement(By.partialLinkText("登录")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/div[1]/a")).click();
		driver.findElement(By.name("username")).sendKeys(OPPO_user);
		elementtool.delay_element(driver, "name","captcha","xpath","/html/body/main/div/div/div[1]/form/div[3]/button");
		elementtool.delay_element(driver, "name","validation_code","id","sendNextBtn");
	}
	
}
