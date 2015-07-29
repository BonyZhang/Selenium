package com.bony.tools;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 * Excel行写函数，无单元格格式设置,行自加
 * @author bony
 *
 */
public class ExcelReport {

	private ExcelTool excel=new ExcelTool();
	/**EXCELROM: 表格行定义*/
	public int EXCELROM;
	/**EXCELCELL: 表格列定义*/
	public int EXCELCELL;
	/**EXCELCELLFILEPATH: 表格路径定义*/
	private String EXCELCELLFILEPATH;
	public ExcelReport(){}
	public ExcelReport(int stare,String filepath)
	{
		EXCELROM=stare;
		EXCELCELLFILEPATH = filepath;
		//excel.EXCELCELL=0;
	}
	/**
	 * 
	 * @param a
	 */
	public void report(int cell,String a)
	{
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,cell,a);
		System.out.println(EXCELROM+"|"+a);
		EXCELROM++;
	}
	public void report(int cell,String a,String b)
	{
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,cell,a);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,b);
		System.out.println(EXCELROM+"|"+a+"|"+b);
		EXCELROM++;
	}
	public void report(int cell,String a,String b,String c)
	{
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,a);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,b);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,c);
		System.out.println(EXCELROM+"|"+a+"|"+b+"|"+c);
		EXCELROM++;
	}
	public void report(int cell,String a,String b,String c,String d)
	{
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,a);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,b);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,c);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,d);
		System.out.println(EXCELROM+"|"+a+"|"+b+"|"+c+"|"+d);
		EXCELROM++;
	}
	public void report(int cell,String a,String b,String c,String d,String e)
	{
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,a);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,b);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,c);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,d);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,++cell,e);
		System.out.println(EXCELROM+"|"+a+"|"+b+"|"+c+"|"+d+"|"+e);
		EXCELROM++;
	}
	
	public void report(ArrayList<String> list)
	{
		for(int cell=0;cell<list.size();cell++)
		{
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,cell,list.get(cell));
		System.out.println(EXCELROM+"|"+list.get(cell));
		}
		EXCELROM++;
	}
	
	
	
	/**
	 * 系统时间获取静态该函数，精确到分钟
	 * 格式为yyyy-MM-dd hh.mm
	 * @return
	 */
	public static String TimeMinute()
	{
		SimpleDateFormat sm=new SimpleDateFormat(" yyyy-MM-dd hh.mm ");
		String time=sm.format(new Date());
		return time;
	}
	/**
	 * 系统时间获取非静态该函数，精确到分钟
	 * 格式为yyyy-MM-dd hh.mm
	 * @return
	 */
	public String timeMinute()
	{
		SimpleDateFormat sm=new SimpleDateFormat(" yyyy-MM-dd hh.mm ");
		String time=sm.format(new Date());
		return time;
	}
	/**
	 *系统 时间获取静态该函数，精确到小时
	 * 格式为yyyy-MM-dd hh
	 * @return
	 */
	public static String TimeHour()
	{
		SimpleDateFormat sm=new SimpleDateFormat(" yyyy-MM-dd hh ");
		String time=sm.format(new Date());
		return time;
	}
	/**
	 * 系统时间获取非静态该函数，精确到小时
	 * 格式为yyyy-MM-dd hh
	 * @return
	 */
	public String timeHour()
	{
		SimpleDateFormat sm=new SimpleDateFormat(" yyyy-MM-dd hh ");
		String time=sm.format(new Date());
		return time;
	}
	
	
	public String timea()
	{
		SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=sm.format(new Date());
		System.out.println("-----");
		return time;
	}
	public String timeSecond()
	{
		SimpleDateFormat sm=new SimpleDateFormat("HH:mm:ss");
		String time=sm.format(new Date());
		return time;
	}
	
	
}
