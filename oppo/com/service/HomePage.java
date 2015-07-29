package com.service;

import org.openqa.selenium.*;

import com.bony.tools.*;

public class HomePage {

	private ElementTool elementtool=new ElementTool();
	public boolean banner(WebDriver driver,ExcelReport excelreport)
	{
		boolean flag=false;
		driver.findElement(By.xpath("html/body/main/section[1]/span[1]")).click();
		System.out.println("左");
		elementtool.ms(0);
		driver.findElement(By.xpath("html/body/main/section[1]/span[2]")).click();
		System.out.println("右");
		elementtool.ms(0);
		return flag;
		
	}
}
