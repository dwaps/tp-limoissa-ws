package fr.dwaps.web.util;

import javax.servlet.http.HttpServletRequest;

public abstract class AbstractAction {
	public abstract void executeAction(HttpServletRequest request);
	
	protected int getIdFromParameters(HttpServletRequest request) {
		String idStr = request.getParameter("id");
		
		try { return Integer.parseInt(idStr); }
		catch (NumberFormatException e) { return -1; }
	}
}