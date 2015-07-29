package com.xmldemo;

import java.util.ArrayList;

public class DemoMain {
	public static void main(String[] arg)
	{
		XmlRead xml=new XmlRead();
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
}
