import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String loginV = "yuri@gmail.com";
		String senhaV = "01@10";
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		PrintWriter sa�da = res.getWriter();
		sa�da.println("<html>");
		
		if(login.equals(loginV) && senha.equals(senhaV)) {
			sa�da.println("Acesso Aprovado");
		}else {
			sa�da.println("Acesso Reprovado");
		}
		
		sa�da.println("</html>");
	
	}
}
