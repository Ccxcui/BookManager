package com.ccx.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 数据库工具类
 * @author dell
 *
 */

public class Dbutil {
	private String dbUrl="jdbc:mysql://localhost:3308/db_book?useSSL=false&serverTimezone=UTC";//数据库连接地址
	private String dbUserName="root";
	private String dbPassWord="1234";
	private String jdbcName="com.mysql.cj.jdbc.Driver";//驱动名称
	
	
	//获取数据库连接
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);//反射加载一下类名字
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);
		return con;
	}
	
	//关闭数据库连接
	public void closeCon(Connection con) throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {//main alt+/
		Dbutil dbutil=new Dbutil();
		try {
			dbutil.getCon();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}		
	}

}
