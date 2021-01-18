package org.edwith.webbe.cardmanager.dao;

import org.edwith.webbe.cardmanager.dto.BusinessCard;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BusinessCardManagerDao {
	private static String dburl = "jdbc:mysql://localhost:3306/project_a?serverTimezone=Asia/Seoul&useSSL=false";
	private static String dbuser = "projectuser";
	private static String dbpassword = "projuser123!@#";
	
    public List<BusinessCard> searchBusinessCard(String keyword){

    	List<BusinessCard> list = new ArrayList<BusinessCard>();
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    	
    	String sql = "SELECT * FROM card WHERE name LIKE ?";
    	
    	try( Connection conn = DriverManager.getConnection( dburl, dbuser, dbpassword );
    			PreparedStatement ps = conn.prepareStatement(sql)){
    		
    		ps.setString(1, '%'+keyword+'%');
    		
    		try( ResultSet rs = ps.executeQuery()){
    			
    			while(rs.next()) {
    				String name = rs.getString(1);
    				String phone = rs.getString(2);
    				String company = rs.getString(3);
    				Date date = rs.getDate(4);
    				BusinessCard card = new BusinessCard(name, phone, company, date);
    				list.add(card);
    			}
    			
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return list;
    }

    public BusinessCard addBusinessCard(BusinessCard businessCard){

    	BusinessCard insertCard = null;
    	int insertCount = 0;
    	Connection conn = null;
    	PreparedStatement ps = null;
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection( dburl, dbuser, dbpassword );
			
			String sql = "INSERT INTO card VALUES ( ?, ?, ?, ? )";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, businessCard.getName());
			ps.setString(2, businessCard.getPhone());
			ps.setString(3, businessCard.getCompanyName());
			ps.setDate(4, businessCard.getCreateDate());
			
			insertCount = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
    	
    	
    	return insertCard;
    }
}
