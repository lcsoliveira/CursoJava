package br.com.javaweb.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Empresa;
import br.com.javaweb.gerenciador.dao.EmpresaDAO;

/**
 * Servlet implementation class BuscaEmpresa
 */
@WebServlet("/busca") // Aqui estamos definindo qual é a URI da service
public class BuscaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// String filtro;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BuscaEmpresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		super.init();

		System.out.println("Inicializando a Servlet " + this);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destruindo a Servlet" + this);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String filtro = request.getParameter("filtro");

		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		
		request.setAttribute("empresas", empresas);
		
		request.getRequestDispatcher("/WEB-INF/paginas/busca.jsp").forward(request, response);
		
		
		
		
		
		
		// Fazendo a thread dormir

		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// StringBuffer html = new StringBuffer();
		//
		// html.append("<html>");
		// html.append("<body>");
		// html.append("Resultado da busca: <br/>");
		// html.append("</body>");
		// html.append("</html>");
		//
		// html.append("<ul>");
		//
		// for (Empresa empresa : empresas) {
		// html.append("<li>" + empresa.getId() + ": " + empresa.getNome() +
		// "</li>");
		// }
		//
		// html.append("</ul>");
		//
		// html.append("</body>");
		// html.append("</html>");
		//
		// PrintWriter out = response.getWriter();
		// out.println(html);
		//
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
