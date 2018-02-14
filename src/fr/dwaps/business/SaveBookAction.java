package fr.dwaps.business;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

import fr.dwaps.model.beans.Book;
import fr.dwaps.model.dao.DAOFactory;
import fr.dwaps.web.util.AbstractAction;

public class SaveBookAction extends AbstractAction {
	
	@Override
	public void executeAction(HttpServletRequest request) {
		int id = super.getIdFromParameters(request);
		String json = request.getParameter("json");
		
		try {
			Book book = new Gson().fromJson(json, Book.class);
			
			if (id > -1) DAOFactory.getBookDAO().update(book);
			else DAOFactory.getBookDAO().create(book);
		}
		catch (Exception e) { e.printStackTrace(); }
	}
}
