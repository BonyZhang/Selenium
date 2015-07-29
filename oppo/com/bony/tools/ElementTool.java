package com.bony.tools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ElementTool{

	public void Ssass()
	{
		int[] a = {1,2,3};
		for(int i : a)
			System.out.println(i + "|"+a[i-1]+",");
	}

	Tool tool=new Tool();

	/**
	 * 除了指定title的窗口不关闭，关闭其他窗口
	 * @param driver WebDriver对象参数
	 * @param z_Title 指定不关闭为title的窗口不关闭
	 * @param z_name 想要表现的窗口的名称
	 * @return Title最后关闭的Title的名称
	 */
	public String ClickTitle(WebDriver driver,String z_name,String z_Title)
	{
		String Title=null;
		Set<String> handles = driver.getWindowHandles();  
		for (String s : handles){  
			driver.switchTo().window(s); //去到窗口
			Title=driver.getTitle();
			if(!WhetherTitle(driver,z_Title))
				{
				Log.run.error("关闭"+WhetherTitle(driver,z_Title));
				//System.out.println("关闭"+WhetherTitle(driver,z_Title));
				driver.close(); 
				}
		}
		toTitle(driver,z_name,z_Title);//回到指定的窗口
		return Title;
	}
	/**
	 * 除了指定title的窗口不关闭，关闭其他窗口
	 * @param driver WebDriver对象参数
	 * @param z_Title 指定不关闭为title的窗口不关闭
	 * @param z_name 想要表现的窗口的名称
	 */
	public void ClickTitles(WebDriver driver,String z_name,String z_Title)
	{
		Set<String> handles = driver.getWindowHandles();  
		for (String s : handles){  
			driver.switchTo().window(s); //去到窗口
			if(!WhetherTitle(driver,z_Title))
				{
				Log.run.error("关闭"+WhetherTitle(driver,z_Title));
				//System.out.println("关闭"+WhetherTitle(driver,z_Title));
				driver.close(); 
				}	
		}
		toTitle(driver,z_name,z_Title);//回到指定的窗口
	}
	/**
	 * @author bony
	 * 获取到当前窗口下面的title，运用contains判断是不是包含我要渠道的title
	 * @param driver WebDriver对象参数
	 * @param z_Title 判断的Title内容
	 * @return boolean类型，判断结果值 true 一致,的flase 不一致的
	 */
	public boolean WhetherTitle(WebDriver driver,String z_Title)
	{
		boolean flag = false;
		if(driver.getTitle().contains(z_Title))flag=true;
		return flag;

	}
	/**
	 * @author bony
	 * 作用：根据新窗口的title去切换窗口，通过判断title：windowTitle  窗口切换到title：windowTitle页面
	 * @param driver WebDriver对象参数
	 * @param z_name 想要表现的窗口的名称
	 * @param z_Title 将要去到的Title内容
	 * @return boolean类型，判断结果值 true 一致,的flase 不一致的
	 */
	public boolean toTitle(WebDriver driver,String z_name,String z_Title){  
		boolean flag = false;  
		try {  
			//String currentHandle = driver.getWindowHandle();  
			Set<String> handles = driver.getWindowHandles();  
			for (String s : handles) 
			{  
				//去到窗口
				driver.switchTo().window(s);  
				//判断是不是已经切换至指定窗口
				if (driver.getTitle().contains(z_Title)) {  
					flag = true;  
					//System.out.println("Switch to window: "+ z_Title + " successfully!");  
					Log.run.error("切换窗口: "+ z_name + " 成功!");
					//System.out.println("切换窗口: "+ z_name + " 成功!"); 
					break;  
				}
			}  		          
		} 
		catch (NoSuchWindowException e) 
		{  
			//System.out.println("Window: " + z_Title + " cound not found!"+e.fillInStackTrace());  
			Log.run.error("窗口: " + z_name + "找不到!"+e.fillInStackTrace());
			//System.out.println("窗口: " + z_name + "找不到!"+e.fillInStackTrace());  
			flag = false;  
		}  
		return flag;  
	}  

	/**
	 * @author bony
	 * 作用：根据新窗口的title去切换窗口，通过判断title：windowTitle  窗口切换到title：windowTitle页面
	 * @param driver WebDriver对象参数
	 * @param z_Title 将要去到的Title内容
	 * @return boolean类型，判断结果值 true 一致,的flase 不一致的
	 */
	public boolean switchToWindow(WebDriver driver,String z_Title){  
		boolean flag = false;  
		try {  
			String currentHandle = driver.getWindowHandle();  
			Set<String> handles = driver.getWindowHandles();  
			for (String s : handles) {  
				if (s.equals(currentHandle))  
				{
					//System.out.println("continue"+s);
					//System.out.println("continue"+currentHandle);
					flag = true;
					continue; 
				}
				else 
				{  
					driver.switchTo().window(s);  
					//判断是不是已经切换至指定窗口
					if (driver.getTitle().contains(z_Title)) 
					{  
						//driver.getTitle()获取到当前窗口下面的title，运用contains判断是不是包含我要的title
						flag = true;  
						//System.out.println("Switch to window: "+ z_Title + " successfully!");  
						System.out.println("切换窗口: "+ z_Title + " 成功!"); 
						break;  
					} 
					else  continue;  
				}  
			}  
		}
		catch (NoSuchWindowException e) {  
			//System.out.println("Window: " + z_Title + " cound not found!"+e.fillInStackTrace());  
			System.out.println("窗口: " + z_Title + "找不到!"+e.fillInStackTrace());  
			flag = false;  
		}  
		return flag;  
	}  
	/*
	 * delay_element(WebDriver z_driver, String z_Type, String z_elements ,String z_button_Type,String z_button)
	 * 元素等待手动输入函数,并相应下一步
	 * 参数：z_driver 浏览器驱动对象   z_elements 元素名称字符串
	 */
	/**
	 * @author bony
	 * z_Type类型的元素z_elements等待手动执行,并相应下一步z_Type_类型的元素z_elements_
	 * @param z_driver WebDriver对象参数
	 * @param z_Type 元素类型
	 * @param z_elements 元素
	 * @param z_Type_  元素类型
	 * @param z_elements_ 元素
	 */
	public void delay_element(WebDriver z_driver, String z_Type, String z_elements ,String z_Type_,String z_elements_)
	{
		int cishu=1;
		if(isElementExsit(z_driver,z_Type,z_elements)){	
			String temp_string=" ";
			//获取captcha表单的value值	
			tool.sleep(2000);
			get_Element( z_driver, z_Type, z_elements).clear();
			System.out.println("检测到页面有图片验证码");
			System.out.println("需要手动输入图片验证码...");
			while(isElementExsit(z_driver,z_Type,z_elements)){
				//清空元素内容
				//get_Element(z_driver,z_Type,z_elements).clear();
				temp_string=get_Element(z_driver,z_Type,z_elements).getAttribute("value");
				while(temp_string.length()<5){
					temp_string=get_Element(z_driver,z_Type,z_elements).getAttribute("value");
				}
				System.out.println("你输入的图片验证码是："+temp_string);
				if(temp_string.length()>=5)
				{
					System.out.println("输入验证码完成,稍等.....");
					//验证码填写完成  点击“下一步”按钮
					get_Element(z_driver,z_Type_,z_elements_).click();
					//z_driver.findElement(By.id(z_button)).click();
					tool.sleep(2000);
					cishu++;
					if(isElementExsit(z_driver,z_Type,z_elements))
					{
						System.out.println("输入有误"+cishu+"次,请重新输入");
						get_Element( z_driver, z_Type, z_elements).clear();
					}

				}
			}
			System.out.println("通过验证！");
		}
	}

	/**
	 * @author bony
	 * 鼠标悬浮在z_Type类型的元素上z_elements
	 * @param z_driver WebDriver对象参数
	 * @param z_Type 元素类型
	 * @param z_elements 元素
	 * @param time 悬浮时间
	 */
	public void Elementaction(WebDriver z_driver,String z_Type,String z_elements,long time)
	{
		Actions action = new Actions(z_driver);
		action.moveToElement(get_Element( z_driver, z_Type, z_elements)).perform();
		ms(time);
	}
	/*
	 * isElementExsit(WebDriver z_driver, String z_element)
	 * 判断元素是否存在
	 * 参数：z_driver 浏览器驱动对象   z_element 元素名称字符串
	 */
	public boolean isElementExsit(WebDriver z_driver,String z_Type, String z_elements) {  
		boolean flag = false;  
		try {  
			//temp_test( z_driver, z_Type, z_elements); 
			WebElement element=get_Element( z_driver, z_Type, z_elements); 
			//System.out.print("元素:"+z_elements.toString()+"--存在!**"); 
			Log.run.error("元素:"+z_elements.toString()+"--存在!**");
			flag=null!=element;
			flag =true ;
		} 
		catch (org.openqa.selenium.NoSuchElementException e) {
			//System.out.println("元素:"+z_elements.toString()+"--不存在!**"); 
			Log.run.error("元素:"+z_elements.toString()+"--不存在!**");
			return false;
		}
		return flag;  
	}  
	
	/**
	 * @author bony
	 * 自定义元素获取temp_test
	 * @param z_driver  WebDriver对象参数
	 * @param z_Type 元素类型
	 * @param z_elements 元素
	 * @return WebElement类型元素
	 */
	public WebElement get_Element(WebDriver z_driver,String z_Type,String z_elements)
	{
		WebElement element=null;
		switch (z_Type)
		{
		case "id":		element=z_driver.findElement(By.id(z_elements)); break;
		case "name":	element=z_driver.findElement(By.name(z_elements)); break;
		case "xpath":	element=z_driver.findElement(By.xpath(z_elements)); break;
		case "tagName":	element=z_driver.findElement(By.tagName(z_elements)); break;
		case "linkText":element=z_driver.findElement(By.linkText(z_elements)); break;
		case "className":		element=z_driver.findElement(By.className(z_elements)); break;
		case "cssSelector":		element=z_driver.findElement(By.cssSelector(z_elements)); break;
		case "partialLinkText": element=z_driver.findElement(By.partialLinkText(z_elements)); break;

		/*default: 
				{
					System.out.println("代码中出现乱七八糟的参数！");//return null;
					element=z_driver.findElement(By.name(z_Type+"d#$%^&*()PVKHJKJBKJHJKd")); 
					break;

				}*/
		}
		return element;
	}

	
	
	/**
	 * 产生延时
	 * @param x 延时长度 1000 > 1ms
	 */
	public void ms(long x)
	{
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 获取系统时间
	 * @return
	 */
	public String time()
	{
		SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=sm.format(new Date());
		return time;
	}

}
/*class delay_element
{
	public static void delay_element(WebDriver z_driver, String z_Type0, String z_elements0, String z_Type1, String z_elements1 ,String z_Type_,String z_elements_){};
	public static void delay_element(WebDriver z_driver, String z_Type, String z_elements ,String z_Type_,String z_elements_){};
}*/
