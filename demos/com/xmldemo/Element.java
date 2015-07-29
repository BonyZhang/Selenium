package com.xmldemo;

import java.io.File;
import java.util.HashMap;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.testng.TestException;
//
//import jxl.Cell;
//import jxl.Sheet;
//import jxl.Workbook;


/**
 * 页面对象
 */
public class Element {
	
	//public static Log log = LoggerFactory.getLogger(TestObject.class); 
	
	public static final String BY_ID 					= "id";
	public static final String BY_CLASS_NAME 			= "className";
	public static final String BY_TAG_NAME 				= "tagName";
	public static final String BY_NAME 					= "name";
	public static final String BY_LINK_TEXT 			= "linkText";
	public static final String BY_PARTIAL_LINK_TEXT		= "partialLinkText";
	public static final String BY_CSS_SELECTOR			= "cssSelector";
	public static final String BY_XPATH					= "xpath";
	public static final String BY_HANDLE				= "handle";
	public static final String BY_ANDROID_UI_AUTOMATOR	= "androidUIAutomator";
	public static final String BY_QUERY_SELECTOR		= "querySelector";

	public static final String CATEGORY_WEB				= "Web";
	public static final String CATEGORY_NATIVE_APP		= "NativeApp";
	
	
	
	public class UiObj {
		/** 对象标识 */
		public String id;
		
		/** 对象名称 */
		public String name;
		
		/** 页面*/
		public String page;
		
		/** 对象组序号 */
		public String index;
		
		/** 定位方式	*/
		public String locType;
		
		/** 定位标识*/
		public String locValue;
		
		/** 对象分类*/
		public String category;
	}
	
	private HashMap<String, UiObj> data = new HashMap<String, UiObj>();
	
	/**
	 * 获取一行数据中的指定列内容
	 * @param columns 行数据	
	 * @param idx 列
	 * @return
	 */
//	private String getContent(Cell columns, int idx) {
//		if (columns == null || idx >= columns.length) return "";
//		
//		try {
//			return columns[idx].getContents().toString();
//		}
//		catch (Exception e) {
//			return "";
//		}
//	}
	
//	public void TestObject(TestTask task) throws Exception {
//		
//		// 读取脚本
//		Workbook book = null;
//		try {
//			book	= Workbook.getWorkbook(new File(task.getTestObjectFile()));
//			Sheet sheet		= book.getSheet("    ");
//
//			for (int i=1; i<sheet.getRows(); i++) {
//				Cell [] c	= sheet.getRow(i);
//				if (c.length >= 6) {
//					UiObj obj = new UiObj();
//
//					obj.page	 	= getContent(c, 0);
//					obj.name 		= getContent(c, 1);
//					obj.id	 		= getContent(c, 2);
//					obj.locType	 	= getContent(c, 3);
//					obj.index	 	= getContent(c, 4);
//					obj.locValue 	= getContent(c, 5);
//					obj.category	= getContent(c, 6);
//					
//					if (obj.category.isEmpty()) obj.category = CATEGORY_WEB;	// ȱʡΪWeb
//
//					if (!obj.id.isEmpty() && !obj.locValue.isEmpty()) {
//						data.put(obj.id, obj);
//					}
//				}
//			}
//		} catch (Exception e) {
//			Log.run("读取页面对象文件失败:" + task.getTestObjectFile());
//			if (book !=null) book.close();		
//			throw new TestException("读取页面对象文件失败:" + task.getTestObjectFile(), e);
//		}
//		
//		if (book !=null) book.close();		
//	}
//		
	
	/**
	 * 获取页面对象
	 * 
	 * @param id
	 * @return
	 */
	UiObj getObj(String id) {
		return data.get(id);
	}
	
}