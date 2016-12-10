package br.com.javaweb.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/logout")
public class LogoutComSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutComSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 HttpSession session = request.getSession();
	     session.removeAttribute("usuario.logado");
	     session.invalidate();
	     //response.sendRedirect("/WEB-INF/paginas/logout.html");
		
	     /*
	      * PROBLEMA:
	      * ----------------------------------------------------------------------------------
	      * Funciona, mas um resultado indesejado seja que ao efetuarmos um reload da 
	      * página, 
	      * uma atualização, um F5, um refresh, o usuário acessará a 
	      * página /logout.html, 
	      * sem passar pela lógica de logout. Queremos que o cliente continue na página 
	      * /logout pois se ele fizer refresh é para executar a lógica novamente.  
	      * 
	      * SOLUCAO:
	      * ----------------------------------------------------------------------------------
	      * 1) Sabemos que os arquivos dentro de WEB-INF ficam escondidos, 
	      * portanto criamos um 
	      *  diretório chamado WEB-INF/paginas. Movemos nosso logout.html.
	      * 
	      * 2) Agora alteramos nossa lógica para ao invés de notificar o cliente, fazer um forward no lado do servidor 
	      * atraves de um request dispatcher:
	      * 
	      */
	     
	     RequestDispatcher dispatcher = 
	    		 request.getRequestDispatcher
	    		 ("/WEB-INF/paginas/logout.html");
	     
	     /*
	      * 3) Vamos efetuar o forward
	      *  
	      */
	     dispatcher.forward(request, response);
				
					
	}

}
