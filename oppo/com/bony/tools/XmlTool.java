package com.bony.tools;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * 读取XML
 * @author leshuo
 * @version 2014年4月21日
 */
public class XmlTool {

	private static Document doc;
	//private static String projectPath=temptool.getPath();

	/**
	 * 获取节点文本内容
	 * @param node 节点名ucfile xml文件路径
	 * @return 节点文本内容，没有去除空格
	 */
	public String getNodeValue(String node,String ucfile)
	{
		buildParse(ucfile);//projectPath+"\\src\\resource\\config.xml");
		NodeList list=doc.getElementsByTagName(node);
		if(list!=null && list.getLength()==1){
			Element e=(Element) list.item(0);
			return e.getTextContent();
		}else
			return null;		
	}

	/**
	 * 获取节点的所有文本内容
	 * @param node 节点名称
	 * @return 节点文本内容数组
	 */
	public ArrayList<String> getNodeValues(String node,String ucfile)
	{
		ArrayList<String>  strArray = new ArrayList<String> ();
		buildParse(ucfile);
		try{
			NodeList list=doc.getElementsByTagName(node);
			if(list!=null){
				for(int i=0;i<list.getLength();i++){
					Element e=(Element) list.item(i);
					strArray.add(e.getTextContent());
				}
			}
		}catch(Exception e){
			Log.run.error("节点"+node+"不存在");
		}

		return strArray;
	}

	/**
	 * 获取节点的所有属性
	 * @param node 节点
	 * @param str 属性名
	 * @return 属性值
	 */
	public ArrayList<String> getNodeAttributes(String node,String str,String ucfile)
	{
		ArrayList<String>  strArray = new ArrayList<String> ();
		buildParse(ucfile);
		try{
			NodeList list=doc.getElementsByTagName(node);
			if(list!=null){
				for(int i=0;i<list.getLength();i++){
					Element e=(Element) list.item(i);
					try{
						strArray.add(e.getAttribute(str));
					}catch(Exception e1){
						Log.run.error("属性"+str+"不存在");
					}

				}
			}
		}catch(Exception e){
			Log.run.error("节点"+node+"不存在");
		}
		return strArray;
	}

	/**
	 * 获取节点属性值
	 * @param e
	 * @param str
	 * @return
	 */
	public String getNodeAttribute(Element e,String str)
	{
		return e.getAttribute(str);
	}

	/**
	 * 返回子节点列表
	 * @param e 父元素
	 * @return 子节点列表
	 */
	private static NodeList getChildNodes(Element e){
		return e.getChildNodes();
	}

	/**
	 * 返回父节点下的所有子节点名称
	 * @param str 父节点
	 * @return
	 */
	public ArrayList<String> getChildNodes(String str,String ucfile){
		ArrayList<String>  strArray = new ArrayList<String> ();
		buildParse(ucfile);
		try{
			NodeList list=doc.getElementsByTagName(str);
			if(list!=null){
				for(int i=0;i<list.getLength();i++){
					Element e=(Element) list.item(i);
					NodeList childList=getChildNodes(e);
					try{
						//System.out.println(e.getNodeName());
						for(int j=0;j<childList.getLength();j++){
							Node chiledE=childList.item(j);
							if(chiledE instanceof Element)
								strArray.add(chiledE.getNodeName());
						}
					}catch(Exception e1){
						Log.run.error("节点"+str+"下不存在子节点");
					}

				}
			}
		}catch(Exception e){
			Log.run.error("节点"+str+"不存在");
		}
		return strArray;
	}

	/**
	 * 生成文档对象
	 * @param filePath
	 */
	private void buildParse(String filePath){
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder builder = dbf.newDocumentBuilder();
			doc = builder.parse(new File(filePath));
		}catch(Exception e){
			Log.run.error(filePath+"不存在");
			e.printStackTrace();
		}
	}

}


