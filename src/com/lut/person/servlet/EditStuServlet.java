package com.lut.person.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lut.person.entity.Users;
import com.lut.person.service.UserService;
import com.mysql.cj.xdevapi.Result;

/**
 * Servlet implementation class EditStuServlet
 */
@WebServlet("/EditStuServlet")
public class EditStuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditStuServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("userName");
		String password = request.getParameter("userPassword");
		String userId = request.getParameter("userId");
		int userage = Integer.parseInt(request.getParameter("userAge"));
		
		

		UserService us = new UserService();

		Users user = new Users();
		int result = us.EditStu(userId, username, password, userage);
        user = us.serchUserId(userId);
		
		
		
		if(result != 0){
			request.setAttribute("users", user);
		    request.getRequestDispatcher("EditStu.jsp").forward(request, response);;
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
