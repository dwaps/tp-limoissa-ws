package fr.dwaps.business;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

import fr.dwaps.model.beans.Book;
import fr.dwaps.model.dao.DAOFactory;
import fr.dwaps.web.util.AbstractAction;

public class GetBookAction extends AbstractAction {
	
	@Override
	public void executeAction(HttpServletRequest request) {
		int id = super.getIdFromParameters(request);
		
		try {
			Book book = DAOFactory.getBookDAO().find(id);
			if (book != null)
				request.setAttribute("json", new Gson().toJson(book));
		}
		catch (Exception e) { e.printStackTrace(); }
	}
}
