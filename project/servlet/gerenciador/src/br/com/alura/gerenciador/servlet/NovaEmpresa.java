package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresa
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		PrintWriter out = response.getWriter();
		
		// Recebe parametro nomeFantasia pela url.
		String nomeEmpresa = request.getParameter("nomeFantasia");
		String dataAbertura = request.getParameter("dataAberturaEmpresa");
		
		Date dateOpen= null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dateOpen = sdf.parse(dataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNomeEmpresa(nomeEmpresa);
		empresa.setDataAbertura(dateOpen);
		
		Banco banco = new Banco();
		banco.adicionar(empresa);
		
		// Para redirecionar pelo navegador
		response.sendRedirect("listaEmpresas");
		
		// Chama arquivo JSP
		//RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
		// envia parametro para pagina JSP
		//request.setAttribute("empresa", empresa.getNomeEmpresa());
		//	rd.forward(request, response);		
	}

}
