package com.xmldemo;

import java.io.File;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XmlGetSet01 {

	public String workdir;
	//读
	public  String GetresultLogin(String filename) {
		File inputXml = new File(filename);
		SAXReader saxReader = new SAXReader();
		Element emp = null;
		String nodevalue = "";
		try {
			Document document =  saxReader.read(inputXml);
			emp = document.getRootElement();
		}catch(DocumentException  e) {
			Log.run.error(e.getMessage());
		}
		return emp.elementText("ProjectValue");
	}
	//写
	public boolean ReWriterXML(String task,String file) {
		boolean flag = true;
		try {
			File directory = new File(".");
			workdir = directory.getCanonicalPath();
			file =  workdir + "/" +file;
			if (!file.equals("")) {
//				HttpCookieHead cok = new HttpCookieHead();
//				membercodeToken = cok.Handelsetcookie(task);
//				XMLWriter writer = new XMLWriter(new FileWriter(file));
//				System.out.println(file);
//				Document doc = createDoc(membercodeToken);
//				writer.write(doc);
//				writer.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	
	public Document createDoc(String[] parm) {
		Document doc = DocumentHelper.createDocument();
		Element root = doc.addElement("project");
		Element memebercode = root.addElement("membercode").addText(parm[1]);
		Element token = root.addElement("token").addText(parm[0]);
		return doc;
	}


}
