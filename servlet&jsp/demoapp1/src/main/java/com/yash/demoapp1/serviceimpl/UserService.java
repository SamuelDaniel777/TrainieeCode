package com.yash.demoapp1.serviceimpl;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.yash.demoapp1.model.UserData;
import com.yash.demoapp1.service.User;
import com.yash.demoapp1.util.JdbcConnection;

import sun.jvm.hotspot.oops.ReturnTypeEntry;

public class UserService implements User {
	UserData ud=new UserData();
	
	@Override
	public void save(String emailString,String passString,String userString) throws SQLException, ClassNotFoundException  {
		
		ud.setEmailString(emailString);
		ud.setPassString(passString);
		ud.setUserNameString(userString);
		Connection con =JdbcConnection.connectDataBase();
		PreparedStatement pStatement=con.prepareStatement("insert into user(email,password,username) values(?,?,?)");
		pStatement.setString(1,ud.getEmailString());
		pStatement.setString(2,ud.getPassString());
		pStatement.setString(3,ud.getUserNameString());
		pStatement.executeUpdate();
		System.out.println("done");
	
	}

	@Override
	public boolean read(String uname,String pass)  {
		
		return true;
	}

	@Override
	public void updated() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
}
