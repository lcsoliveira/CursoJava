package br.com.javaweb.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/filtrocookie")
public class FiltroDeAuditoriaUsandoCookie implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		HttpServletResponse resp = (HttpServletResponse) response;

		Cookie cookie = getUsuario(req);
		String usuario = "<deslogado>";

		if (cookie != null) {
			// Aqui aumentamos o tempo de vida do cookie, até mesmo depois de
			// fechar o navegador
			// E também estamos revalidando o cookie a cada dez minutos
			cookie.setMaxAge(60 * 10);
			resp.addCookie(cookie);
			usuario = cookie.getValue();
		}

		System.out.println("Usuario " + usuario + " acessando a URI " + req.getRequestURI());

		// Continua processando o request, se tirar está linha o processamento
		// para
		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	private Cookie getUsuario(HttpServletRequest req) {

		Cookie[] cookies = req.getCookies();

		if (cookies == null) {
			return null;
		}

		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("usuario.logado")) {
				return cookie;
			}
		}
		return null;
	}

}
