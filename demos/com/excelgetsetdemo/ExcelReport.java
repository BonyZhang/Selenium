package com.excelgetsetdemo;

import java.text.SimpleDateFormat;
import java.util.Date;



public class ExcelReport {

	private ExcelTool excel=new ExcelTool();
	public int EXCELROM;
	public int EXCELCELL;
	private String EXCELCELLFILEPATH;
	public void initecel(int stare,String filepath)
	{
		EXCELROM=stare;
		EXCELCELLFILEPATH = filepath;
		//excel.EXCELCELL=0;
	}
	public void report(String ONE,String TWO,String THORE)
	{
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,0,ONE);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,1,TWO);
		excel.SetExcel(EXCELCELLFILEPATH,0,EXCELROM,2,THORE);
		EXCELROM++;
	}
	
	
	
	public static void main(String[] arg)
	{
		System.out.println(time());
	}
	public static String time()
	{
		SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=sm.format(new Date());
		System.out.println("-----");
		return time;
	}
	public String timea()
	{
		SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=sm.format(new Date());
		System.out.println("-----");
		return time;
	}
}
