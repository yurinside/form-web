import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		PrintWriter sa�da = res.getWriter();
		sa�da.println("<html>");
		sa�da.println("<body>Ol� Mundo do Servlet "+nome+"</body>");
		sa�da.println("</html>");
	}
	
} 
