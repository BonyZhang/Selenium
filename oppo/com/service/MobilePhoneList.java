package com.service;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.bony.tools.ElementTool;
import com.bony.tools.ExcelReport;
import com.bony.tools.Log;
/**
 * 手机列表业务类
 * @author bony
 * @param 去到手机列表：public boolean toMobilePhoneList(WebDriver driver)
 * @param 遍历全部手机：public boolean ErgodicPhone(WebDriver driver)
 * @param 遍历筛选：public boolean ScreeningList(WebDriver driver)
 *
 */
public class MobilePhoneList {
	
	private ElementTool elementtool=new ElementTool();
	private long time=1500;
	private int ExcelElection=Configure.EXCEL_ELECTION;
	//手机列表页数
	//手机列表每页手机数
	
	/**
	 * 去到手机列表页面，并给出是否在手机页面的结果
	 * @author bony
	 * @param driver
	 * @return boolean类型， 判断结果值 true 成功,的flase 失败
	 */
	public boolean toMobilePhoneList(WebDriver driver,ExcelReport excelreport)
	{
		String titel="『OPPO最新款智能手机在线订购』OPPO最新款智能手机在线购买_OPPO最新款智能手机快捷支付-OPPO智能手机官网";
		Actions action = new Actions(driver);
		boolean flag=false;
		try
		{
			//鼠标悬浮在在线商城导航标签上面
	        action.moveToElement(driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/a/span[1]"))).perform();
	        elementtool.ms(time);
	        //点击在线商城导航标签下面手机列表
			driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/ul/li[1]/a")).click();
			flag=elementtool.WhetherTitle(driver,titel);
			excelreport.report(0,elementtool.time(),"鼠标悬浮在在线商城导航标签上面",flag+"");
			excelreport.report(0,elementtool.time(),"点击>手机",flag+"");
			excelreport.report(0,elementtool.time(),"进入手机列表页面",flag+"");
			return flag;	
		}
		catch(Exception e)
		{
			flag=false;
			excelreport.report(0,elementtool.time(),"鼠标悬浮在在线商城导航标签上面",flag+"");
			excelreport.report(0,elementtool.time(),"点击>手机",flag+"");
			excelreport.report(0,elementtool.time(),"进入手机列表页面",flag+"");
			return flag;
		}
		//if(tool.isElementExsit(driver,"linkText","手机列表"))flag=true;
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
			element=driver.findElement(By.xpath("html/body/main/div[2]/article/div[2]/div[2]/div[1]/h1")).getText();
			Log.run.error("关闭"+elementtool.WhetherTitle(driver,z_Title));
			driver.close(); 
			}
		}
		elementtool.toTitle(driver,z_name,z_Title);//回到指定的窗口
		return element;
		
	}
	/**
	 * 遍历手机(手机列表筛选结果无分页或者只有一台手机时使用)
	 * @author bony	
	 * @param driver
	 * @return 筛选结果遍历，全部执行完成返回true
	 */
	public boolean ErgodicPhoneE(WebDriver driver,ExcelReport excelreport)
	{
		boolean flag=false;
		String titelname="手机列表";
		String titel="『OPPO最新款智能手机在线订购』OPPO最新款智能手机在线购买_OPPO最新款智能手机快捷支付-OPPO智能手机官网";
		String temp=null;
		String MobliesName=null;
		String MoblieName=null;
		excelreport.report(0,elementtool.time(),"手机","结果页面","对比结果");
		try{
			for(int b=1;b<=12;b++)
			{
				//if(a==5&b==2)break;
					temp="html/body/main/div[3]/div[1]/div[2]/div/div["+b+"]/h2/a[2]";
					driver.findElement(By.xpath(temp)).click();
					
	
				MobliesName=driver.findElement(By.xpath(temp)).getText();
				MoblieName=MobliePhone(driver,titelname,titel);
				if(MobliesName.contains(MoblieName))flag=true;else flag=false;
				
				//temp=elementtool.ClickTitle(driver,titelname,titel);
				excelreport.report(0,elementtool.time(),MobliesName,MoblieName,flag+"");
			}
		}
		catch(Exception e)
		{
			temp="html/body/main/div[3]/div[1]/div[2]/div/div/h2/a[2]";
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
		flag=true;
		return flag;
	}
	/**
	 * 遍历手机
	 * @author bony	
	 * @param driver
	 * @return 执行结果，全部执行完成返回true
	 */
	public boolean ErgodicPhone(WebDriver driver,ExcelReport excelreport)
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
		flag=true;
		return flag;
	}

	/**
	 * 筛选结果手机遍历
	 */
	public String MobliePhoneListResult(WebDriver driver,ExcelReport excelreport)
	{
		String temp=null;
		if(elementtool.isElementExsit(driver,"xpath","html/body/main/div[4]/div/p/a"))temp="筛选结果无手机";
		else 
		{
			try{
				//通过判断是否有分页元素
				if(elementtool.isElementExsit(driver,"xpath","html/body/main/div[3]/div[2]/ul")) 
					{
					temp="筛选结果";
					ErgodicPhone(driver,excelreport);
					
					}
				else 				
					{
					temp="筛选结果";
					ErgodicPhoneE(driver,excelreport);
					}
				}
			catch(Exception e){
				}
		}
		return temp;
	}

	/**
	 * 预设手机系列名称
	 * @param Series手机列表系列：1~5 1>全部手机2>Find系列3>N系列4>R系列5>A系列
	 */
	public String MobliePhoneListSeries(int Series)
	{
		String series=null;
		switch(Series)
		{
		case 1:series="全部"; break;
		case 2:series="Find系列"; break;
		case 3:series="N系列"; break;
		case 4:series="R系列"; break;
		case 5:series="A系列"; break;
		}
		return series;
	}
	/**
	 * 遍历筛选
	 * @author bony
	 * @param driver
	 * @return 执行结果，全部执行完成返回true
	 */
	public boolean ScreeningList(WebDriver driver,ExcelReport excelreport)
	{
		boolean flag=false;
		String Lista=null;
		String Listb=null;
		String Listc=null;
		String Listd=null;
		String Moblie;
        //点击Find系列
		excelreport.report(0," ");
		excelreport.report(0,elementtool.time(),"系列","网络","价格","屏幕尺寸");
		for(int a=1;a<=5;a++)
		{
			Lista=".//*[@id='type-category']/div/div["+a+"]/a/img";
			driver.findElement(By.xpath(Lista)).click();
			Lista=MobliePhoneListSeries(a);
			for(int b=1;b<=6;b++)
			{
				Listb=".//*[@id='type-network']/li["+b+"]/a";
				driver.findElement(By.xpath(Listb)).click();
				Listb=driver.findElement(By.xpath(Listb)).getText();
				for(int c=1;c<=5;c++)
				{
					Listc=".//*[@id='type-price']/li["+c+"]/a";
					driver.findElement(By.xpath(Listc)).click();
					Listc=driver.findElement(By.xpath(Listc)).getText();
					for(int d=1;d<=4;d++)
					{
						Listd=".//*[@id='type-size']/li["+d+"]/a";
						driver.findElement(By.xpath(Listd)).click();
						Listd=driver.findElement(By.xpath(Listd)).getText();
						/**写Excel*/
						excelreport.report(1,Lista,Listb,Listc,Listd);
						Moblie =MobliePhoneListResult(driver,excelreport);
						excelreport.report(1,Moblie);
					}
				}
			}
		}
		flag=true;
		return flag;		
	}

}
