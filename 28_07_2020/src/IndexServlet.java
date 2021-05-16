import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.NumberFormatException;
@WebServlet("/index.html")
public class IndexServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		 int age = 0;
		 try
	        {
			  age = Integer.parseInt(req.getParameter("age"));
	        }
	        catch (NumberFormatException nfe)
	        {
	            System.out.println("received param is not a number");
	      
	        }
		req.setAttribute("title", "Nhận tham số dạng Get");
		req.setAttribute("name", name);
		req.setAttribute("Age", age);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
