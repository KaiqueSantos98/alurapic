package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Mapeamento do Servlet
@WebServlet(urlPatterns="/servlet")
public class OiMundo extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		PrintWriter out = resp.getWriter();
		
		// retorno pro browser.
		
		out.println("<html>");
		out.println("<body>");
		out.println("Seja bem vindo! ao meu mundo");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Está funcionado .. ");
	}
}
