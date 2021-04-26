package com.koreait.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class BoardSevlet extends HttpServlet { //class명은 상관없지만 상속은 받아야함
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String jsp = "/WEB-INF/jsp/list.jsp";	
//		RequestDispatcher rd = request.getRequestDispatcher(jsp);
//		rd.forward(request, response);
		//--------------------------------------------------------
//		request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
		
		
		
		request.setAttribute("data", Database.list);
		
		String jsp = "/WEB-INF/jsp/list.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		
		//		doGet(request, response);
		
	}
}
