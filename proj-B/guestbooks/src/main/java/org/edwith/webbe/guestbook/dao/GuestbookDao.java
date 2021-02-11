package org.edwith.webbe.guestbook.dao;

import org.edwith.webbe.guestbook.dto.Guestbook;
import org.edwith.webbe.guestbook.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class GuestbookDao {
    public List<Guestbook> getGuestbooks(){
        List<Guestbook> list = new ArrayList<>();

        Connection conn = DBUtil.getConnection("jdbc:mysql://localhost:3306/project_b?serverTimezone=Asia/Seoul&useSSL=false&useUnicode=yes&characterEncoding=UTF-8",
        		"projectuser","projuser123!@#");
        
        String sql = "SELECT * FROM guestbook";
        
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
        	
        	try( ResultSet rs = ps.executeQuery()){
        		while(rs.next()) {
        			Long id = rs.getLong(1);
        			String name = rs.getString(2);
        			String content = rs.getString(3);
        			Date regdate = rs.getDate(4);
        			Guestbook gb = new Guestbook(id, name, content, regdate);
        			list.add(gb);
        		}
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
        	
        } catch (Exception e) {
        	e.printStackTrace();
        }

        return list;
    }

    public void addGuestbook(Guestbook guestbook){
//    	Connection conn = DBUtil.getConnection();
    	Connection conn = DBUtil.getConnection("jdbc:mysql://localhost:3306/project_b?serverTimezone=Asia/Seoul&useSSL=false&useUnicode=yes&characterEncoding=UTF-8",
        		"projectuser","projuser123!@#");
        PreparedStatement ps = null;
        
        String sql = "INSERT INTO guestbook (name, content, regdate) VALUES (?,?,?)";
        
        try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, guestbook.getName());
			ps.setString(2, guestbook.getContent());
			ps.setDate(3, guestbook.getRegdate());
			
			System.out.println(guestbook.getContent());
			
			ps.executeUpdate();
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
		}    }
}
