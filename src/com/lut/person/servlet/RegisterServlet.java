package com.lut.person.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import com.lut.person.entity.Users;
import com.lut.person.service.UserService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("userName");
		String password = request.getParameter("userId");
		String userId = request.getParameter("userId");
		int userage = Integer.parseInt(request.getParameter("userAge"));
		int usergender = Integer.parseInt(request.getParameter("userGender"));
		int power = Integer.parseInt(request.getParameter("power"));
		
		
		UserService us = new UserService();
		
		Users user = new Users(userId, username , password, usergender, userage, power);
		int result = us.regist(user);
		if(result!=0){
			//成功
			out.print("<script>alert('添加用户信息成功!');location.href='regist.jsp'</script>");
		}else{
			//失败
			out.print("<script>alert('添加用户信息失败!');location.href='regist.jsp'</script>");
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
