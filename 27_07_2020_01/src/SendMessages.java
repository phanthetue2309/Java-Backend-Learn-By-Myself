import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/message.html")
public class SendMessages extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = "doGet call";
		req.setAttribute("First", msg); // name : Value
		req.getRequestDispatcher("message.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = "doGott call";
		req.setAttribute("First", msg); // name : Value
		req.getRequestDispatcher("message.jsp").forward(req, resp);
	}
}


