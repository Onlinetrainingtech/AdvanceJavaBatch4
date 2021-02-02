

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		PrintWriter out=resp.getWriter();
		
		if(email.equals("azar@gmail.com")&&pass.equals("azar"))
		{
			RequestDispatcher dis=req.getRequestDispatcher("sucess.jsp");
			dis.forward(req, resp);
			//out.println("LoginSucess..");
		}
		else
		{
			RequestDispatcher dis=req.getRequestDispatcher("error.jsp");
			dis.include(req, resp);
			//out.println("LoginFail..");
		}
		
		//out.println("Your Email is::"+email+"Your Password::"+pass);
	}

}
