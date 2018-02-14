package fr.dwaps.web.util;

public final class Constants {
	// Encoding
	public static final String APP_ENCODING = "UTF-8";
	
	// Servlets names
	public static final String SERVLET_NAME = "WSServlet";
	
	// Unit persistence
	public static final String PU_DB_LIMOISSA = "pu_limoissa";
	
	// Actions
	public static final String ACTION_BOOKS = "books";
	public static final String ACTION_BOOKS_DETAIL = "detail";
	public static final String ACTION_BOOKS_SAVE = "save";
	public static final String ACTION_BOOKS_DELETE = "delete";
	
	// URLs
	public static final String URL_BOOKS = "/"+ACTION_BOOKS;
	public static final String URL_BOOKS_DETAIL = URL_BOOKS+"/"+ACTION_BOOKS_DETAIL;
	public static final String URL_BOOKS_SAVE = URL_BOOKS+"/"+ACTION_BOOKS_SAVE;
	public static final String URL_BOOKS_DELETE = URL_BOOKS+"/"+ACTION_BOOKS_DELETE;
	
	private Constants() {}
}
