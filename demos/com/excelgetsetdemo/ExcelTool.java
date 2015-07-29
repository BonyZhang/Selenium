package com.excelgetsetdemo;
import java.io.*;

import org.apache.poi.hssf.usermodel.*;

public class ExcelTool {

	/**
	 * 根据所指文件内容自动全部读取Excel
	 * @author bony
	 * @param excelPath::文件路径
	 * @throws IOException
	 */
	public  void readExcel(String excelPath) throws IOException{
		System.out.println("开始读取excel");
		InputStream is = new FileInputStream(excelPath);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) 
		{
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null)continue;
			// 循环行Row
			for (int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++) 
			{
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if (hssfRow == null) continue;
				// 循环列Row
				for (int CellNum = 0; CellNum <= hssfRow.getLastCellNum(); CellNum++) 
				{
					HSSFCell isPhone = hssfRow.getCell(CellNum);
					if (isPhone == null)continue;
					System.out.print(isPhone+"|");
				}
				System.out.println("列完");
			}
			System.out.println("******************工作表完*********************");
		}
		hssfWorkbook.close();
	}

	/**
	 * 读取指定表行列的值
	 * @author bony
	 * @param excelPath
	 * @param sheetAT::sheet名称
	 * @param row::行
	 * @param cell::列
	 * @throws IOException
	 */
	public  void get_readExcel(String excelPath,int SheetAt,int Row,int Cell ) throws IOException{

		System.out.println("开始读取excel");
		InputStream is = new FileInputStream(excelPath);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(SheetAt);	//指定工作表
		//if (hssfSheet == null);
		HSSFRow hssfRow = hssfSheet.getRow(Row);				//指定行
		//if (hssfRow == null);
		HSSFCell isPhone = hssfRow.getCell(Cell);				//指定列
		//if (isPhone == null);
		// System.out.println("rowNum:"+rowNum);
		System.out.println(hssfSheet.getSheetName()+":"+isPhone);
		hssfWorkbook.close();
	}
	/**
	 * 写int类型值的Excel函数
	 * @author bony
	 * @param sheetAT::sheet名称
	 * @param row::行
	 * @param cell::列
	 * @param Content::值
	 * @return fileContent::写Excel字节流
	 * @throws IOException::IO异常
	 */
	public byte[] excelExport(String sheetAT,int row,int cell,int Content) throws IOException {

		ByteArrayOutputStream os = null ;
		ByteArrayInputStream is = null ;
		StringBuffer errorString = new StringBuffer();
		HSSFWorkbook wb = new HSSFWorkbook();  
		HSSFSheet Sheet = wb.createSheet(sheetAT);	//第二步，在webbook中添加一个sheet，对应Excel文件中的 sheet        
		HSSFRow hssfRow = Sheet.createRow(row);  		//第三步，在sheet中添加表头第row行，注意老版本poi对Excel的行数列数有限制 
		HSSFCell Cell=hssfRow.createCell(cell);  		//第四步，在sheet中添加表头第cell列，注意老版本poi对Excel的行数列数有限制 
		Cell.setCellValue(Content);  	
		os = new ByteArrayOutputStream(); 
		wb.write(os);
		byte[] fileContent = os.toByteArray();  
		System.out.println("Excel写入完成！");
		System.out.println("excelExport.errorString::"+errorString+is);
		wb.close();
		return fileContent; 
	}
	/**
	 * 写String类型值的Excel函数
	 * @author bony
	 * @param sheetAT::sheet名称
	 * @param row::行
	 * @param cell::列
	 * @param Content::值
	 * @return fileContent::写Excel字节流
	 * @throws IOException::IO异常
	 */
	public  byte[] excelExport(String sheetAT,int row,int cell,String Content) throws IOException {

		ByteArrayOutputStream os = null ;
		ByteArrayInputStream is = null ;
		StringBuffer errorString = new StringBuffer();
		HSSFWorkbook wb = new HSSFWorkbook();  
		HSSFSheet Sheet = wb.createSheet(sheetAT);	//第二步，在webbook中添加一个sheet，对应Excel文件中的 sheet        
		HSSFRow hssfRow = Sheet.createRow(row);  		//第三步，在sheet中添加表头第row行，注意老版本poi对Excel的行数列数有限制 
		HSSFCell Cell=hssfRow.createCell(cell);  		//第四步，在sheet中添加表头第cell列，注意老版本poi对Excel的行数列数有限制 
		Cell.setCellValue(Content);  	
		os = new ByteArrayOutputStream(); 
		wb.write(os);
		byte[] fileContent = os.toByteArray();  
		System.out.println("Excel写入完成！");
		System.out.println("excelExport.errorString::"+errorString+is);
		wb.close();
		return fileContent; 
	}


	/**
	 * 获取HSSFWorkbook函数
	 * @author bony
	 * @param excelPath 文件路径
	 * @param SheetAt 第几个表格
	 * @return hssfSheet Excel表格
	 * @throws IOException
	 */
	public HSSFWorkbook GetWorkbook(String filepath) 
	{
		System.out.println("开始获取Workbook");
		HSSFWorkbook hssfWorkbook;
			try{
				InputStream is = new FileInputStream(filepath);
				hssfWorkbook = new HSSFWorkbook(is);
				return hssfWorkbook;
			}
			catch(Exception e)
			{
				hssfWorkbook = new HSSFWorkbook();
				return hssfWorkbook;

			}
	}

	/**
	 * 获取HSSFSheet函数
	 * @author bony
	 * @param Workbook
	 * @param SheetAt
	 * @return
	 * @throws IOException
	 */
	public HSSFSheet GetSheet(HSSFWorkbook Workbook,int SheetAt) throws IOException{

		try{
			HSSFSheet hssfSheet =Workbook.createSheet(SheetAt+"");
			return hssfSheet;
		}
		catch(Exception e)
		{
			HSSFSheet hssfSheet =Workbook.getSheetAt(SheetAt);
			return hssfSheet;
		}
	}
	/**
	 * 获取HSSFRow函数
	 * @author bony
	 * @param Workbook
	 * @param SheetAt
	 * @param row
	 * @return
	 * @throws IOException
	 */
	public HSSFRow GetHSSFRow(HSSFWorkbook Workbook,int SheetAt,int row) throws IOException{
		HSSFRow Row =GetSheet(Workbook,SheetAt).getRow(row);
		if(Row == null){
			Row =GetSheet(Workbook,SheetAt).createRow(row);
		}
		return Row;
	}
	/**
	 * 获取HSSFCell函数
	 * @author bony
	 * @param Workbook
	 * @param SheetAt
	 * @param row
	 * @param cell行数
	 * @return Cell
	 * @throws IOException
	 */
	public HSSFCell GetHSSFCell(HSSFWorkbook Workbook,int SheetAt,int row,int cell) throws IOException{

		HSSFCell Cell =GetHSSFRow(Workbook,SheetAt,row).getCell(cell);
		if(Cell == null){
			Cell =GetHSSFRow(Workbook,SheetAt,row).createCell(cell);
		}
		return Cell;
	}
	/**
	 * 写入单元格HSSFCell函数
	 * @author bony
	 * @param Workbook 传入Excel生成的Workbook
	 * @param SheetAt	传入获取的Excel的sheet
	 * @param row	传入Excel表格的行数
	 * @param cell	传入Excel表格的列数
	 * @param value	传入Excel表格的需要写入的内容值
	 * @throws IOException	可能发生的IO异常
	 */
	public void SetCell(HSSFWorkbook Workbook,int SheetAt,int row,int cell,String value)throws IOException
	{
		GetHSSFCell(Workbook,SheetAt,row,cell).setCellValue(value);	 
	}	
	/**
	 * 文件流传入Excel并关闭excel
	 * @author bony
	 * @param Workbook
	 * @param xls
	 * @throws IOException
	 */
	public void quitWorkbook(HSSFWorkbook Workbook,OutputStream xls)throws IOException
	{
		ByteArrayOutputStream os = null ; 
		os = new ByteArrayOutputStream(); 
		Workbook.write(os); 
		byte[] fileContent = os.toByteArray();
		xls.write(fileContent);
		Workbook.close();
		xls.close();		
	}
	/**
	 * 
	 * @param filepath
	 * @param SheetAt
	 * @param row
	 * @param cell
	 * @param value
	 */
	public void SetExcel(String filepath,int SheetAt,int row,int cell,String value)
	{
		try
		{
			HSSFWorkbook Workbook=GetWorkbook(filepath);
			OutputStream xls= new FileOutputStream(filepath);
			SetCell(Workbook,SheetAt,row,cell,value);
			quitWorkbook(Workbook,xls);
			System.out.println("Excel写入成功！");
		}
		catch(IOException e)
		{
			System.out.println("Excel写入失败！");
		}

	}

	public static void main(String[] args){
		//			new ExcelUtil().readExcel("./conf/testData/oppo_user.xls");
		//			new ExcelUtil().get_readExcel("./conf/testData/oppo_user.xls",1,2,2);
		//			OutputStream is = new FileOutputStream("./Excel/自动化测试输出.xls");
		//			is.write(excelExport("aa航",0,1,124)); 
		//			is.write(excelExport("aa",0,0,"这个一个"));
		//			is.close();

//		String filepath="./Excel/demo1.xls";
//		SetExcel(filepath,0,0,0,"北京现代");
//		SetExcel(filepath,0,0,1,"东风日产");
//		SetExcel(filepath,0,0,2,"雪佛兰");
//		SetExcel(filepath,0,0,3,"丰田");
//		SetExcel(filepath,0,0,4,"三菱");

		//			HSSFWorkbook Workbook=GetWorkbook(filepath);
		//			OutputStream xls= new FileOutputStream(filepath);
		//			SetCell(Workbook,0,0,1,"啦啦阿拉拉拉啦的玛西亚");
		//			quitWorkbook(Workbook,xls);
	}
}







/*public static byte[] excelExport() throws IOException {

	 ByteArrayOutputStream os = null ;
    ByteArrayInputStream is = null ;
    StringBuffer errorString = new StringBuffer();

	 HSSFWorkbook wb = new HSSFWorkbook();  
    //第二步，在webbook中添加一个sheet，对应Excel文件中的 sheet  

    HSSFSheet sheet = wb.createSheet("bony");          
    //第三步，在sheet中添加表头第0行，注意老版本poi对Excel的行数列数有限制  
    HSSFRow row = sheet.createRow(0);  

    //第四步，         
   // 创建单元格样式：居中   换行
    HSSFCellStyle styleALIGN = wb.createCellStyle();  
    styleALIGN.setWrapText(true)  ;   //自动换行    
    styleALIGN.setAlignment(HSSFCellStyle.ALIGN_CENTER);//水平居中  
    styleALIGN.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中  

    // 创建单元格样式：换行
    HSSFCellStyle styleHh = wb.createCellStyle();  
    styleHh.setWrapText(true)  ;

    //创建单元格样式：靠左
    HSSFCellStyle styleLeft = wb.createCellStyle();  
    styleLeft.setAlignment(HSSFCellStyle.ALIGN_LEFT);  

    //创建单元格样式：靠右
    HSSFCellStyle styleRight = wb.createCellStyle();  
    styleRight.setAlignment(HSSFCellStyle.ALIGN_RIGHT);  
    //第七步，将文件存到流中  
    //第五步，创建表头单元格，并设置样式

    HSSFCell cell;  
    for(int i=0;i<10;i++)
    {

    cell = row.createCell(i);  
    cell.setCellValue("name"+i);   //设置列名
    cell.setCellStyle(styleALIGN);            //居中 换行 
    sheet.setColumnWidth(i, 30000);            //设置列宽

    }
    row.setHeight((short)1000);               //设置行高 



 *//**
 * 合并单元格 
 * sheet.addMergedRegion(new CellRangeAddress(0,0,0,3));   // 四个参数分别是：起始行号，终止行号， 起始列号，终止列号
 * 
 * POI中背景颜色设置方法如下:
		HSSFCellStyle style = workbook.createCellStyle();
		style.setFillBackgroundColor(HSSFColor.AQUA.index);
		cell.setCellStyle(style);

  *//*
    //第六步，写入实体数据，实际应用中这些数据从数据库得到    
    for(int i=0;i<254 ;i++)             //dataListH 为行
    {

   	HSSFRow row2 = sheet.createRow(i+1);   
   	for(int y=0;y<254;y++)         //dataListL 为 列
   	{


   		cell = row2.createCell(y);

   		cell.setCellValue("bony+aaa"+y);  
			cell.setCellStyle(styleLeft);   //字符靠左 		

   	}
    }     

    os = new ByteArrayOutputStream(); 
	 wb.write(os);

    byte[] fileContent = os.toByteArray();  
    return fileContent; 
}*/
