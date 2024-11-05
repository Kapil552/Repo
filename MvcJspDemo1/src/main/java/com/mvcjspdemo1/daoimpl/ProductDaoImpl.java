package com.mvcjspdemo1.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mvcjspdemo1.dao.DbConnection;
import com.mvcjspdemo1.dao.ProductDao;
import com.mvcjspdemo1.pojo.Product;

public class ProductDaoImpl implements ProductDao{
	
	@Override
	public List<Product> getAllProducts(){
		List<Product> lst=new ArrayList<>();
		try (Connection con=DbConnection.getDatabaseConnection()){
			PreparedStatement pst=con.prepareStatement("select * from product");
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				
				Product product=new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setId(rs.getInt("price"));
				lst.add(product);
			}
			return lst;
		}catch(SQLException|NullPointerException exc) {
			exc.printStackTrace();
			lst.clear();
			return lst;
		}
	}
}
