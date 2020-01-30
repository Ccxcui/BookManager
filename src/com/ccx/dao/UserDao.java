package com.ccx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ccx.model.User;

/**
 * 用户Dao类
 * @author dell
 *
 */
public class UserDao {
	/**
	 * 登陆验证
	 * @param con
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login(Connection con,User user) throws Exception{	//user是从界面封装好的实体
		User resultUser=null;
		String sql="select * from t_user where userName = ? and password = ?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,user.getUserName());
		pstmt.setString(2,user.getPassword());//设置？
		ResultSet rs=pstmt.executeQuery();//执行sql语句,返回结果集 ctl+shift+o
		if(rs.next()) {//判断是否有结果集,进行实例化
			resultUser=new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassword("password");
		}
		return resultUser;
	}
}
