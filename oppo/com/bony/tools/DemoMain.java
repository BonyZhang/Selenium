package com.bony.tools;

import java.util.ArrayList; 


/**
 * 2015/07/31
 * @author bony
 *
 */
public class DemoMain {
	public static ElementTool tool=new ElementTool();
	public static void main(String[] arg)
	{
		//xmldemo();
		//exceldemo();		
		Reportdemo();
	}
	static void xmldemo()
	{
		XmlTool xml=new XmlTool();
		//获取节点的所有文本内容
		ArrayList<String> neirong0=xml.getNodeValues("test1","./Xml/demo.xml");
		System.out.println("获取节点的所有文本内容:"+neirong0);
		//获取节点的所有属性
		//ArrayList<String> tey=xml.getNodeAttributes("img","src","./Xml/demo.xml");
		ArrayList<String> tey=xml.getNodeAttributes("include","name","./Xml/demo.xml");
		System.out.println("获取节点的所有属性:"+tey);		
		//返回父节点下的所有子节点名称
		ArrayList<String> name=xml.getChildNodes("oppo", "./Xml/demo.xml");
		System.out.println("返回父节点下的所有子节点名称:"+name);
		//获取节点文本内容
		String neirong1=xml.getNodeValue("test1", "./Xml/demo.xml");
		System.out.println("获取节点文本内容:"+neirong1);
		
		for(long a=0;a<1;a++){
			System.out.println("Xml解析demo调试.........");
			Log.run.error("Xml解析log调试.........");
		}

	}
	public static void exceldemo()
	{
		ExcelTool excel=new ExcelTool(); 
		for(int i=0;i<200;i++)
			for(int j=0;j<200;j++)
			{
				///a=i*10+j;	
				String filepath="./Excel/Deo"+i+""+j+".xls";
				excel.SetExcel(filepath,0,0,0,"北京现代");
			}
	}
	public static void Reportdemo()
	{
		//String[] values=null;
		ArrayList<String> list=new ArrayList<String>();
		list.add("0");
		System.out.println(list.get(0));
		list.set(0, "2");
		System.out.println(list.get(0));
		ExcelReport er = new ExcelReport(0, "./Excel/报告文档输出测试.xls");
		er.report(0,"时间", "地点", "人物");
		er.report(0,er.timeHour(), "地点"+er.EXCELROM, "人物"+er.EXCELROM); 
	}
	
}
