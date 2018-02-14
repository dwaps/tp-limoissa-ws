package fr.dwaps.web.servlets;

import static fr.dwaps.web.util.Constants.SERVLET_NAME;
import static fr.dwaps.web.util.Constants.URL_BOOKS;
import static fr.dwaps.web.util.Constants.URL_BOOKS_DELETE;
import static fr.dwaps.web.util.Constants.URL_BOOKS_DETAIL;
import static fr.dwaps.web.util.Constants.URL_BOOKS_SAVE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.dwaps.web.util.ActionManager;

@WebServlet(
	name=SERVLET_NAME,
	urlPatterns={
		URL_BOOKS,
		URL_BOOKS_DETAIL,
		URL_BOOKS_SAVE,
		URL_BOOKS_DELETE })
public class WSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String actionName = ActionManager.getActionName(request);
		ActionManager.getAction(actionName).executeAction(request);
		
		PrintWriter out = response.getWriter();
		String json = (String) request.getAttribute("json");
		if (json != null) out.print(json);
		out.flush();
		out.close();
	}
}
