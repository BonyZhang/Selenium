package com.service;

import java.util.Set;

import org.openqa.selenium.*;

import com.bony.tools.*;
import com.bony.tools.ExcelReport;
import com.bony.tools.Log;
import com.bony.tools.Tool;
import com.excelgetsetdemo.*;

/**
 * 购买商品的一个类
 * @author bony
 *
 */
public class Buy {

	private ElementTool elementtool=new ElementTool();
	private long time=1500;
	private int ExcelElection=Configure.EXCEL_ELECTION;
	/**
	 * 遍历手机(不含错误处理)
	 * @author bony	
	 * @param driver
	 * @return 执行结果，全部执行完成返回true
	 */
	public boolean BuyMobile(WebDriver driver,ExcelReport excelreport)
	{

			boolean flag=false;
			String titelname="手机列表";
			String titel="『OPPO最新款智能手机在线订购』OPPO最新款智能手机在线购买_OPPO最新款智能手机快捷支付-OPPO智能手机官网";
			String temp=null;
			String MobliesName=null;
			String MoblieName=null;
			excelreport.report(0,elementtool.time(),"手机","结果页面","对比结果");
			for(int a=2;a<=5;a++)
			{
				temp="html/body/main/div[3]/div[2]/ul/li["+a+"]";
				driver.findElement(By.xpath(temp)).click();
				for(int b=1;b<=12;b++)
				{
					//if(a==5&b==2)break;
					temp="html/body/main/div[3]/div[1]/div[2]/div/div["+b+"]/h2/a[2]";
					driver.findElement(By.xpath(temp)).click();
					
					MobliesName=driver.findElement(By.xpath(temp)).getText();
					MoblieName=MobliePhone(driver,titelname,titel);
					if(MobliesName.contains(MoblieName))flag=true;else flag=false;
					
					//temp=elementtool.ClickTitle(driver,titelname,titel);
					
					//Excel输出条件判断
					if(ExcelElection==0)
					{
					if(flag==false)excelreport.report(0,elementtool.time(),MobliesName,MoblieName,flag+"");
					}
					else if(ExcelElection==1) 
					{
					if(flag==true)excelreport.report(0,elementtool.time(),MobliesName,MoblieName,flag+"");
					}
					else excelreport.report(0,elementtool.time(),MobliesName,MoblieName,flag+"");
				}
			}	
			flag&=true;
			return flag;
		
	}
	
	/**去到打开的的商详页，获取商详页面的参数,对比传进来的参数，并关闭该页面
	 *  
	 */
	public String MobliePhone(WebDriver driver,String z_name,String z_Title)
	{
		
		String element=null;
		Set<String> handles = driver.getWindowHandles();  
		for (String s : handles){  
			driver.switchTo().window(s); //去到窗口
			element=driver.getTitle();
			if(!elementtool.WhetherTitle(driver,z_Title))
			{
			//获取商详页面的商品名称
				try{
					//返回手机名称
					element=driver.findElement(By.xpath("html/body/main/div[2]/article/div[2]/div[2]/div[1]/h1")).getText();
					buymoblie(driver);
					elementtool.ms(2000);
					Log.run.error("关闭"+elementtool.WhetherTitle(driver,z_Title));
				}
				catch(Exception e)
				{
					//返回字符没找到手机名称
					element="没找到手机名称";
				} 
				driver.close();
			}
		}
		elementtool.toTitle(driver,z_name,z_Title);//回到指定的窗口
		return element;
		
	}
	public void buymoblie(WebDriver driver)
	{
		System.out.println("购物..车..");
		driver.findElement(By.xpath(".//*[@id='add-cart-form']/div[3]/div[2]/button")).click();
		System.out.println("完善..订单..");
		elementtool.ms(500);
		driver.findElement(By.xpath(".//*[@id='shipping_btn']")).click();
		System.out.println("确认..订单..");
		elementtool.ms(500);
		driver.findElement(By.xpath(".//*[@id='order-create-form']/div/div[8]/div[2]/a")).click();
		System.out.println("确认..OK..");
	}

}
