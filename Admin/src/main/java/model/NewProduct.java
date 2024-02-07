package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewProduct {

	public ProductSetGet getProdcutInfo(int id,String name,int price,int qty,String date) {
	ProductSetGet item=new ProductSetGet();
	Connection con;
	Statement st;
	ResultSet rs;
	System.out.println("New project");
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/info","root","root");
			st=con.createStatement();
			String sQl;
			
			sQl="insert into productinfo values("+id+",'"+name+"',"+price+","+qty+",'"+date+"');";
			
			System.out.println("SQl = "+sQl);
			st.executeUpdate(sQl);
			System.out.println("Query Successful!");
			int id1,price1,qty1;
			String name1,date1;
			String a="select * from bookreg where ID="+id;
			rs=st.executeQuery(a);
			 System.out.println("ID"+a);
	    	while(rs.next()) {
				 id1=rs.getInt("ID");
				 name1=rs.getString("name"); 
				 price1=rs.getInt("price");
				 qty1=rs.getInt("qty"); 
				 date1=rs.getString("date");
			 
	    
		item.setId(id1);
		item.setName(name1);
		item.setPrice(price1);
		item.setQty(qty1);
		item.setDate(date1);
	    	}
			}
			catch(SQLException e) {
					System.out.println("Error");
					e.printStackTrace();
					
				}
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		
			
	return item;
	}
}
