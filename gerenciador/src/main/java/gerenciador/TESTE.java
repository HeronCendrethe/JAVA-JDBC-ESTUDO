package gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oi")
public class TESTE extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		PrintWriter pw = new PrintWriter (resp.getWriter());
		if(login.matches("heron")== true && senha.matches("1234") == true){
			
			pw.write("Usuario logado");
			
		}else {
			pw.write("Credenciais Inválidas");
		}
		
	
		
		
	
		
		
	}
	


}
