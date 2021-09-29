package com.yash.demoapp1.service;

import java.sql.SQLException;

public interface User {
	
	 void save(String e,String p,String u) throws Exception;
	 boolean read(String u,String p)throws Exception;
	 void updated();
	 void delete();
	 
}
