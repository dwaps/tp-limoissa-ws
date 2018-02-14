package fr.dwaps.business;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;

import fr.dwaps.model.beans.Book;
import fr.dwaps.model.dao.DAOFactory;
import fr.dwaps.web.util.AbstractAction;

public class ListBooksAction extends AbstractAction {
	
	@Override
	public void executeAction(HttpServletRequest request) {
		List<Book> books = DAOFactory.getBookDAO().findAll();
		String json = new Gson().toJson(books);
		request.setAttribute("json", json);
	}
}
