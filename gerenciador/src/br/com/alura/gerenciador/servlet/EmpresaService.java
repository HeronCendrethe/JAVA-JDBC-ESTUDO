package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class EmpresaService
 */
@WebServlet("/EmpresaService")
public class EmpresaService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
        String tipo = req.getHeader("accept");
        
        if(tipo.contains("xml")) {
        	
    	List<Empresa> empresa = new Banco().getEmpresas();    	
    	XStream xml = new XStream();   	
    	String printer = xml.toXML(empresa);    	
    	resp.setContentType("application/xml");   	
    	resp.getWriter().print(printer);
    	
        }else if(tipo.contains("json")) {
        	
	    List<Empresa> empresa = new Banco().getEmpresas();	    
      	Gson gson = new Gson();      	
	    String json = gson.toJson(empresa);	    
	    resp.setContentType("application/json");    
      	resp.getWriter().print(json);
      	
        }else {
        	
        	resp.setContentType("application/json");
        	resp.getWriter().print("{message: type not found}");
        }
    	
    	
    	
;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
