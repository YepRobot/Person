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
		String password = request.getParameter("userId");
		String userId = request.getParameter("userPassword");
		int userage = Integer.parseInt(request.getParameter("userAge"));
		int usergender = Integer.parseInt(request.getParameter("userGender"));
		

		UserService us = new UserService();

		Users user = new Users();
		user = us.EditStu(userId, username, password, usergender, userage);
		if (user != null) {
			out.print("<script>alert('修改学生信息成功!');location.href='EditStu.jsp'</script>");
			request.setAttribute("users", user);
		    request.getRequestDispatcher("EditStu.jsp").forward(request, response);
		
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
