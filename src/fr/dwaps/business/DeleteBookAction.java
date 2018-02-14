package fr.dwaps.business;

import javax.servlet.http.HttpServletRequest;

import fr.dwaps.model.dao.DAOFactory;
import fr.dwaps.web.util.AbstractAction;

public class DeleteBookAction extends AbstractAction {

	@Override
	public void executeAction(HttpServletRequest request) {
		int id = super.getIdFromParameters(request);
		
		try { DAOFactory.getBookDAO().delete(id); }
		catch (Exception e) { e.printStackTrace(); }
	}

}
