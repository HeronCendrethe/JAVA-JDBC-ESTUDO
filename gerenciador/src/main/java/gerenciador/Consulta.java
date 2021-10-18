package gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("gerenciador/consulta")
public class Consulta extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
		String consulta = req.getParameter("consulta");
		PrintWriter pw = new PrintWriter(resp.getWriter());
		if(consulta.matches("Lucas") == true) {
			pw.println("Funcion�rio OK");
		}else {
			pw.println("N�o Encontrado!");
		}
	
	}

}
