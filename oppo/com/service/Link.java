package com.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.bony.tools.ElementTool;
	/**
	 * 方法函数
	 * @author bony
	 * @param driver
	 * @return flag
	 *oppo官网首页、产品、品牌、在线商城、体验店、服务页面顶部：手机助手、云服务、ColorOS、社区外链检查
	 *oppo_com/oppo_com1/oppo_com2/oppo_com3/oppo_com4/oppo_com5
	 *
	 */
public class Link {
	
	/**
	 * 
	 * @author bony
	 * @param driver
	 * @return flag
	 * 
	 */
	//首页：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com01(WebDriver driver)
	{
		ElementTool tool=new ElementTool();
		long time=2000;
		boolean flag=true;
		driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("首页：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//产品页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com02(WebDriver driver)
	{
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/nav/div/ul/li[2]/a/span")).click();	
		driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("产品页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//品牌页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com03(WebDriver driver)
	{
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/a/span[1]")).click();	
		driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("品牌页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//在线商城页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com04(WebDriver driver)
	{
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/a/span[1]")).click();	
		driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("在线商城页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//体验店页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com05(WebDriver driver)
	{
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/nav/div/ul/li[5]/a/span")).click();	
		driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("体验店页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//服务页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com06(WebDriver driver)
	{
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        driver.findElement(By.xpath("/html/body/header/div[2]/div/div[2]/nav/div/ul/li[6]/a/span")).click();	
		driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("服务店页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//品牌-关于OPPO页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com03_01(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		long time=2000;
		boolean flag=true;
        //鼠标悬浮在品牌导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/a/span[1]"))).perform();
        tool.ms(time);
        //点击品牌导航标签下面关于OPPO
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/ul/li[1]/a")).click();		
        driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("品牌-关于OPPO页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//品牌-OPPO历史：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com03_02(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        //鼠标悬浮在品牌导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/a/span[1]"))).perform();
        tool.ms(time);
        //点击品牌导航标签下面OPPO历史
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/ul/li[2]/a")).click();		
        driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("品牌-OPPO历史页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//品牌-OPPO风采页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com03_03(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        //鼠标悬浮在品牌导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/a/span[1]"))).perform();
        tool.ms(time);
        //点击品牌导航标签下面OPPO风采
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/ul/li[3]/a")).click();		
        driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("品牌-OPPO风采页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//品牌-官方新闻页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com03_04(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        //鼠标悬浮在品牌导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/a/span[1]"))).perform();
        tool.ms(time);
        //点击品牌导航标签下面官方新闻
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/ul/li[4]/a")).click();		
        driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("品牌-官方新闻页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//品牌-我们的视频页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com03_05(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        //鼠标悬浮在品牌导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/a/span[1]"))).perform();
        tool.ms(time);
        //点击品牌导航标签下面我们的视频
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[3]/ul/li[5]/a")).click();		
        driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("品牌-我们的视频页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	

	//在线商场-手机列表页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com04_01(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        //鼠标悬浮在在线商城导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/a/span[1]"))).perform();
        tool.ms(time);
        //点击在线商城导航标签下面手机
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/ul/li[1]/a")).click();		
        driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("在线商城-手机列表页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//在线商场-配件列表页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com04_02(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        //鼠标悬浮在在线商城导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/a/span[1]"))).perform();
        tool.ms(time);
        //点击在线商城导航标签下面配件
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/ul/li[2]/a")).click();		
        driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("在线商城-配件列表页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//在线商场-购物指南页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com04_03(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        //鼠标悬浮在在线商城导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/a/span[1]"))).perform();
        tool.ms(time);
        //点击在线商城导航标签下面购物指南
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/ul/li[3]/a")).click();		
        driver.findElement(By.linkText("社区")).click();
		driver.findElement(By.linkText("ColorOS")).click();
		driver.findElement(By.linkText("云服务")).click();
		driver.findElement(By.linkText("手机助手")).click();
		tool.ms(time);
		System.out.println("在线商城-购物指南页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"手机助手","OPPO手机助手—OPPO官方最安全的助手");driver.close();	
		flag&=tool.toTitle(driver,"云服务","OPPO云服务登录");driver.close();
		flag&=tool.toTitle(driver,"ColorOS","ColorOS官方网站");driver.close();
		flag&=tool.toTitle(driver,"社区","『OPPO官方社区』OPPO手机社区_OPPO手机官方交流平台-OPPO社区官网");driver.close();
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
	//在线商场-积分服务页面：社区+ColorOS+云服务+手机助手链接检查
	public boolean oppo_com04_04(WebDriver driver)
	{
		Actions action = new Actions(driver);
		ElementTool tool=new ElementTool();
		boolean flag=true;
		long time=2000;
        //鼠标悬浮在在线商城导航标签上面
        action.moveToElement(driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/a/span[1]"))).perform();
        tool.ms(time);
        //点击在线商城导航标签下面积分服务
        driver.findElement(By.xpath("html/body/header/div[2]/div/div[2]/nav/div/ul/li[4]/ul/li[4]/a")).click();		
        tool.ms(time);
		System.out.println("在线商城-积分服务页面：社区+ColorOS+云服务+手机助手链接检查");
		flag&=tool.toTitle(driver,"OPPO积分商城","OPPO积分商城");driver.close();	
		tool.toTitle(driver,"官网","『OPPO手机官网』OPPO智能手机_OPPO最新款手机-OPPO智能手机官方网站");
		System.out.println("Title判断完成");
		return flag;
	}
}
