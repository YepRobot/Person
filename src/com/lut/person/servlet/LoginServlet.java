package com.lut.person.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lut.person.entity.Users;
import com.lut.person.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserService us = new UserService();
		Users user = us.login(name, password);
		
		if(user==null){
			//失败  ()
			request.setAttribute("msg", "用户名或密码错误！");  //客户
			//转发(跳转页面)  a.jsp    b.jsp   c.jsp
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("user", user);   //服务器
			//成功
			request.getRequestDispatcher("index.html").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
