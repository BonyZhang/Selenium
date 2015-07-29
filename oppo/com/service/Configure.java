package com.service;

import com.bony.tools.ExcelReport;
import com.bony.tools.Tool;

/**
 * test 测试参数配置Java文件
 * @author bony
 * @
 *
 */
public class Configure {
	
	/**CHROMEFILEPATH：chrome浏览器驱动地址*/
	public static String CHROMEFILEPATH="C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe";
	/**WWW：TEST测试网址*/
	public static String WWW="http://www.oppo.com/cn/";
	/**OPPO_USER：oppo测试账号*/;
	public static String OPPO_USER01="13650089145@163.com";
	public static String OPPO_USER="13650089145";
	/**OPPO_PASSWORD：oppo测试账号密码*/
	public static String OPPO_PASSWORD="123qwe";
	/**QQ_USER：QQ测试账号*/
	public static String QQ_USER="13650089145";
	/**QQ_PASSWORD:测试密码*/
	public static String QQ_PASSWORD="123qwe";
	/**SINA_USER：新浪测试账号*/
	public static String SINA_USER="13650089145";
	/**SINA_PASSEORD：新浪测试密码*/
	public static String SINA_PASSEORD="123456qwe";
	/**TAOBAO_USER：淘宝测试账号*/
	public static String TAOBAO_USER="13650089145";
	/**TAOBAO_PADDWORS：掏宝测试密码*/
	public static String TAOBAO_PADDWORS="123qwe";
	public static String time=Tool.gettime();
	
	/**EXCEL_ELECTION：定义Excel的输出类型*/
	public static int EXCEL_ELECTION=2;

	/**filepath：Excel地址*/
	private static String filepath = "./Excel/oppotest("+ExcelReport.TimeMinute()+").xls";
	/**ExcelReport：定义Excel报告类*/
	public static  ExcelReport excelreport=new ExcelReport(0, filepath);
}
