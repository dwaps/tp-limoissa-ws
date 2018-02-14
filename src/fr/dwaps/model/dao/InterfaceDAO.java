package fr.dwaps.model.dao;

import java.util.List;

import fr.dwaps.model.beans.Book;

public interface InterfaceDAO<T> {
	List<Book> findAll();
	Book find(int id);
	void delete(int id);
	void update(T obj);
	void create(T obj);
}
