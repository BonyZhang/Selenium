package com.testngjunitdemo;

public class OppoCom {

	public static void main()
	{
		System.out.print("aa");
	}
	
	public class Test_clik
	{
		
		//public Test_clik(){}
		public boolean oppo_com01()
		{
			boolean Result=false;
			System.out.println("我在运行......A");
			return Result; 
		}
		public int oppo_com02()
		{
			int  Result=0;
			System.out.println("我在运行......B");
			return  Result;
		}
		public String oppo_com03()
		{
			String Result="no";
			System.out.println("我在运行......C");
			return Result;
		}
	}
}
