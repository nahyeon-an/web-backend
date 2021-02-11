package org.edwith.webbe.guestbook.servlet;

import org.edwith.webbe.guestbook.dao.GuestbookDao;
import org.edwith.webbe.guestbook.dto.Guestbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/guestbooks/write")
public class GuestbookWriteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	GuestbookDao dao = new GuestbookDao();
    	
    	response.setContentType("text/html");
		String name = new String(request.getParameter("name").getBytes("8859_1"), "UTF-8");
		String content = new String(request.getParameter("content").getBytes("8859_1"), "UTF-8");
				
		dao.addGuestbook(new Guestbook(name, content));
		
		response.sendRedirect("/guestbooks/guestbooks");    
	}

}
