package com.koreait.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/write")
public class BoardWriteSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/jsp/write.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //POST 방식 한글 깨짐현상 방지
		
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setCtnt(ctnt);
		
		Database.list.add(vo);
		
		response.sendRedirect("/list");  //Get 방식으로 주소이동쓰~~
		
		
	}

}