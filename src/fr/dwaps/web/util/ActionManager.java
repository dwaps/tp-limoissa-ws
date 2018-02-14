package fr.dwaps.web.util;

import java.util.HashMap;
import java.util.Map;
import static fr.dwaps.web.util.Constants.*;

import javax.servlet.http.HttpServletRequest;

import fr.dwaps.business.DeleteBookAction;
import fr.dwaps.business.GetBookAction;
import fr.dwaps.business.ListBooksAction;
import fr.dwaps.business.SaveBookAction;

public final class ActionManager {
	private static Map<String, AbstractAction> actions = new HashMap<>();
	
	static {
		actions.put(ACTION_BOOKS, new ListBooksAction());
		actions.put(ACTION_BOOKS_DETAIL, new GetBookAction());
		actions.put(ACTION_BOOKS_SAVE, new SaveBookAction());
		actions.put(ACTION_BOOKS_DELETE, new DeleteBookAction());
	}
	
	public static AbstractAction getAction(String action) {
		return actions.get(action);
	}
	
	public static String getActionName(HttpServletRequest request) {
		String uri = request.getRequestURI();
		return uri.substring(uri.lastIndexOf("/")+1);
	}
	
	private ActionManager() {}
}
