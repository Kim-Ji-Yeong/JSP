package com.koreait.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mod")
public class BoardModServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String no = request.getParameter("no");  
		int a = Integer.parseInt(no);
		
		BoardVO vo = Database.list.get(a);
		
		request.setAttribute("data",vo);
		String jsp = "/WEB-INF/jsp/mod.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //POST 방식 한글 깨짐현상 방지
		
		String no = request.getParameter("num");
		int a = Integer.parseInt(no);
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		
		//첫번 째 방법
		Database.list.get(a).setCtnt(ctnt);
		Database.list.get(a).setTitle(title);
		
		//---------------------------------------------------------
		
		//두번 째 방법
//		BoardVO vo = new BoardVO();
//		vo.setCtnt(ctnt);
//		vo.setTitle(title);
//		Database.list.set(a, vo);
		
		
		
		
		//디테일 화면으로 이동
		response.sendRedirect("/detail?no=" + no);
		
	}

}
