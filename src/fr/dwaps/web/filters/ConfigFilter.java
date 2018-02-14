package fr.dwaps.web.filters;

import static fr.dwaps.web.util.Constants.APP_ENCODING;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import fr.dwaps.web.util.Constants;

@WebFilter(servletNames=Constants.SERVLET_NAME)
public class ConfigFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("application/json; charset=" + APP_ENCODING);
		response.setCharacterEncoding(Constants.APP_ENCODING);
		request.setCharacterEncoding(Constants.APP_ENCODING);
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {}
	public void destroy() {}
}
