package com.jdbc.dao;

import com.jdbc.entity.Product;
import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;



/**
 *
 * 
 */
public class ProductDAO implements Serializable{
 //   @Resource(mappedName="jdbc/myPoolingResource")
    
    public void saveProduct(Product product)
    {
        List<Product> productList= new ArrayList<Product>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3309/lg","root","123456");  
			
	    PreparedStatement ps=con.prepareStatement("insert into lg.workers values(?,?)");  
            ps.setInt(1, product.getId());
            ps.setString(2, product.getName());
            int row=ps.executeUpdate();
            
        } catch (Exception e)
        {
            System.out.println("EXCEPTION");
        }
    }
        
}