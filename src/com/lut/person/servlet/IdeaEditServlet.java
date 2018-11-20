package com.lut.person.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lut.person.entity.Ideas;
import com.lut.person.entity.Users;
import com.lut.person.service.IdeaService;

/**
 * Servlet implementation class IdeaEditServlet
 */
@WebServlet("/IdeaEditServlet")
public class IdeaEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdeaEditServlet() {
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
		Users user  = (Users)request.getSession().getAttribute("user");
		String user_ID = user.getUser_ID();
		String message = request.getParameter("Ideas");
		Ideas idea = new Ideas(user_ID,message);
		IdeaService is = new IdeaService();
		int result = is.IdeaEdit(idea);
		if(result!=0){
			//成功
			out.print("<script>alert('Yes,Idea!');location.href='ideas.jsp'</script>");
		}else{
			//失败
			out.print("<script>alert('Idea,lost!');location.href='ideas.jsp'</script>");
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
