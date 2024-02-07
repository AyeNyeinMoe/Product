package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import model.ProductSetGet;

public class Product {
	
	public List<ProductSetGet> getAllProduct(){
		List<ProductSetGet> product=new ArrayList();
	Connection con;
	Statement stm;
	ResultSet rs;
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		try {
		con=DriverManager.getConnection("jdbc:mysql://localhost/info","root","root");
		stm=con.createStatement();
		String sql;
		sql="select * from productInfo";
		rs=stm.executeQuery(sql);
		int pr=0,qt=0,id1=0;
		String na="",date1="";
		while(rs.next()) {
			
	  product.add(new ProductSetGet(rs.getInt("id"),rs.getString("name"),rs.getInt("price"),rs.getInt("qty"),rs.getString("date")));
		}
		stm.close();
		con.close();
	
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	
  }
	
	return product;
}

	
}