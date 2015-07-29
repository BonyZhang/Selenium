package com.bony.tools;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tool {

	/**
	 * 自定义延时函数
	 * 参数long 建议设置大小1000~4000
	 * @param x
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
	 * 自定义延时函数
	 * 参数long 建议设置大小1000~4000
	 * @param x
	 */
	public void sleep(long x)
	{
		for(long i=0;i<x;i++)
			for(long j=0;j<x;j++)
				for(long k=0;k<x;k++);
	}

	/**
	 * 获取当前时间
	 * @return 形如2014/04/22 10-10-10的日期
	 * @throws IOException
	 */
	public static String gettime()
	{
	SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String time=sm.format(new Date());
	System.out.println("-----");
	return time;
	}
}


/**
 * 工具类提供：获取当前日期，获取文件路径等方法
 * @author leshuo
 * @version 2014年4月22日
 */
class temptool {
	
	/**
	 * 获取当前日期
	 * @return 形如2014/04/22 10-10-10的日期
	 * @throws IOException
	 */
	public static String getCurrentDate() throws IOException{
		int y,m,d,h,mi,s;  
		Calendar cal=Calendar.getInstance();    
		y=cal.get(Calendar.YEAR);    
		m=cal.get(Calendar.MONTH);    
		d=cal.get(Calendar.DATE);    
		h=cal.get(Calendar.HOUR_OF_DAY);    
		mi=cal.get(Calendar.MINUTE);    
		s=cal.get(Calendar.SECOND);
		if((m+1)<10)
			return y+"/0"+(m+1)+"/"+d+" "+h+"-"+mi+"-"+s;
		else
			return y+"/"+(m+1)+"/"+d+" "+h+"-"+mi+"-"+s;
	}
	
	/**
	 * 获得当前项目的绝对路径
	 */
	public static String getPath(){
		try{
			File directory = new File("");
			String courseFile = directory.getCanonicalPath() ; 
			return courseFile;
		}catch(IOException e){
			System.out.println("没有获取到项目路径，请检查项目文件!");
			//Log.run.error("没有获取到项目路径，请检查项目文件!");
			return null;
		}
		
		
	}
}
