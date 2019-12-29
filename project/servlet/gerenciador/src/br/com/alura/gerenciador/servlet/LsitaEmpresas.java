package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ListaEmpresas", urlPatterns = { "/listaEmpresas" })
public class LsitaEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		Banco lista = new Banco();
		List<Empresa> listaDeEmpresasCadastradas = lista.getEmpresaList();
		
		for(Empresa lis : lista.getEmpresaList()) {
			System.out.println("nome");
			System.out.println(lis.getNomeEmpresa());
		}
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresa.jsp");
		
		request.setAttribute("listaEmpresa", listaDeEmpresasCadastradas);		
		
		rd.forward(request, response);
	}

}
